package menu;

import model.Car;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class OperationsImpl implements Operations {

    public void exit() {
        System.exit(0);
    }

    public void show(List<Car> cars) {
        cars.forEach(System.out::println);
    }


    public boolean save(List<Car> cars, String filename) {
        File file = new File(filename);

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("Exception: File cannot created");
            }
        }


        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write("Id,Model,Graduation Year,Costs,Registration Number\n");
            cars.forEach(car -> {
                try {
                    writer.write(car.getCarId() + "," +
                            car.getCarModel() + "," +
                            car.getCarGraduationYear() + "," +
                            car.getCarCosts() + "," +
                            car.getCarRegistrationNumber() + "\n");
                } catch (IOException e) {
                    System.out.println("Exception: Not recorded");
                }
            });

        } catch (IOException e) {
            System.out.println("Exception: Not recorded");
            return false;
        }
        System.out.println("Cars saved.");
        return true;
    }

    public List<Car> load(String filename) {

        File file = new File(filename);
        List<Car> cars = new ArrayList<>();
        if (!file.exists()) {
            return cars;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            reader.readLine();
            String line;
            while ((line = reader.readLine()) != null) {
                String[] params = line.split(",");
                cars.add(new Car.CarBuilder()
                        .setCarId(Long.parseLong(params[0]))
                        .setCarModel(params[1])
                        .setCarGraduationYear(Integer.parseInt(params[2]))
                        .setCarCosts(Double.parseDouble(params[3]))
                        .setCarRegistrationNumber(params[4])
                        .build());
            }
        } catch (IOException e) {
            System.out.println("Exception: cannot to load");
        }
        System.out.println("Cars loaded.");
        return cars;
    }

    @Override
    public List<Car> find(List<Car> cars, String value) {
        return cars.stream().filter(car -> carCompare(car, value)).collect(Collectors.toList());
    }


//    a
    @Override
    public List<Car> sortCarsByYear(List<Car> cars, String model) {
        return cars.stream().filter(car -> car.getCarModel().toLowerCase().contains(model.toLowerCase())).sorted((o1, o2) -> Integer.compare(o2.getCarGraduationYear(), o1.getCarGraduationYear())).collect(Collectors.toList());
    }

//    b
    @Override
    public List<Car> findCarsByYearExplanation(List<Car> cars, String model, int yearsNumber) {
        return cars.stream().filter(car -> car.getCarModel().toLowerCase().contains(model.toLowerCase())).filter(car -> 2021 - car.getCarGraduationYear() > yearsNumber).collect(Collectors.toList());
    }

//    c
    @Override
    public List<Car> findCarsByYearAndCostsMore(List<Car> cars, int year, double costs) {
        return cars.stream().filter(car -> car.getCarGraduationYear() == year).filter(car -> car.getCarCosts() >= costs).collect(Collectors.toList());
    }

//    d
    @Override
    public List<Car> sortCarsByCostsLessAndYearMore(List<Car> cars) {
        return cars.stream().sorted((o1, o2) -> {
            int compare = Double.compare(o1.getCarCosts(), o2.getCarCosts());
            if (compare == 0) return Integer.compare(o1.getCarGraduationYear(), o2.getCarGraduationYear());
            else return compare;
        }).collect(Collectors.toList());
    }

//    e
    @Override
    public List<Car> findCarsIsRegistered(List<Car> cars) {
        return null;
    }

//    f
    @Override
    public List<Car> sortCarsByModel(List<Car> cars) {
        return cars.stream().sorted(Comparator.comparing(o -> o.getCarModel().toLowerCase())).collect(Collectors.toList());
    }

    private boolean carCompare(Car car, String value) {
        return String.valueOf(car.getCarId()).contains(value) ||
                car.getCarModel().contains(value) ||
                String.valueOf(car.getCarGraduationYear()).contains(value) ||
                String.valueOf(car.getCarCosts()).contains(value) ||
                car.getCarRegistrationNumber().contains(value);
    }


}

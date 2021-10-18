package menu;

import model.Car;

import java.io.*;
import java.util.ArrayList;
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
                        .setCarGraduationYear(params[2])
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

    public List<Car> find(List<Car> cars, String value) {
        return cars.stream().filter(car -> carCompare(car, value)).collect(Collectors.toList());
    }

    private boolean carCompare(Car car, String value) {
        return String.valueOf(car.getCarId()).contains(value) ||
                car.getCarModel().contains(value) ||
                car.getCarGraduationYear().contains(value) ||
                String.valueOf(car.getCarCosts()).contains(value) ||
                car.getCarRegistrationNumber().contains(value);
    }
}

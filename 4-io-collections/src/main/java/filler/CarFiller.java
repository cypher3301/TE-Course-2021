package filler;

import model.Car;

import java.util.Collection;
import java.util.Random;

public class CarFiller {

    public CarFiller() {
    }

    public Car fillCar() {
        Random random = new Random();
        return new Car.CarBuilder()
                .setCarId(random.nextInt())
                .setCarModel(String.valueOf(random.nextInt()%random.nextInt()%24))
                .setCarGraduationYear(String.valueOf(random.nextInt()%2020))
                .setCarCosts(random.nextInt()%2500000)
                .setCarRegistrationNumber(String.valueOf(random.nextInt()%8))
                .build();
    }

    public Collection<Car> fillCars(Collection<Car> cars, int size) {
        while (cars.size()<size){
            cars.add(fillCar());
        }
        return cars;
    }
}

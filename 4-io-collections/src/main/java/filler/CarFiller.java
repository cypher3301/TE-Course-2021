package filler;

import model.Car;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class CarFiller {

    public CarFiller() {
    }

    public Car fillCar() {
        Random random = new Random();
        return new Car.CarBuilder()
                .setCarId(Math.abs(random.nextInt()))
                .setCarModel(String.valueOf(Math.abs(random.nextInt()%Math.abs(random.nextInt()%24))))
                .setCarGraduationYear(String.valueOf(Math.abs(random.nextInt())%70+1950))
                .setCarCosts(Math.abs(random.nextInt()%2500000))
                .setCarRegistrationNumber(String.valueOf(Math.abs(random.nextInt()%9999)))
                .build();
    }

    public Collection<Car> fillCars(Collection<Car> cars, int size) {
        while (cars.size()<size){
            cars.add(fillCar());
        }
        return cars;
    }


    public Collection<Car> fillCars() {
        Random random = new Random();
        int size = Math.abs(random.nextInt(100));
        Collection<Car> cars = new ArrayList<>();
        while (cars.size()<size){
            cars.add(fillCar());
        }
        return cars;
    }


}

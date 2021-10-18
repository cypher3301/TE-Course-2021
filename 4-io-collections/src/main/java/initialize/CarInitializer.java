package initialize;

import filler.CarFiller;
import model.Car;

import java.util.ArrayList;
import java.util.Collection;

public class CarInitializer implements Initialize {
    private CarFiller carFiller;
    private Collection<Car> cars;



    public CarInitializer(CarFiller carFiller) {
        this.carFiller = carFiller;
    }

    @Override
    public void init() {
        this.cars = carFiller.fillCars(new ArrayList<>(), 25);
    }

    public Collection<Car> getCars() {
        return cars;
    }
}

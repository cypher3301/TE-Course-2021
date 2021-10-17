package model;

import java.util.Collection;
import java.util.List;

public class Cars {
    Collection<Car> cars;

    public Cars(Collection<Car> cars) {
        this.cars = cars;
    }

    public Cars() {
    }

    public Collection<Car> getCars() {
        return cars;
    }

    public void setCars(Collection<Car> cars) {
        this.cars = cars;
    }
}

package menu;

import model.Car;

import java.util.List;

public interface Operations {
    void exit();

    void show(List<Car> cars);

    boolean save(List<Car> cars, String filename);

    List<Car> find(List<Car> cars, String value);

    List<Car> load(String filename);


}

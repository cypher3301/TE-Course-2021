package menu;

import model.Car;

import java.util.List;

public interface Operations {
    void exit();

    void show(List<Car> cars);

    boolean save(List<Car> cars, String filename);

    List<Car> find(List<Car> cars, String value);
    List<Car> load(String filename);


    List<Car> sortCarsByYear(List<Car> cars, String model);
    List<Car> findCarsByYearExplanation(List<Car> cars, String model, int yearsNumber);
    List<Car> findCarsByYearAndCostsMore(List<Car> cars, int year, double costs);
    List<Car> sortCarsByCostsLessAndYearMore(List<Car> cars);
    List<Car> findCarsIsRegistered(List<Car> cars);
    List<Car> sortCarsByModel(List<Car> cars);




}

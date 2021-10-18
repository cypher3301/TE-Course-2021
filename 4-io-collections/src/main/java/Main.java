import filler.CarFiller;
import initialize.CarInitializer;
import menu.CarConsoleInterface;
import menu.CarInterface;
import menu.Operations;
import menu.OperationsImpl;
import model.Car;

import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        new Main().init();
    }

    private void init() {
        CarFiller carFiller = new CarFiller();
        CarInitializer carInitializer = new CarInitializer(carFiller);
        carInitializer.init();
        Collection<Car> cars = carInitializer.getCars();
        Operations operations = new OperationsImpl();
        CarInterface carInterface = new CarConsoleInterface(operations, (List) cars);
        carInterface.show();

    }
}

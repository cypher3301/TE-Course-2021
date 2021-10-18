package menu;

import model.Car;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CarConsoleInterface implements CarInterface {
    private static Map<String, String> menuPanel = new HashMap<>();
    private final Operations operations;
    private List<Car> cars;

    public CarConsoleInterface(Operations operations, List<Car> cars) {
        this.operations = operations;
        this.cars = cars;
    }

    @Override
    public void show() {
        setUp();
    }

    protected void setUp() {
        menuPanel.put("0", "Exit");
        menuPanel.put("1", "Show all cars");
        menuPanel.put("2", "Save cars to file");
        menuPanel.put("3", "Find cars");
        menuPanel.put("4", "Load cars from file");

        printMenuPanel();
    }

    protected String input(String message) {
        System.out.println(message);
        return new Scanner(System.in).nextLine();
    }

    protected void control(String input) {
        String filename;
        switch (input) {
            case "0":
                System.out.println("Exit.");
                operations.exit();
            case "1":
                System.out.println("All cars:");
                operations.show(cars);
                System.out.println("============================================");
                break;
            case "2":
                System.out.println("Cars saving...");
                filename = input("Enter file name ->:");
                operations.save(cars, filename);
                System.out.println("Cars saved to '" + filename + "'");
                System.out.println("============================================");
                break;
            case "3":
                System.out.println("Found:");
                operations.show(
                        operations.find(
                                cars,
                                input("Enter value ->:")));
                System.out.println("============================================");
                break;
            case "4":
                System.out.println("Cars loading...");
                filename = input("Enter file name ->:");
                this.cars = operations.load(filename);
                System.out.println("Cars loaded from '" + filename + "'");
                System.out.println("============================================");
                break;
            case "5":
                System.out.println("Show menu");
                printMenuPanel();
                break;
            default:
                System.out.println("Not correct input value.\nEnter '5' to show menu");
        }
        control(input("Enter->:"));
    }

    protected void printMenuPanel() {
        System.out.println("Menu:");
        menuPanel.forEach((key, value) -> System.out.println("[" + key + "]: " + value));
        control(input("Enter->:"));
    }

    protected void setMenuPanel(Map<String, String> panel) {
        menuPanel = panel;
    }
}



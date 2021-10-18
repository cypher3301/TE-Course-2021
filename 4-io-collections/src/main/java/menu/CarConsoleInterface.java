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
        menuPanel.put("0", "Выход");
        menuPanel.put("1", "Показать меню");
        menuPanel.put("2", "Показать все машины");
        menuPanel.put("3", "Сохранить все машины в файл");
        menuPanel.put("4", "Найти машины по значению");
        menuPanel.put("5", "Загрузить машины из файла");
        menuPanel.put("6", "список автомобілів заданої моделі в порядку зростання року випуску");
        menuPanel.put("7", "список автомобілів заданої моделі, які експлуатуються більше n років");
        menuPanel.put("8", "список автомобілів заданого року випуску, ціна яких більше вказаної");
        menuPanel.put("9", "список автомобілів в порядку спадання ціни. Якщо ціна однакова, то в\n" +
                "порядку зростання року випуску");
        menuPanel.put("10", "список моделей автомобілів, зареєстрованих у програмі");
        menuPanel.put("11", "для кожної моделі вивести список автомобілів");

        printMenuPanel();
    }

    protected String input(String message) {
        System.out.println(message);
        return new Scanner(System.in).nextLine();
    }

    protected double digitsInput(String message, String messageError) {
        try{
            return Double.parseDouble(input(message));
        } catch (NumberFormatException e){
            System.out.println(messageError);
        }
        return -1;
    }

    protected void control(String input) {
        String filename;
        switch (input) {
            case "0":
                System.out.println("Exit.");
                operations.exit();
            case "1":
                System.out.println("Show menu");
                printMenuPanel();
                break;
            case "2":
                System.out.println("All cars:");
                operations.show(cars);
                System.out.println("============================================");
                break;
            case "3":
                System.out.println("Cars saving...");
                filename = input("Enter file name ->:");
                operations.save(cars, filename);
                System.out.println("Cars saved to '" + filename + "'");
                System.out.println("============================================");
                break;
            case "4":
                System.out.println("Found:");
                operations.show(
                        operations.find(
                                cars,
                                input("Enter value ->:")));
                System.out.println("============================================");
                break;
            case "5":
                System.out.println("Cars loading...");
                filename = input("Enter file name ->:");
                this.cars = operations.load(filename);
                System.out.println("Cars loaded from '" + filename + "'");
                System.out.println("============================================");
                break;
            case "6":
                operations.show(operations.sortCarsByYear(cars,input("Enter model ->: ")));
                break;
            case "7":
                operations.show(operations.findCarsByYearExplanation(cars,input("Enter model ->: "), (int) digitsInput("Enter year ->: ", "Year is not correct")));
                break;
            case "8":
                operations.show(operations.findCarsByYearAndCostsMore(cars,(int) digitsInput("Enter year ->: ", "Year is not correct"),digitsInput("Enter costs ->: ", "Costs is not correct")));
                break;
            case "9":
                operations.show(operations.sortCarsByCostsLessAndYearMore(cars));
                break;
            case "10":
//                operations.show(operations.findCarsIsRegistered(cars));
                System.out.println("Operations not supported");
                break;
            case "11":
                operations.show(operations.sortCarsByModel(cars));
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



package menu;

import strategy.collect.CollectByWeight;
import strategy.find.FindStrategy;
import strategy.find.FindStrategyBySugar;
import strategy.sort.SortStrategy;
import strategy.sort.SugarLevelSortStrategy;
import strategy.sort.WeightSortStrategy;
import sweetess.SweetsBag;
import sweetess.SweetsBagImpl;

import java.util.Objects;
import java.util.Scanner;

public class MenuConsole implements Menu {
    private SweetsBag sweetsBag;

    public MenuConsole(SweetsBag sweetsBag) {
        this.sweetsBag = sweetsBag;
    }

    @Override
    public void showMenu() {
        System.out.println("Menu:");
        System.out.println("[1]: show sweets bag");
        System.out.println("[2]: collect sweets bag");
        System.out.println("[3]: sort sweets bag");
        System.out.println("[4]: find in sweets bag");
        System.out.println("[0]: exit");
        control();
    }

    @Override
    public void control() {
        String input = "";
        do {
            if (!input.isEmpty())
                choose(input);
            input = input("Enter: ");
        } while (!Objects.equals(input, "0"));

    }

    private String input(String message) {
        System.out.print(message);
        return new Scanner(System.in).nextLine();

    }

    private void choose(String input) {
        switch (input) {
            case "0":
                System.exit(0);
            case "1":
                showBag(sweetsBag);
                break;
            case "2":
                sweetsBag = toCollectBag(input("Enter weight: "));
                showBag(sweetsBag);
                break;
            case "3":
                showSorts();
                switch (input("Enter sort: ")) {
                    case "0":
                        break;
                    case "1":
                        sweetsBag=sort(new WeightSortStrategy());
                        break;
                    case "2":
                        sweetsBag=sort(new SugarLevelSortStrategy());
                        break;
                    default:
                        System.out.println("Wrong exception: not correct value '" + input + "'");
                }
                showMenu();
                break;
            case "4":
                sweetsBag = find(new FindStrategyBySugar(
                        Double.parseDouble(input("Enter start diapazon")),
                        Double.parseDouble(input("Enter end diapazon"))
                ));
                break;
            default:
                System.out.println("Wrong exception: not correct value '" + input + "'");
        }
        showMenu();
    }

    private void showSorts() {
        System.out.println("Sort by:");
        System.out.println("[1]: weight");
        System.out.println("[2]: sugar");
        System.out.println("[3]: name");
        System.out.println("[0]: back");
    }

    @Override
    public void showBag(SweetsBag sweetsBag) {
        System.out.println("=======================");
        sweetsBag.getSweetness().forEach(x -> System.out.println(x.toString() + "\n"));
        System.out.println("=======================");
    }

    @Override
    public SweetsBag toCollectBag(String weight) {
        return new SweetsBagImpl(sweetsBag.toCollect(new CollectByWeight(Double.parseDouble(weight))));
    }

    @Override
    public SweetsBag sort(SortStrategy strategy) {
        return new SweetsBagImpl(sweetsBag.sort(strategy));
    }

    @Override
    public SweetsBag find(FindStrategy findStrategy) {
        return new SweetsBagImpl(sweetsBag.find(findStrategy));
    }
}

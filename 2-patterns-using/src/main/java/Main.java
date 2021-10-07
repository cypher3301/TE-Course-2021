import menu.Menu;
import menu.MenuConsole;
import sweetess.SweetsBagImpl;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Menu menu = new MenuConsole(new SweetsBagImpl(new ArrayList<>()));
        menu.showMenu();
    }
}

package menu;

import strategy.find.FindStrategy;
import strategy.sort.SortStrategy;
import sweetess.SweetsBag;

public interface Menu {

    void showMenu();

    void control();
    void showBag(SweetsBag sweetsBag);

    SweetsBag toCollectBag(String weight);

    SweetsBag sort(SortStrategy strategy);

    SweetsBag find(FindStrategy strategy);
}

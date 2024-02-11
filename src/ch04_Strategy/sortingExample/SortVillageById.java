package src.ch04_Strategy.sortingExample;

import java.util.Comparator;

public class SortVillageById implements Comparator<Village> {

    @Override
    public int compare(Village village1, Village village2) {
        if(village1.id > village2.id) {
            return 1;
        } else {
            return village1.id < village2.id ? -1 : 0;
        }
    }
}

package src.ch04_Strategy.sortingExample;

import java.util.Comparator;

public class SortVillageByName implements Comparator<Village> {

    @Override
    public int compare(Village village1, Village village2) {
        //字串以第一個字元來比較
        if(village1.name.charAt(0) > village2.name.charAt(0)) {
            return 1;
        } else {
            return village1.name.charAt(0) < village2.name.charAt(0) ? -1 : 0;
        }
    }
}

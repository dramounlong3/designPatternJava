package src.ch04_Strategy.sortingExample;

import java.util.Comparator;

public class SortVillageByPopulation implements Comparator<Village> {
    @Override
    public int compare(Village village1, Village village2) {
        //字串以第一個字元來比較
        if(village1.population > village2.population) {
            return 1;
        } else {
            return village1.population < village2.population ? -1 : 0;
        }
    }
}

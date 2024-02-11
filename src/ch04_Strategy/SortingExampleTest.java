package src.ch04_Strategy;

import org.junit.jupiter.api.Test;
import src.ch04_Strategy.sortingExample.*;

import java.util.ArrayList;
import java.util.Collections;

public class SortingExampleTest {

    @Test
    public void test() {
        //策略模式排序
        System.out.println("==========策略模式排序測試==========");
        Village village1 = new Village(3,"apple farm",32,5.1);
        Village village2 = new Village(1,"barn field",22,1.7);
        Village village3 = new Village(2,"cape valley",10,10.2);
        ArrayList<Village> arrayList = new ArrayList<>();
        arrayList.add(village1);
        arrayList.add(village2);
        arrayList.add(village3);

        System.out.println("排序前的資料順序");
        showList(arrayList);

        System.out.println("根據ID排序");
        Collections.sort(arrayList, new SortVillageById());
        showList(arrayList);

        System.out.println("根據名稱排序");
        Collections.sort(arrayList, new SortVillageByName());
        showList(arrayList);

        System.out.println("根據人口排序");
        Collections.sort(arrayList, new SortVillageByPopulation());
        showList(arrayList);

        System.out.println("根據面積排序");
        Collections.sort(arrayList, new SortVillageByArea());
        showList(arrayList);
    }

    public static void showList(ArrayList<Village> list) {
        for (Village v: list) {
            System.out.println(v);
        }
    }
}

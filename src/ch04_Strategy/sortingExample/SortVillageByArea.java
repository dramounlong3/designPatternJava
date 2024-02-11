package src.ch04_Strategy.sortingExample;

import java.util.Comparator;

//Comparator是JAVA提供的介面, 傳入對應的LIST物件型態做比較後排序
public class SortVillageByArea implements Comparator<Village> {

    @Override
    public int compare(Village village1, Village village2) {
        if(village1.area > village2.area) {
            return 1;   //表示village1比較大
        } else {
            return village1.area < village2.area ? -1 : 0;  //傳回0表示一樣大
        }
    }
}

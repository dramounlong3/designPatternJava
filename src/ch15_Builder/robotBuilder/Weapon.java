package src.ch15_Builder.robotBuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Weapon {
    List<String> list = new ArrayList<>();

    public Weapon(String[] weaponList) {
        list.addAll(List.of(weaponList));
    }
    //若無覆寫toString, print(list) 時會印出: class name@hashcode
    @Override
    public String toString() {
        return list.toString();
    }
}

package src.ch06_Observer.association;

import javax.management.openmbean.TabularDataSupport;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public abstract class Subject {

   protected HashSet<Adventure> adventureList = new HashSet<>();

    public void add(Adventure adventure) {
        adventureList.add(adventure);
    }

    public void remove(Adventure adventure) {
        adventureList.remove(adventure);
    }

    public abstract void sendMission(String mission);

}

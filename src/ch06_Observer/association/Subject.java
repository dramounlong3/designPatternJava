package src.ch06_Observer.association;

import javax.management.openmbean.TabularDataSupport;
import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

   protected List<Adventure> adventureList = new ArrayList<>();

    public void add(Adventure adventure) {
        adventureList.add(adventure);
    }

    public void remove(Adventure adventure) {
        adventureList.remove(adventure);
    }

    public abstract void sendMission(String mission);

}

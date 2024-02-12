package src.ch06_Observer.association;

import java.util.Iterator;


//公會
public class Association extends Subject{
    @Override
    public void sendMission(String mission) {

        for (Adventure adventure:this.adventureList) {
            adventure.getMission(mission); //透過公會主動幫冒險者接收任務
        }

        //改成下面透過迭代器的寫法也可以
//        Iterator iterator = this.adventureList.iterator();
//        while(iterator.hasNext()) {
//            Adventure adventure = (Adventure) iterator.next(); //從迭代器的格式再轉回 Adventure
//            adventure.getMission(mission);
//        }
    }
}

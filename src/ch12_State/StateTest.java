package src.ch12_State;

import org.junit.jupiter.api.Test;
import src.ch12_State.warrior.Warrior;

public class StateTest {

    Warrior warrior = new Warrior();

    /**
     * hp
     * > 70%         : 一般狀態(NormalState)
     * > 30% <= 70%  : 狂怒狀態(FuryState)
     * <= 30%        : 背水一戰狀態(Desperate)
     * = 0%          : 無法移動狀態(Unable)
     */

    @Test
    public void test() {
        System.out.println("==========狀態模式測試==========");
        warrior.move(); //一開始是正常狀態(NormalState, 所以會call NormalState.move())

        warrior.getDamage(30);  //受到傷害 hp: 100 - 30 = 70
        warrior.move();         //狂怒
        warrior.getDamage(50);  //受到傷害 hp: 70 - 50  = 20
        warrior.move();         //背水一戰

        warrior.heal(120);      //接受治療 hp: 20 + 120 = 100 (最多100)
        warrior.move();         //一般狀態

        warrior.getDamage(110); //受到傷害 hp: 100 - 110 = 0 (最少0)
        warrior.move();         //無法戰鬥

        warrior.heal(20);       //接受治療, 但血量已為0, hp: 0 + 20 = 0 (無效)
        warrior.move();         //無法戰鬥

    }
}

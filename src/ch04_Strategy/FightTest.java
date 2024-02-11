package src.ch04_Strategy;

import org.junit.jupiter.api.Test;
import src.ch04_Strategy.fight.Adventure;
import src.ch04_Strategy.fight.ItemAttack;
import src.ch04_Strategy.fight.NormalAttack;
import src.ch04_Strategy.fight.SkillAttack;

public class FightTest {

    @Test
    public void test() {
        System.out.println("==========策略模式==========");
        Adventure adventure = new Adventure();          //建立冒險者(暫時不管職業和裝備)
        System.out.println("1.出現史萊姆...");
        adventure.chooseStrategy(new NormalAttack());   //選擇策略: 一般攻擊
        adventure.attack();                             //攻擊

        System.out.println("2.出現強大的史萊姆...");
        adventure.chooseStrategy(new SkillAttack());    //選擇策略: 技能攻擊
        adventure.attack();                             //攻擊

        System.out.println("3.出現殭屍...");
        adventure.chooseStrategy(new ItemAttack());     //選擇策略: 物品攻擊
        adventure.attack();                             //攻擊
    }
}

package src.ch05_Decorator;

import org.junit.jupiter.api.Test;
import src.ch05_Decorator.title.*;

public class TitleTest {

    @Test
    public void test() {
        System.out.println("==========裝飾者模式測試==========");

        System.out.println("未有稱號之前的攻擊:");
        Adventure lancer = new Lancer("Jacky");
        lancer.attack();

        System.out.println();

        System.out.println("取得強壯稱號的攻擊:");
        //原本的lancer已經有Jacky attack長槍攻擊, 但這裡將lancer當作參數放到TitleStrong, 且當再次呼叫TitleStrong的attack時,
        //TitleStrong.attack又是繼承原本的attack方法, 且再呼叫原本lancer的方法之前, 又先print了一個 該稱號的文字, 所以可以將稱號一層一層疊上去
        Title strongLancer = new TitleStrong(lancer); //因為沒有使用TitleStrong底下自己的方法, 所以可以用interface的型態宣告變數
        strongLancer.attack();

        System.out.println();

        System.out.println("再取得敏捷稱號的攻擊:");
        TitleAgile strongAndAgileLancer = new TitleAgile(strongLancer); //使用原本強壯的Jacky當作參數, 再獲得另一個稱號
        strongAndAgileLancer.attack();
        strongAndAgileLancer.useFlash(); //因為useFlash不是override interface的方法, 若前面的strongAndAgileLancer的型別使用Title, 再這裡就無法呼叫到useFlash

        System.out.println();

        System.out.println("強壯的Jacky在未取得敏捷前先取得燃燒稱號的攻擊:");
        TitleInFire strongAndFireLancer = new TitleInFire(strongLancer);
        strongAndFireLancer.attack();
        strongAndFireLancer.fireball();

        System.out.println();

        System.out.println("強壯的Jacky再次取得強壯稱號的攻擊:");
        TitleStrong strongAndStrongLancer = new TitleStrong(strongLancer);
        strongAndStrongLancer.attack();

        System.out.println();

        System.out.println("取得三種不一樣稱號的攻擊:");
        Title allDecoratorLancer = new TitleInFire(strongAndAgileLancer);
        allDecoratorLancer.attack();

        System.out.println();

        //測試另一種職業
        Adventure archer = new Archer("Paul");
        archer.attack();
        TitleAgile agileArcher = new TitleAgile(archer);
        agileArcher.attack();
        agileArcher.useFlash();

    }
}

package src.ch21_Memo;

import org.junit.jupiter.api.Test;
import src.ch21_Memo.GameRole.GameRole;
import src.ch21_Memo.GameRole.RoleStateCareTaker;

public class GameRoleTest {

    @Test
    public void test() {
        //Boss初始狀態
        GameRole boss = new GameRole();
        boss.stateDisplay();

        //使用特殊技巧降低boss攻擊力;
        System.out.println("使用特殊技巧降低boss攻擊力");
        boss.setAtk(60);

        //存檔
        RoleStateCareTaker rsc = new RoleStateCareTaker();
        rsc.setSave(boss.save());
        boss.stateDisplay();

        //Boss戰開打
        System.out.println("boss戰開打");
        boss.fight();
        boss.stateDisplay();

        //隊伍血沒了, 狀態不好, 讀取先前的存檔
        System.out.println("隊伍血沒了, 狀態不好, 讀取先前的存檔");
        boss.load(rsc.getSave());
        boss.stateDisplay();
    }
}

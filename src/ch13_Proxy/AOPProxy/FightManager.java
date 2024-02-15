package src.ch13_Proxy.AOPProxy;

/**
 * 戰鬥管理類別
 */

public class FightManager {

    public void doFight(String userName) {
        // 在戰鬥開始前記錄現在時間, 但會汙染戰鬥的方法
        // System.out.println("開始時間: " + LocalDateTime.now());

        System.out.println(userName + "帶領冒險者參加戰鬥");
    }

    public void doEscape() {
        System.out.println("打不贏, 開始逃跑");
    }
}

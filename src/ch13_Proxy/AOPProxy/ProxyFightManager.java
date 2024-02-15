package src.ch13_Proxy.AOPProxy;

import java.time.LocalDateTime;

/**
 * 戰鬥管理類別(代理)
 */
public class ProxyFightManager extends FightManager{
    private FightManager fightManager;
    public ProxyFightManager(FightManager fightManager) {
        this.fightManager = fightManager;
    }

    @Override
    public void doFight(String userName) {
        //在代理的類別先記錄時間, 避免汙染實際物件的doFight
        System.out.println("開始時間: " + LocalDateTime.now());

        //之後再根據Proxy所代理的實際物件去執行原本的doFight
        this.fightManager.doFight(userName);
    }
}

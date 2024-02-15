package src.ch13_Proxy;

import org.junit.jupiter.api.Test;
import src.ch13_Proxy.AOPProxy.FightManager;
import src.ch13_Proxy.AOPProxy.ProxyFightManager;
import src.ch13_Proxy.ProtectProxy.PersonBean;
import src.ch13_Proxy.ProtectProxy.ProxyPersonBean;
import src.ch13_Proxy.SmartProxy.ProxyRealGameDisplay;
import src.ch13_Proxy.SmartProxy.RealGameDisplay;

public class ProxyTest {

    @Test
    public void SmartProxyTest() {
        System.out.println("==========代理模式(動態代理)測試==========");
        System.out.println("未使用代理");
        new RealGameDisplay().display();

        System.out.println();

        System.out.println("使用代理");
        new ProxyRealGameDisplay(new RealGameDisplay()).display();
    }

    @Test
    public void ProtectProxy() {
        System.out.println("==========代理模式(保護代理)測試==========");
        System.out.println("未使用代理");
        PersonBean personBean = new PersonBean();
        personBean.setLikeCount(10);
        System.out.println("like: " + personBean.getLikeCount());   //10

        System.out.println();

        System.out.println("使用代理");
        ProxyPersonBean proxyPersonBean = new ProxyPersonBean(new PersonBean());
        proxyPersonBean.setLikeCount(100);  //無法設定
        System.out.println("like: " + proxyPersonBean.getLikeCount());   //null
    }

    @Test
    public void AOPProxyTest() {
        System.out.println("==========代理模式(AOP切面代理)測試==========");
        System.out.println("未使用代理");
        FightManager fightManager = new FightManager();
        fightManager.doFight("Kyle");

        System.out.println();
        System.out.println("使用代理");
        ProxyFightManager proxyFightManager = new ProxyFightManager(new FightManager());
        proxyFightManager.doFight("Proxy-Kyle");
    }
}

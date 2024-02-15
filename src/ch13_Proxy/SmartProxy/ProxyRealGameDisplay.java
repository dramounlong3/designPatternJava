package src.ch13_Proxy.SmartProxy;

/**
 * 代理類別
 */
public class ProxyRealGameDisplay implements GameDisplay{
    RealGameDisplay realGameDisplay;
    public ProxyRealGameDisplay(RealGameDisplay realGameDisplay) {
        this.realGameDisplay = realGameDisplay;
    }
    @Override
    public void display() {
        System.out.println("遊戲讀取中..."); //先執行代理替其額外顯示一些資訊
        realGameDisplay.display();           //假設這段要執行很久才會跑完, 使用者會看不到任何資訊
    }
}

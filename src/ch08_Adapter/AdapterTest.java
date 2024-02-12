package src.ch08_Adapter;

import org.junit.jupiter.api.Test;
import src.ch08_Adapter.Adapter.Adapter;
import src.ch08_Adapter.Adapter.Archer;
import src.ch08_Adapter.Adapter.NormalArcher;
import src.ch08_Adapter.Adapter.Wizard;

public class AdapterTest {

    @Test
    public void test() {
        System.out.println("==========轉接器模式測試==========");

        System.out.println("正常的弓箭手shot只會一般射箭");
        Archer normalArcher =  new NormalArcher();
        normalArcher.shot();

        System.out.println("因同行隊伍無法師釋放火球, 故以隊伍中的弓箭手發射火箭代替, 執行轉接");
        Wizard fireArcher = new Adapter(normalArcher); //將隊伍中原本正常的弓箭手當作參數放入轉接器中, 使其也可以射出火箭當作火球術
        fireArcher.fireBall();                         //透過法師介面建立的新弓箭手, 使其有釋放火球術的功能可使用 (但因為型態是法師介面, 所以原本的shot方法就沒了, 只能在介面內直接執行this.archer.shot())
    }
}

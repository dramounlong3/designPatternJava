package src.ch23_visitor;

import org.junit.jupiter.api.Test;
import src.ch23_visitor.chef.*;

public class ChefTest {
    @Test
    public void test() {
        System.out.println("==========拜訪者模式測試==========");

        // 準備參賽的廚師們
        ChefGroup chefGroup = new ChefGroup();
        chefGroup.join(new SuperChef("小當家"));
        chefGroup.join(new DarkChef("雷恩"));
        chefGroup.join(new SuperNoodleChef("鋼棍解師傅"));

        System.out.println("---------------第一回合比賽: 燒賣---------------");
        Visitor round1 = new Visitor_saoMai();
        chefGroup.topic(round1);    //將參賽的廚師, 透過參賽topic, 並且將指定的題目round1 丟進去讓其執行對應題目底下 屬於 個別廚師的獨特作法

        System.out.println("---------------第二回合比賽: 豆腐---------------");
        Visitor round2 = new Visitor_tofu();
        chefGroup.topic(round2);

        // 若後續有第三回合，只需要新增Visitor的實作類別，就不會影響到其他程式
        // ex: 新增比賽題目 皇帝料理
        // 新增實作Visitor的class, 並且將上述三種廚師 透過overload分別實作 cook對應的內容即可

        // 若有新增廚師參加比賽，異動範圍較廣
        // ex: 新增 路人廚師
        // 1. 新增繼承Chef類別的NobodyChef
        // 2. 每一個實作Visitor的實體類別都要新增這位路人廚師的實作方法, Visitor_saoMai ==> 路人大燒賣, Visitor_tofu ==> 路人豆腐
        // 3. 將新增的廚師加入到參賽名單內
        chefGroup.join(new NobodyChef("路人甲"));
        System.out.println("---------------承路人甲廚師加入比賽名單, 再另外比一次第三回合: 燒賣---------------");
        chefGroup.topic(new Visitor_saoMai());

    }
}

package src.ch16_ChainOfResponsibility;

import org.junit.jupiter.api.Test;
import src.ch16_ChainOfResponsibility.chain.*;

public class ChainTest {

    @Test
    public void test() {

        System.out.println("==========責任鏈模式測試==========");

        Manager generalManager = new GeneralManager("Kyle");    //總經理
        Manager majorDomo = new MajorDomo("Grass");             //總監
        Manager commonManager = new CommonManager("Lord");      //經理

        commonManager.setSuperior(majorDomo);   //經理的上級是總監
        majorDomo.setSuperior(generalManager);  //總監的上級是總經理

        ApplyRequest applyRequest = new ApplyRequest();
        applyRequest.setRequestType("請假");
        applyRequest.setRequestContent("小菜要請假");
        applyRequest.setRequestCount(2);

        commonManager.apply(applyRequest);  //小菜請假呈報直屬主管 (經理), 後續會依責任鏈的方式決定是否要再呈報經理的直屬主管

        applyRequest.setRequestContent("小菜又要請假");
        applyRequest.setRequestCount(5);
        commonManager.apply(applyRequest);  //本次會呈報到經理 -> 總監

        applyRequest.setRequestType("加薪");
        applyRequest.setRequestContent("小菜想加薪");
        applyRequest.setRequestCount(5000);
        commonManager.apply(applyRequest);  //加薪的請求, 會呈報到最高主管,  經理 -> 總監 -> 總經理

        System.out.println();
        System.out.println("小菜加薪被拒後");
        applyRequest.setRequestContent("小菜改加薪");
        applyRequest.setRequestCount(1000); //改為加薪1000, 一樣會呈報到最高主管
        commonManager.apply(applyRequest);



    }
}

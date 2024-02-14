package src.ch11_Composite;

import org.junit.jupiter.api.Test;
import src.ch11_Composite.OrganizationTree.AbstractAssociation;
import src.ch11_Composite.OrganizationTree.Association;
import src.ch11_Composite.OrganizationTree.CustomerDepartment;
import src.ch11_Composite.OrganizationTree.HumanResource;

public class CompositeTest {

    @Test
    public void test() {
        System.out.println("==========合成模式測試==========");

        //總部
        AbstractAssociation root = new Association("冒險者總部");
        root.add(new HumanResource("總部-人力資源單位"));
        root.add(new CustomerDepartment("總部-客服單位"));


        //火星分部
        AbstractAssociation mars = new Association("火星分部");
        mars.add(new HumanResource("火星分部-人力資源單位"));
        mars.add(new CustomerDepartment("火星分部-客服單位"));
        root.add(mars); //火星分部 是 總部的其中一個分部

        //土星分部
        AbstractAssociation saturn = new Association("土星分部");
        saturn.add(new HumanResource("土星分部-人力資源單位"));
        saturn.add(new CustomerDepartment("土星分部-客服單位"));
        root.add(saturn); //土星分部 是 總部的其中一個分部

        //土衛1號分部
        AbstractAssociation saturn1 = new Association("土衛1號分部");
        saturn1.add(new HumanResource("土衛1號分部-人力資源單位"));
        saturn1.add(new CustomerDepartment("土衛1號分部-客服單位"));
        saturn.add(saturn1); //土衛1號分部 是 土星分部 的其中一個分部

        //土衛2號分部, 地區偏遠 所以無客服單位
        AbstractAssociation saturn2 = new Association("土衛2號分部");
        saturn2.add(new HumanResource("土衛2號分部-人力資源單位"));
        //saturn2.add(new CustomerDepartment("土衛2號分部-客服單位"));
        saturn.add(saturn2); //土衛2號分部 是 土星分部 的其中一個分部

        System.out.println("結構圖: ");
        root.display(1);
        System.out.println("職責表");
        root.lineOfDuty();

    }
}

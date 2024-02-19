package src.ch19_Prototype;

import org.junit.jupiter.api.Test;
import src.ch19_Prototype.resumeExperience.Resume;

public class ResumeTest {

    @Test
    public void test() throws CloneNotSupportedException{
        System.out.println("==========原型模式測試==========");
        Resume resume1 = new Resume("李逍遙",1,"見習道士");
        resume1.setExperience("2011/01/01", "仙靈島");

        System.out.println("resume1: " + resume1);


        //resume2與resume1有諸多相似的地方, 測試以複製resume1的方式來修改resume2
        Resume resume2 = (Resume) resume1.clone();  //將複製回來的Object型態改為Resume型態
        //只改resume2的等級和冒險者經歷的內容, 其他保留與resume1相同
        resume2.setLevel(5);
        resume2.setExperience("2012/03/31", "隱龍窟");       //因clone的實作方式不完整, 只能複製基本型態, 會把第1份履歷的冒險者經歷也改成隱龍窟
        System.out.println("resume2: " + resume2);
        //resume3是沿著resume2繼續往後的經歷, 故再從resume2複製
//        Resume resume3 = (Resume) resume2.clone();
//        resume3.setProfession("殭屍道長");
//        resume3.setExperience("2012/11/30", "赤鬼王血池");   //因clone的實作方式不完整, 只能複製基本型態, 會把第1.2份履歷的冒險者經歷也改成赤鬼王血池
//
//        System.out.println("第一份履歷");
//        resume1.display();
//        System.out.println("第二份履歷");
//        resume2.display();
//        System.out.println("第三份履歷");
//        resume3.display();

    }
}

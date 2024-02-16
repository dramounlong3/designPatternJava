package src.ch14_Iterator;

import org.junit.jupiter.api.Test;
import src.ch14_Iterator.iterator.MyList;

import java.util.Iterator;

public class MyListTest {

    @Test
    public void test() {
        System.out.println("==========走訪器模式測試==========");

        MyList myList = new MyList();
        myList.add("樂高車");
        myList.add("超跑");
        myList.add("聯結車");
        myList.add("九門轎車");
        myList.add("F1賽車");

        //取出iterator
        @SuppressWarnings("rawtypes")   //壓制編譯氣的警告訊息, 此處為Iterator未指定泛型的型態
        Iterator iterator = myList.getIterator();   //回傳內層class 實作Iterator的物件
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println();

        //因為index已經超出size所以只能迭代一次
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println();

        try {
            iterator.next();    //測試拋出exception
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}

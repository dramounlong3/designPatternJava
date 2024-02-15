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
        @SuppressWarnings("rawtypes")
        Iterator iterator = myList.getIterator();   //回傳內層class 實作Iterator的物件
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //iterator.next();    //測試拋出exception
    }
}

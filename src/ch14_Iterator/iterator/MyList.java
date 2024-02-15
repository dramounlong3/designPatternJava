package src.ch14_Iterator.iterator;

import lombok.Getter;
import lombok.Setter;

import java.util.Iterator;

/**
 * 簡單的list
 */

@Setter
@Getter
//@SuppressWarnings("rawtypes")
public class MyList implements MyListInterface{

    private Integer index = 0;
    private Integer size = 0;
    public String[] carList = new String[1000];    //範例給1000的大小

    //inner class, 實作Iterator
   public class MyIterator implements Iterator {
    //外層的變數 內層也可以取得, 等同於區域變數
        @Override
        public boolean hasNext() {
            if(index >= size) {
                return false;   //index超過或等於array長度時, 不會有下一個item
            }
            return true;
        }

        @Override
        public String next() {
            if(hasNext()) {
                return carList[index++];
            }
            throw new IndexOutOfBoundsException();  //超出陣列範圍
        }
    }

    //回傳inner class的instance
    public MyIterator getIterator() {
        return new MyIterator();
    }

    @Override
    public void add(String element) {
       carList[size] = element;
       size++;
    }


}

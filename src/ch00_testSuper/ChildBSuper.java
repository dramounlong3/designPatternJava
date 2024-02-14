package src.ch00_testSuper;

public class ChildBSuper extends ParentA {

    ChildBSuper(String name) {
        super(name);
    }

    //測試看若丟進來的是另一個有繼承其他父類別的子類別
    //無論丟進來的物件是什麼, 在這裡的super都是自己本身繼承的ParentA
    ChildBSuper(ChildCSuper c) {
        super(c.name);
    }

}

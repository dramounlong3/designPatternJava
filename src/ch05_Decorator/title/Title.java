package src.ch05_Decorator.title;

import src.ch05_Decorator.TitleTest;

public abstract class Title implements Adventure{

    protected Adventure adventure;

    public Title(Adventure adventure) {
        this.adventure = adventure;
    }


    @Override
    public void attack() {
        this.adventure.attack(); //回傳當層此物件的攻擊方式, 可以讓後續繼承的子類別疊加稱號
    };

}

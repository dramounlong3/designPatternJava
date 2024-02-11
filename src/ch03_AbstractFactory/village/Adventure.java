package src.ch03_AbstractFactory.village;

import lombok.Data;
import src.ch03_AbstractFactory.equip.Clothes;
import src.ch03_AbstractFactory.equip.Weapon;

//冒險者改為抽象類別, 定義冒險者的裝備跟防具
//原本Ch02是interface, 但因為要設定protected成員, 所以須改為abstract
@Data
public abstract class Adventure {
    protected Weapon weapon;
    protected Clothes clothes;

    public abstract String getType();
    public abstract void display();

}

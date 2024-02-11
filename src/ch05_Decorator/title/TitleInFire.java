package src.ch05_Decorator.title;

public class TitleInFire extends Title{

    public TitleInFire(Adventure adventure) {
        super(adventure); //透過繼承父類別的建構子, 完成從父類別繼承而來的成員 ===> this.adventure = adventure;
    }


    @Override
    public void attack() {
        System.out.print("燃燒的 ");
        super.attack(); //因為繼承方法的關係, 是疊稱號的關鍵寫法
    }

    public void fireball() {
        System.out.println("使用火球術");
    }
}

package src.ch05_Decorator.title;

public class TitleAgile extends Title{
    public TitleAgile(Adventure adventure) {
        super(adventure);
    }

    @Override
    public void attack() {
        System.out.print("敏捷的 ");
        super.attack(); //因為繼承方法的關係, 是疊稱號的關鍵寫法
    }

    //順移
    public void useFlash() {
        System.out.println("使用瞬間移動");
    }
}

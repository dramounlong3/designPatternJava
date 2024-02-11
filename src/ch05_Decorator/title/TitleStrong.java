package src.ch05_Decorator.title;

public class TitleStrong extends Title{
    public TitleStrong(Adventure adventure) {
        super(adventure);
    }

   @Override
   public void attack() {
       System.out.print("猛力的 ");
       super.attack(); //因為繼承方法的關係, 是疊稱號的關鍵寫法
   }
}

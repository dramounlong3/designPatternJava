package src.ch04_Strategy.fight;

public class ItemAttack implements FightStrategy{
    @Override
    public void execute() {
        System.out.println("使用物品攻擊");
    }
}

package src.ch04_Strategy.fight;

public class NormalAttack implements FightStrategy{

    @Override
    public void execute() {
        System.out.println("使用一般攻擊");
    }
}

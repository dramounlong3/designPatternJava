package src.ch04_Strategy.fight;

public class SkillAttack implements FightStrategy{
    @Override
    public void execute() {
        System.out.println("使用技能攻擊");
    }
}

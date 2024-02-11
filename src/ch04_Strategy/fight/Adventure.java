package src.ch04_Strategy.fight;

public class Adventure {

    FightStrategy fightStrategy;

    public void attack() {
        if(this.fightStrategy == null) {
            this.fightStrategy = new NormalAttack();
        }
        this.fightStrategy.execute();
    }

    public void chooseStrategy(FightStrategy fightStrategy) {
        this.fightStrategy = fightStrategy;
    }
}

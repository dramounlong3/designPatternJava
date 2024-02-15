package src.ch12_State.warrior;

public class UnableState implements State{
    @Override
    public void move(Warrior warrior) {
        //血量歸0後, 因無法透過治癒術恢復, 所以只有可能是UnableState
        System.out.println("HP=" + warrior.getHp() + " , 無法戰鬥");
    }
}

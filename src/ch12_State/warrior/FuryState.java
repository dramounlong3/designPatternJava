package src.ch12_State.warrior;

public class FuryState implements State{
    @Override
    public void move(Warrior warrior) {
        int hp = warrior.getHp();

        //每一次呼叫move時, 都會再次根據當前血量判斷是否需要進入另外一個狀態
        //因為FuryState有可能進入NormalState 或 DesperateState
        //所以需判斷兩種血量
        if(hp > 70) {
            warrior.setState(new NormalState());    //血量高於70%, 狀態正常
            warrior.move();
        } else if (hp <= 30) {
            warrior.setState(new DesperateState()); //血量低於30%, 進入背水一戰狀態
            warrior.move();
        } else {
            System.out.println("HP=" + warrior.getHp() + " ,狂怒狀態 傷害增加30%");
        }
    }
}

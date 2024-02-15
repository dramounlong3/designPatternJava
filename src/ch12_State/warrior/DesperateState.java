package src.ch12_State.warrior;

/**
 * 隨著HP變化的狀態(Concrete State)，HP小於30%，背水一戰狀態
 */
public class DesperateState implements State{
    @Override
    public void move(Warrior warrior) {
        int hp = warrior.getHp();

        //每一次呼叫move時, 都會再次根據當前血量判斷是否需要進入另外一個狀態
        //因為DesperateState有可能進入UnableState 或 FuryState
        //所以需判斷兩種血量
        if(hp == 0) {
            warrior.setState(new UnableState());    //生命值0, 無法移動
            warrior.move();
        } else if ( hp > 30) {
            warrior.setState(new FuryState());      //生命值高於30%
            warrior.move();
        } else {
            System.out.println("HP=" + warrior.getHp() + " ,背水一戰 傷害增加50%, 防禦增加50%");
        }
    }
}

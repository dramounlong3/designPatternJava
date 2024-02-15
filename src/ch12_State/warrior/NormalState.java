package src.ch12_State.warrior;

public class NormalState implements State{
    @Override
    public void move(Warrior warrior) {
        int hp = warrior.getHp();

        //每一次呼叫move時, 都會再次根據當前血量判斷是否需要進入另外一個狀態
        //因為NormalState只有可能進入FuryState 所以無需判斷其他狀況
        if(hp > 70) {
            System.out.println("HP=" + warrior.getHp() + ", 一般狀態");
        } else {
            warrior.setState(new FuryState());  //血量低於70%, 進入狂怒狀態
            warrior.move();
        }
    }
}

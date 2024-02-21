package src.ch21_Memo.GameRole;

import lombok.Getter;
import lombok.Setter;

/**
 * 要備份的物件(Originator)
 */
@Setter
@Getter
public class GameRole {
    private Integer hp = 100;
    private Integer atk = 100;
    private Integer def = 100;
    private String name = "最終魔王";

    public RoleStateMemo save() {
        return new RoleStateMemo(this.hp, this.atk, this.def);
    }

    /**
     * 開始戰鬥, 魔王放招式降低自己的血量
     */
    public void fight() {
        this.hp = 30;
        System.out.println(this.name + "剩下30%血量，出大招把隊伍打得半死");
    }

    /**
     * 顯示魔王的狀態
     */
    public void stateDisplay() {
        System.out.println(this.name + "的狀態:" );
        System.out.print("hp= " + this.hp);
        System.out.print(", atk= " + this.atk);
        System.out.print(", def= " + this.def);
        System.out.println();
    }

    /**
     * 重load, 魔王被紀錄時的狀態, 達到讀取存檔
     * @param roleStateMemo
     */
    public void load(RoleStateMemo roleStateMemo) {
        this.hp = roleStateMemo.getHp();
        this.atk = roleStateMemo.getAtk();
        this.def = roleStateMemo.getDef();
    }

}

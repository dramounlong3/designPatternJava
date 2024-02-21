package src.ch21_Memo.GameRole;

import lombok.Getter;
import lombok.Setter;

/**
 * 備忘錄物件(Memo)
 */
@Getter
@Setter
public class RoleStateMemo {
    private Integer hp;
    private Integer atk;
    private Integer def;

    /**
     * 當RoleStateCareTaker(備忘錄物件)存檔時, 將GameRole(魔王)當下的狀態, 放到備忘錄當作參數
     * 以利將魔王當下的hp, atk, def的狀態存起來
     * @param hp
     * @param atk
     * @param def
     */
    public RoleStateMemo(Integer hp, Integer atk, Integer def) {
        this.hp = hp;
        this.atk = atk;
        this.def = def;
    }
}

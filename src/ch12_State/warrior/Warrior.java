package src.ch12_State.warrior;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Warrior {
    private State state;
    private Integer hp; //生命值(0~100)

    public Warrior() {
        //初始狀態血量滿, 狀態一般
        this.setHp(100);
        this.state = new NormalState();
    }

    /**
     * 治療 - 恢復HP
     * @param heal
     */
    public void heal(Integer heal) {
        //血量歸0後表示已死亡, 無法治癒
        if(this.hp == 0) {
            return;
        }

        this.hp += heal;
        if(this.hp > 100) {
            this.hp = 100;
        }
    }

    /**
     * 受傷 - 減少HP
     * @param damage
     */
    public void getDamage(Integer damage) {
        this.hp -= damage;
        if(this.hp < 0) {
            this.hp = 0;
        }
    }

    /**
     * 將狀態交給state處理
     */
    public void move() {
        state.move(this);   //根據此時的state是哪一個class, 呼叫對應的move
    }
}

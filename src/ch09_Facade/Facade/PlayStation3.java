package src.ch09_Facade.Facade;

import lombok.Getter;
import lombok.Setter;

/**
 * PS3
 */

@Setter
@Getter
public class PlayStation3 extends Electronics{

    //目前播放的CD
    private String cd;


    public void play() {
        System.out.println(this.getClass().getSimpleName() + " 開始播放 " + this.cd);
    }

    @Override
    public void showStatus() {
        super.showStatus();
        if(isPowerOn()) {
            System.out.println(this.getClass().getSimpleName() + "目前放入cd: " + this.cd);
        }
    }
}

package src.ch09_Facade.Facade;

import lombok.Getter;
import lombok.Setter;

/**
 * 環繞音響
 */

@Getter
@Setter
public class Stereo extends Electronics{

    //音量 0 ~ 100
    private Integer sound = 0;

    @Override
    public void showStatus() {
        super.showStatus();
        if(isPowerOn()) {
            System.out.println(this.getClass().getSimpleName() + " 音量: " + this.sound);
        }
    }
}

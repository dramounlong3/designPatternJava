package src.ch09_Facade.Facade;

import lombok.Getter;
import lombok.Setter;

/**
 * 液晶電視
 */

@Getter
@Setter
public class Television extends Electronics{

    //聲音 0 ~ 100
    private Integer sound = 50;
    //訊號源
    private String source = "tvBox";
    //電視頻道
    private Integer channel = 9;

    //目前觀看的電視頻道
    public void showTV() {
        System.out.println("目前觀看的頻道: " + this.channel);
    }

    @Override
    public void showStatus() {
        super.showStatus(); //當Television型態的變數呼叫showStatus時, 假設變數: tv, 則會以該tv去呼叫繼承而來的showStatus
        if(isPowerOn()) {
            System.out.print(this.getClass().getSimpleName() + " 音量: " + this.sound);
            if(this.source.equals("tvBox")) {
                System.out.println(", 頻道: " + this.channel);
            }
            if(this.source.equals("ktv")) {
                System.out.println(", ktv播放中");
            }
            if(this.source.equals("ps3")) {
                System.out.println(", ps3畫面顯示中");
            }
        }
    }
}

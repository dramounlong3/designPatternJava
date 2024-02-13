package src.ch09_Facade.Facade;

/**
 * 管理影音設備的外觀類別(Facade)
 */

public class VideoRoomFacade {

    //實體化房間的所有設備
    Television tv = new Television();
    Stereo stereo =  new Stereo();
    PlayStation3 ps3 = new PlayStation3();
    KTVSystem ktv = new KTVSystem();

    /**
     * 準備使用ps3看電影
     */
    public void readyPlayMovie(String cd) {
        stereo.powerOn();       //1.開啟音響
        tv.powerOn();           //2.開啟電視
        setSound(50);           //3.設定音量 電視 和 音響音量
        tv.setSource("ps3");    //4.電視訊號源切到ps3
        ps3.powerOn();          //5.開啟ps3
        ps3.setCd(cd);          //6.放入cd
    }

    /**
     * 使用ps3播放電影
     */
    public void playMovie() {
        if(ps3.isPowerOn()) {
            ps3.play();
        }
    }

    /**
     * 電視目前觀看頻道
     */
    public void showTV() {
        tv.showTV();
    }

    /**
     * 關閉全部設備
     */
    public void turnOfAll() {
        stereo.powerOff();  //1.關閉音響
        ktv.powerOff();     //2.關閉KTV
        ps3.powerOff();     //3.關閉ps3
        tv.powerOff();      //4.關閉電視
    }

    /**
     * 看電視
     */
    public  void watchTV() {
        tv.powerOn();               //開電視
        tv.setSource("tvBox");      //切到電視訊號
    }

    /**
     * 看電視
     * @param channel
     */
    public void switchChannel(Integer channel) {
        tv.setChannel(channel);
    }

    /**
     * 準備唱KTV
     */
    public void readyKTV() {
        stereo.powerOn();       //1.開音響
        ktv.powerOn();          //2.開KTV
        tv.powerOn();           //3.開電視
        setSound(50);           //4.設定音量
        tv.setSource("ktv");    //5.電視切到ktv訊號源
    }

    /**
     * KTV點歌
     * @param song
     */
    public void selectSong(String song) {
        if(ktv.isPowerOn()) {
            ktv.selectSong(song);
        }
    }

    /**
     * KTV播放歌曲
     */
    public void playSong() {
        if(ktv.isPowerOn()) {
            ktv.playSong();
        }
    }

    /**
     * 同時設定tv和stereo的音量
     * @param sound
     */
    public void setSound(Integer sound) {
        if(tv.isPowerOn()) {
            tv.setSound(sound);
        }
        if(stereo.isPowerOn()) {
            stereo.setSound(sound);
        }
    }

    /**
     * 顯示所有機器的狀態
     */
    public void showAllStatus() {
        tv.showStatus();
        stereo.showStatus();
        ps3.showStatus();
        ktv.showStatus();
    }

}

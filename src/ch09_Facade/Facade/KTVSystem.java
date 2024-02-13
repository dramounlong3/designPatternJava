package src.ch09_Facade.Facade;

import lombok.Getter;
import lombok.Setter;

/**
 * KTV點歌機
 */
@Getter
@Setter
public class KTVSystem extends Electronics{
    private String song;

    //選歌
    public void selectSong(String song) {
        this.song = song;
    }

    //播放
    public void playSong() {
        System.out.println(this.getClass().getSimpleName() + "播放 " + this.song);
    }
}

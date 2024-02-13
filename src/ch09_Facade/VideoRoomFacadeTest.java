package src.ch09_Facade;

import org.junit.jupiter.api.Test;
import src.ch09_Facade.Facade.VideoRoomFacade;

public class VideoRoomFacadeTest {

    VideoRoomFacade videoRoomFacade = new VideoRoomFacade();

    @Test
    public void test() {
        System.out.println("==========外觀模式測試==========");
        System.out.println("==========看電影==========");
        this.videoRoomFacade.readyPlayMovie("機器人大戰");
        this.videoRoomFacade.playMovie();

        System.out.println();
        System.out.println("==========關閉所有設備==========");
        this.videoRoomFacade.turnOfAll();
        this.videoRoomFacade.showAllStatus();   //確認是否全部都關閉了

        System.out.println();
        System.out.println("==========看電視==========");
        this.videoRoomFacade.watchTV();
        this.videoRoomFacade.showTV();              //確認現在看哪一個頻道, 預設頻道9
        this.videoRoomFacade.switchChannel(20);     //換台
        this.videoRoomFacade.showTV();

        System.out.println();
        System.out.println("==========唱KTV==========");
        this.videoRoomFacade.readyKTV();
        this.videoRoomFacade.selectSong("月亮代表誰的心");
        this.videoRoomFacade.playSong();

        System.out.println();
        System.out.println("==========確認目前所有機器的狀態==========");
        this.videoRoomFacade.showAllStatus();
    }

}

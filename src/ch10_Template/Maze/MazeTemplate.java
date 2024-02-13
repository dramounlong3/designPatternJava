package src.ch10_Template.Maze;

import lombok.Getter;
import lombok.Setter;
import src.ch10_Template.Adventurer.Adventurer;

/**
 * 迷宮樣版(Template)-規範迷宮冒險的演算法
 */

@Getter
@Setter
public abstract class MazeTemplate {
    protected Integer difficulty;       //迷宮難度
    protected Adventurer adventurer;    //進入迷宮的冒險者
    protected Boolean isDoubleMaze = false;     // hook, 決定是否有隱藏迷宮

    public Adventurer adventurer(Adventurer adventurer) {
        this.adventurer = adventurer;

        //確認冒險者等級
        if(!checkLevel(adventurer.getLevel())) {
            System.out.println("冒險者等級不足，請提升等級至" + difficulty + " 後開放迷宮");
        } else {
            System.out.println("---" + adventurer.getType() + "開始進行困難度 " + difficulty + " 的迷宮");
            createMaze();   //產生迷宮
            start();        //冒險者闖迷宮

            if(this.isDoubleMaze) {
                hiddenMaze();   //透過hook決定是否有隱藏迷宮
            }
            showResult();       //計算冒險結果
        }
        return this.adventurer;
    }

    /**
     * 確認冒險者等級是否足夠
     * @param level
     * @return
     */
    private Boolean checkLevel(Integer level) {
        if(level < difficulty) {
            return false;
        }
        return true;
    }

    /**
     * 進入隱藏迷宮(由hook觸發)
     */
    void hiddenMaze() {
        System.out.println("進入隱藏迷宮");
    }

    /**
     * 顯示冒險結果
     * @return
     */
    Adventurer showResult() {
        //完成迷宮冒險後等級增加
        this.adventurer.setLevel(adventurer.getLevel() + 50 * difficulty);
        System.out.println("---" + adventurer.getType() + "完成困難度 " + difficulty + " 迷宮!!!");
        return this.adventurer;
    }
    /**
     * 產生迷宮(由子類別實作)
     */
    abstract void createMaze();

    /**
     * 冒險者進入迷宮(由子類別實作)
     */
    abstract void start();

}

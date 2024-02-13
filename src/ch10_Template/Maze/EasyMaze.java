package src.ch10_Template.Maze;

public class EasyMaze extends MazeTemplate{

    /**
     * 簡單的迷宮 (Concrete Template)
     */

    public EasyMaze() {
        super.difficulty = 1; //無限制等級
    }

    @Override
    void createMaze() {
        System.out.println("1.準備100*100的迷宮");
        System.out.println("2.安排10隻小怪物");
        System.out.println("3.安排等級10的BOSS");
        System.out.println("4.拔草整理場地");
        System.out.println("5.簡易迷宮準備完成");
    }

    @Override
    void start() {
        System.out.println("冒險者開始進行簡單迷宮的冒險");
    }
}

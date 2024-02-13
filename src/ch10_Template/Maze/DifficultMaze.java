package src.ch10_Template.Maze;

/**
 * 困難的迷宮(Concrete Template)
 */

public class DifficultMaze extends MazeTemplate{

    public DifficultMaze() {
        super.difficulty = 50;     //至少要50等才能進入困難迷宮
        super.isDoubleMaze = true; //困難迷宮預設有 隱藏迷宮
    }

    @Override
    void createMaze() {
        System.out.println("1.準備1000*1000的迷宮(包括隱藏迷宮)");
        System.out.println("2.安排打不完的小怪物");
        System.out.println("3.安排等級50的中BOSS，100隻");
        System.out.println("4.安排等級120的超級BOSS，放置隱藏迷宮的寶物");
        System.out.println("5.拔草整理場地，重新油漆牆壁，擺放各種陷阱，擺放假屍體");
        System.out.println("6.困難迷宮準備完成");
    }

    @Override
    void start() {
        System.out.println("冒險者開始進行困難迷宮的冒險");
    }
}

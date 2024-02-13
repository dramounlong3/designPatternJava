package src.ch10_Template;

import org.junit.jupiter.api.Test;
import src.ch10_Template.Adventurer.Adventurer;
import src.ch10_Template.Adventurer.GundamJustice;
import src.ch10_Template.Adventurer.Sabar;
import src.ch10_Template.Maze.DifficultMaze;
import src.ch10_Template.Maze.EasyMaze;
import src.ch10_Template.Maze.MazeTemplate;

public class MazeTemplateTest {
    //建立冒險者與迷宮
    Adventurer sabar = new Sabar();             //冒險者: 劍士
    Adventurer justice = new GundamJustice();   //冒險者: 鋼彈
    MazeTemplate easyMaze = new EasyMaze();     //簡單迷宮
    MazeTemplate hardMaze = new DifficultMaze();//困難迷宮

    @Test
    public void test() {
        System.out.println("==========樣版模式測試==========");
        System.out.println("=====困難迷宮 低等劍士=====");
        System.out.println("進入前等級: " + this.sabar.getLevel());
        this.sabar = this.hardMaze.adventurer(this.sabar);

        System.out.println();

        System.out.println("=====簡單迷宮 低等劍士=====");
        this.sabar = this.easyMaze.adventurer(this.sabar);
        System.out.println("進入後等級: " + this.sabar.getLevel());

        System.out.println();

        System.out.println("=====困難迷宮 高等劍士=====");
        System.out.println("進入前等級: " + this.sabar.getLevel());
        this.sabar = this.hardMaze.adventurer(this.sabar);
        System.out.println("進入後等級: " + this.sabar.getLevel());

        System.out.println();

        System.out.println("=====困難迷宮 高等鋼彈=====");
        System.out.println("進入前等級: " + this.justice.getLevel());
        this.justice = this.hardMaze.adventurer(this.justice);
        System.out.println("進入後等級: " + this.justice.getLevel());

    }
}

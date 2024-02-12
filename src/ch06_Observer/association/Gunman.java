package src.ch06_Observer.association;

public class Gunman extends Adventure{

    public Gunman(String name) {
        super(name);
    }

    @Override
    public void getMission(String mission) {
        if(mission.length() < 10) {
            System.out.println(this.name + ": 任務長度太短, 我不想理他");
        } else {
            System.out.println(this.name + ": 總算來點能看的了, 只要我手上有槍, 什麼我都不怕!");
        }
    }
}

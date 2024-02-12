package src.ch06_Observer.association;

public class Bard extends Adventure{

    public Bard(String name) {
        super(name);
    }

    @Override
    public void getMission(String mission) {
        if(mission.length() > 10) {
            System.out.println(this.name + ": 任務長度太長, 我只會唱歌跳舞, 不接不接");
        } else {
            System.out.println(this.name + ": 當街頭藝人太難賺了, 偶爾也是要賺點錢接接任務");
        }
    }
}

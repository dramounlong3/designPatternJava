package src.ch02_FactoryDesign.village;

public class TrainingCampWarrior {
    public Adventure trainAdventure() {
        System.out.println("在鬥士訓練營訓練一個鬥士");
        return new Warrior();
    }
}

package src.ch02_FactoryDesign.village;

public class TrainingCampArcher {
    public Adventure trainAdventure() {
        System.out.println("在弓箭手訓練營訓練一個弓箭手");
        return new Archer();
    }
}

package src.ch01_SimpleFactoryDesign.village;

public class TrainingCamp {
    public Adventure trainAdventure(String type) {
        switch (type) {
            case "archer":
                System.out.println("在訓練營訓練一個弓箭手");
                return new Archer();
            case "warrior":
                System.out.println("在訓練營訓練一個鬥士");
                return new Warrior();
            default:
                return null;
        }
    }
}

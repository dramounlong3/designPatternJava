package src.ch02_FactoryDesign.village;

import src.ch02_FactoryDesign.village.Adventure;

public class TrainingCampWarrior implements TrainingCamp{

    @Override
    public Adventure trainAdventure() {
        System.out.println("在鬥士訓練營訓練一個鬥士");
        return new Warrior();
    }
}

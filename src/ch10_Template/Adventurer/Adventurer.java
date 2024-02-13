package src.ch10_Template.Adventurer;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class Adventurer {
    //冒險者等級
    protected Integer level;
    //冒險者類型
    protected  String type;

}

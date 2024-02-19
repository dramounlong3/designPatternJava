package src.ch19_Prototype.resumeExperience;


import lombok.Getter;
import lombok.Setter;

/**
 * 冒險者經歷
 */
@Getter
@Setter
public class AdventureExperience implements Cloneable {
    private String date;        //冒險日期
    private String location;    //冒險經歷

    @Override
    public Object clone() throws CloneNotSupportedException{
            return super.clone();
    }
}

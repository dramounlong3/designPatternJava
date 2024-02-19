package src.ch19_Prototype.resumeExperience;

import lombok.Getter;
import lombok.Setter;

/**
 * 冒險者履歷
 */
@Getter
@Setter
public class Resume implements Cloneable {
    private String name;            //姓名
    private Integer level;          //等級
    private String profession;      //職業
    private AdventureExperience adventureExperience;    //冒險者經歷

    public Resume(String name, Integer level, String profession) {
        this.name = name;
        this.level = level;
        this.profession = profession;
        adventureExperience = new AdventureExperience();
    }

    //因應物件只有淺拷貝, 新增其他建構子, 以利達到物件深拷貝
    private Resume(AdventureExperience adventureExperience) throws CloneNotSupportedException{
        System.out.println("Resume => this(resume2): " + this);                  //這裡的this是新物件的this (例如Resume resume2 = resume1.clone(), 則為resume2)
        System.out.println("Resume => this(resume1.adventureExperience): " + adventureExperience);   //從clone傳過來的this.adventureExperience, 以前面的例子為例, 則為resume1的adventureExperience
        //將adventureExperience(resume1)拿去複製, 再指定給this(resume2)
        this.adventureExperience = (AdventureExperience) adventureExperience.clone();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        //super.clone();   //使用預設的super.clone(); 物件型態的成員(adventureExperience)無法被完整複製一份, 而是只有參照

        System.out.println("clone => this(resume1): " + this);   //這裡的this是誰呼叫clone時就是他 (例如Resume resume2 = resume1.clone(), 則為resume1)
        System.out.println("clone => this.adventureExperience(resume1.adventureExperience): " + this.adventureExperience);   // (當resume1呼叫時, 則為resume1的adventureExperience)
        //改用其她建構子, 達成物件成員深拷貝
        Resume copyResume = new Resume(this.adventureExperience);    //這裡的this是誰呼叫clone時就是他 (例如Resume resume2 = resume1.clone(), 則為resume1)

        System.out.println("clone => copyResume(resume2): " + copyResume);  //最後就是要將拷貝出來的物件傳出去, 所以copyResume就會等於resume2
        //設定其他一般型態的成員拷貝;
        copyResume.setName(this.name);
        copyResume.setLevel(this.level);
        copyResume.setProfession(this.profession);
        return copyResume;
    }

    public void display() {
        System.out.printf("冒險者: %s-%s 等級: %d \n", this.name, this.profession, this.level);
        System.out.printf("冒險者經歷: %s %s \n", adventureExperience.getDate(), adventureExperience.getLocation());
        System.out.println();
    }

    public void setExperience(String date, String location) {
        adventureExperience.setDate(date);
        adventureExperience.setLocation(location);
    }
}

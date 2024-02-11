package src.ch04_Strategy.sortingExample;

import lombok.Data;

@Data
public class Village {
    Integer id;             //編號
    String name;            //名稱
    Integer population;     //人口
    Double area;            //面積

    public Village(Integer id, String name, Integer population, Double area) {
        this.id = id;
        this.name = name;
        this.population = population;
        this.area = area;
    }

    @Override
    public String toString() {
        return this.id + "." + this.name + "(人口: " + this.population + " 面積: " + this.area + ")";
    }
}

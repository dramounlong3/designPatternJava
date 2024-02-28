package src.ch23_visitor.chef;


import lombok.Getter;
import lombok.Setter;

/**
 * 廚師介面 - 被操作的元素
 */
@Getter
@Setter
public abstract class Chef {
    private String name;
    public Chef(String name) {
        this.name = name;
    }

    /**
     * visitor 代表裁判指定的料理
     * @param vistor
     */
    public abstract void accept(Visitor vistor);
}

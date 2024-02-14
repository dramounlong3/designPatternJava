package src.ch11_Composite.OrganizationTree;

/**
 * 協會抽象類別(Component)
 */

public abstract class AbstractAssociation {
    protected String name;
    public AbstractAssociation(String name) {
        this.name = name;
    }

    /**
     * 增加轄下分會或部門
     * @param association
     */
    public abstract void add(AbstractAssociation association);

    /**
     * 刪除轄下分會或部門
     * @param association
     */
    public abstract void remove(AbstractAssociation association);

    /**
     * 印出組織結構圖
     * @param depth
     */
    public abstract void display(Integer depth);

    /**
     * 印出組織職責
     */
    public abstract void lineOfDuty();
}

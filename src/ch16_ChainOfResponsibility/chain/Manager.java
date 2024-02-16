package src.ch16_ChainOfResponsibility.chain;

/**
 * 管理者(Handler)
 */
public abstract class Manager {

    protected String name;
    protected Manager superior; //主管

    public Manager(String name) {
        this.name = name;
    }

    public void setSuperior(Manager superior) {
        this.superior = superior;
    }   //設定主管

    /**
     * 提出申請
     * @param applyRequest
     */
    public abstract void apply(ApplyRequest applyRequest);
}

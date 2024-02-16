package src.ch16_ChainOfResponsibility.chain;

/**
 * 總經理(Concrete handler)
 */
public class GeneralManager extends Manager{
    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void apply(ApplyRequest applyRequest) {
        //總經理, 無論假單是幾天都核准
        if(applyRequest.getRequestType().equals("請假")) {
            System.out.println(applyRequest.getRequestType() + ":" + applyRequest.getRequestContent()
            + " " + applyRequest.getRequestCount() + "被 " + this.name + " 批准");
        } else {
            //假設除請假之外的請求只有調薪, 1000以下皆批准
            if(applyRequest.getRequestCount() <= 1000) {
                System.out.println(applyRequest.getRequestType() + ":" + applyRequest.getRequestContent()
                + " " + applyRequest.getRequestCount() + " 被 " + this.name + " 批准");
            } else {
                System.out.println(applyRequest.getRequestType() + ":" + applyRequest.getRequestContent()
                        + " " + applyRequest.getRequestCount() + " 被 " + this.name + " 駁回");
            }
        }
    }
}

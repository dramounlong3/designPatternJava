package src.ch16_ChainOfResponsibility.chain;

/**
 * 經理
 */
public class CommonManager extends Manager{
    public CommonManager(String name) {
        super(name);
    }

    //責任鏈
    @Override
    public void apply(ApplyRequest applyRequest) {
        //2天以下的假批准, 其他申請則過給上級
        if(applyRequest.getRequestType().equals("請假") && applyRequest.getRequestCount() <= 2) {
            System.out.println(applyRequest.getRequestType() + ":" + applyRequest.getRequestContent()
                    + " " + applyRequest.getRequestCount() + "天被 " + this.name + " 批准");
        } else {
            if(this.superior != null) {
                superior.apply(applyRequest);
            }
        }
    }
}

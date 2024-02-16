package src.ch16_ChainOfResponsibility.chain;

public class MajorDomo extends Manager{
    public MajorDomo(String name) {
        super(name);
    }

    @Override
    public void apply(ApplyRequest applyRequest) {
        //5天以下的假批准, 其他申請則過給上級
        if(applyRequest.getRequestType().equals("請假") && applyRequest.getRequestCount() <= 5) {
            System.out.println(applyRequest.getRequestType() + ":" + applyRequest.getRequestContent()
                    + " " + applyRequest.getRequestCount() + " 天被 " + this.name + " 批准");
        } else {
            if(this.superior != null) {
                System.out.println(applyRequest.getRequestType() + ":" + applyRequest.getRequestContent()
                        + " " + applyRequest.getRequestCount() + ", " + this.name + " 已無權處理, 故呈報上級");
                superior.apply(applyRequest);
            }
        }
    }
}

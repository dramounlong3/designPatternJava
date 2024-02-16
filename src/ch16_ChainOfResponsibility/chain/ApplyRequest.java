package src.ch16_ChainOfResponsibility.chain;

import lombok.Getter;
import lombok.Setter;

/**
 * 提出申請
 */
@Getter
@Setter
public class ApplyRequest {
    /**
     * 申請類別
     */
    private String requestType;
    /**
     * 申請內容
     */
    private String requestContent;
    /**
     * 申請數量
     */
    private Integer requestCount;
}

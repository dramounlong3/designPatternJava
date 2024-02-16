package src.ch15_Builder.robotBuilder;

/**
 * 機器人組件-動力(Product part)
 */
public class Power {
    private String mainPower;   //主動力
    private String subPower;    //副動力
    private String battery;     //電池
    public Power(String mainPower, String subPower, String battery) {
        this.mainPower = mainPower;
        this.subPower = subPower;
        this.battery = battery;
    }
    //若無覆寫toString, print(array) 時會印出: class name@hashcode
    @Override
    public String toString() {
        return "{ 主動力: " + this.mainPower + ", 副動力: " + this.subPower + ", 電池: " + this.battery + " }";
    }
}

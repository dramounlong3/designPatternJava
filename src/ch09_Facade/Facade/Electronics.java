package src.ch09_Facade.Facade;

/**
 * 電子產品介面, 全部的電子產皆可透過此處開關電源
 */
public abstract class Electronics {

    //電源
    private Boolean power = false;

    //啟動電源
    public void powerOn() {
        this.power = true;
    }

    //關閉電源
    public void powerOff() {
        this.power = false;
    }

    //電源是否開啟
    public Boolean isPowerOn() {
        return this.power;
    }

    //顯示機器狀態
    protected void showStatus() {

        //根據繼承的子類別確認其電源是否開啟, 例如Television型態的變數tv呼叫時, 就會確認tv的power
        //取得this.getClass().getSimpleName, 就會以該變數的物件型態名稱來顯示, 例如tv的型態為: Television
        if(this.power) {
            System.out.println(this.getClass().getSimpleName() + " 運作中");
        } else {
            System.out.println(this.getClass().getSimpleName() + " 電源未開啟");
        }
    }
}

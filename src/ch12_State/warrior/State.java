package src.ch12_State.warrior;

/**
 * 隨著HP變化的狀態(State)
 */
public interface State {
    /**
     * 狀態不同，行為不同(傳入warrior，可取得warrior的資料)
     * @param warrior
     */
    void move(Warrior warrior);
}

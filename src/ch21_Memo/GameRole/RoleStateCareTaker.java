package src.ch21_Memo.GameRole;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * 將物件備份(MemoCareTaker)
 */

@Setter
@Getter
public class RoleStateCareTaker {
    public List<RoleStateMemo> saves = new ArrayList<>();

    //取得存檔, 範例僅只能存一個檔, 故都取index:0
    public RoleStateMemo getSave() {
        return saves.get(0);
    }

    //存檔, 範例僅只能存一個檔, 故都存於index:0
    public void setSave(RoleStateMemo roleStateMemo) {
        saves.add(0, roleStateMemo);
    }

}

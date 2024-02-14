package src.ch11_Composite.OrganizationTree;

import java.util.ArrayList;
import java.util.List;

/**
 * 有分支的協會(Composite)
 */

public class Association extends AbstractAssociation{

    private List<AbstractAssociation> branches = new ArrayList<>();

    public Association(String name) {
        super(name);
    }

    /**
     * 增加轄下分會或部門
     * @param association
     */
    @Override
    public void add(AbstractAssociation association) {
        this.branches.add(association);
    }

    /**
     * 刪除轄下分會或部門
     * @param association
     */
    @Override
    public void remove(AbstractAssociation association) {
        this.branches.remove(association);
    }

    /**
     * 印出組織結構圖
     * @param depth
     */
    @Override
    public void display(Integer depth) {
        for(int i = 0; i < depth; i++) {
            System.out.print("-");
        }

        System.out.println(this.name);
        for (AbstractAssociation a:this.branches) {
            a.display(depth + 2);   //透過遞迴的方式處理樹狀結構
        }
    }

    /**
     * 印出組織職責
     */
    @Override
    public void lineOfDuty() {
        for (AbstractAssociation a:this.branches) {
            a.lineOfDuty();
        }
    }
}

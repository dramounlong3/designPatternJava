package src.ch17_Interpreter.interpreter;

import java.sql.SQLOutput;

public class Context {
    private String text;

    public void setText(String text) {
        if(isMatchRules(text)) {
            this.text = text;
            System.out.println("設定成功");
            return;
        }
        System.out.println("文字不符合規則, 開頭必須為1個大寫字母 後續為數字, 且每串文字以1個空白隔開 ex:A123 B5555");
    }

    public String getText() {
        return this.text;
    }

    protected Boolean isMatchRules(String text) {
        if(text.isBlank()) return false;

        String[] str = text.split("\\s");   //以空白為分隔符號切割字串為陣列
        String pattern = "([AB]\\d+)";            //A123

        for (String s : str) {
            //System.out.println("s= " + s);
            if (!s.matches(pattern)) {
                return false;   //任一組不符合規則就return false
            }
        }
        return true;
    }
}

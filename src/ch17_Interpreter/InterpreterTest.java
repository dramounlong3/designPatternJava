package src.ch17_Interpreter;

import org.junit.jupiter.api.Test;
import src.ch17_Interpreter.interpreter.Context;
import src.ch17_Interpreter.interpreter.DivideExpression;
import src.ch17_Interpreter.interpreter.Expression;
import src.ch17_Interpreter.interpreter.PlusExpression;

public class InterpreterTest {

    @Test
    public void test() {
        System.out.println("==========解譯器模式測試==========");
        Expression ex;
        Context context = new Context();

        context.setText("A0 B0030 A123");   //透過正則表達式判斷是否可以設定

        if(context.getText() != null) {     //成工設定後才會執行解譯器
            System.out.println("解譯結果");
            System.out.println(context.getText());

            for (String str : context.getText().split("\\s")) {
                if (str.charAt(0) == 'A') {
                    ex = new PlusExpression();
                } else {
                    ex = new DivideExpression();
                }
                ex.interpreter(str);    //利用多型的概念執行對應的execute
            }
        }
    }
}

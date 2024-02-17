package src.ch17_Interpreter.interpreter;

public class DivideExpression extends Expression{
    @Override
    protected void execute(Integer num) {
        if(num == 0) {
            System.out.println("除數不能為0");
            return;
        }
        System.out.print(num/2 + "\t");
    }
}

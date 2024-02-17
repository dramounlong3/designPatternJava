package src.ch17_Interpreter.interpreter;

public class PlusExpression extends Expression{
    @Override
    protected void execute(Integer num) {
        System.out.print(num*2 + "\t");
    }
}

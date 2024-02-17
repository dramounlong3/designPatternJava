package src.ch17_Interpreter.interpreter;

public abstract class Expression {
    //將符合的字串, 截取後面的數字
    public void interpreter(String text) {
        if(text.length() > 0) {
            String str = text.substring(1);
            Integer number = Integer.valueOf(str);
            this.execute(number);   //藉由呼叫的物件, call對應的execute ===> 多型的概念
        }
    }

    protected abstract void execute(Integer num);
}

package src.ch15_Builder.robotBuilder;

/**
 * 機器人組件-外型(Product part)
 */
public class Form {
    private String formName;

    public Form(String formName) {
        this.formName = formName;
    }
    @Override
    public String toString() {
        return this.formName;
    }
}

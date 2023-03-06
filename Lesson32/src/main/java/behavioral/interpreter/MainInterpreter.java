package by.home.behavioral.interpreter;

public class MainInterpreter {

    public static void main(String[] args) {
        Expression isJava = getJavaExpression();
        Expression isJavaEE = getJavaEEExpression();
        System.out.println("Does developer know Java Core: " + isJava.interpreter("Java Core"));
        System.out.println("Does developer know Java EE: " + isJavaEE.interpreter("Spring"));
    }

    public static Expression getJavaExpression() {
        Expression java = new by.home.behavioral.interpreter.TerminalExpression("Java");
        Expression javaCore = new by.home.behavioral.interpreter.TerminalExpression("JavaCore");
        return new by.home.behavioral.interpreter.OrExpression(java, javaCore);
    }

    public static Expression getJavaEEExpression() {
        Expression java = new by.home.behavioral.interpreter.TerminalExpression("Java");
        Expression spring = new by.home.behavioral.interpreter.TerminalExpression("Spring");
        return new by.home.behavioral.interpreter.AndExpression(java, spring);
    }
}

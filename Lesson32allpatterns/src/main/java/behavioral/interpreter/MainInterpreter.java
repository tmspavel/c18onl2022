package behavioral.interpreter;

public class MainInterpreter {

    public static void main(String[] args) {
        Expression isJava = getJavaExpression();
        Expression isJavaEE = getJavaEEExpression();
        System.out.println("Does developer know Java Core: " + isJava.interpreter("Java Core"));
        System.out.println("Does developer know Java EE: " + isJavaEE.interpreter("Spring"));
    }

    public static Expression getJavaExpression() {
        Expression java = new behavioral.interpreter.TerminalExpression("Java");
        Expression javaCore = new behavioral.interpreter.TerminalExpression("JavaCore");
        return new behavioral.interpreter.OrExpression(java, javaCore);
    }

    public static Expression getJavaEEExpression() {
        Expression java = new behavioral.interpreter.TerminalExpression("Java");
        Expression spring = new behavioral.interpreter.TerminalExpression("Spring");
        return new behavioral.interpreter.AndExpression(java, spring);
    }
}

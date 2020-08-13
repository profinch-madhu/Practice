package exceptionpackage;

public class ThrowKeyword {
    public static void main(String[] args) {
        ArithmeticException ae = new ArithmeticException("Arithmetic Exception");
        System.out.println("Test");
        //ExceptionExample1 e1 = new ExceptionExample1();
        throw ae;//try throwing e1
        //System.out.println("Statement after throwing an exception");
    }
}

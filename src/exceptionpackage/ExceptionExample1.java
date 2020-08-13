package exceptionpackage;

public class ExceptionExample1 {
    public static void main(String[] args) {
        try{
            System.out.println("Namaskara");
            System.out.println("Vanakkam");
            System.out.println(40/0);
            System.out.println("Namaste");
        }catch(NullPointerException e){
            System.out.println("----printStackTrace-----");
            e.printStackTrace();
            System.out.println("----toString-----");
            System.out.println(e.toString());
            System.out.println("------getMessage------");
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("finally block");
        }


    }
}

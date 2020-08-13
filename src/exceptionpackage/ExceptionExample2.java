package exceptionpackage;
//Nested TRY CATCH FINALLY
public class ExceptionExample2 {
    public static void main(String[] args) {
        //Nested try catch within try
        withinTry();
        //Nested try catch within catch
        //withinCatch();
        //Nested try catch within finally
        //withinFinally();
    }


    //Nested try catch within try
    public static void withinTry()
    {
        try{
            System.out.println("s1");
            try {
                System.out.println("s2");
            } catch(Exception e){
                System.out.println("s3");
            }
        }catch (Exception e){
            System.out.println("s4");
        }
        finally {
            System.out.println("Finally block");
        }
    }


    //Nested try catch within catch
    public static void withinCatch(){
        try {
            System.out.println("s1");
        }catch(Exception e){
            System.out.println("s2");
            try {
                System.out.println("s3");
            }catch(Exception e1){
                System.out.println("s4");
            }
        }
        finally {
            System.out.println("Finally block");
        }
    }


    //Nested try catch within finally
    public static void withinFinally(){
        try{
            System.out.println("s1");
        }catch (Exception e){
            System.out.println("s2");
        }finally {
            System.out.println("s3");
            try {
                System.out.println("s4");
            }catch(Exception e){
                System.out.println("s5");
            }
        }


    }
}

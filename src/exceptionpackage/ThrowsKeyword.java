package exceptionpackage;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ThrowsKeyword {
    public static void main(String[] args) throws FileNotFoundException{
        openfile();
    }
    private static void openfile() throws FileNotFoundException {
        openfile1();
    }
    private static void openfile1() throws FileNotFoundException {
        PrintWriter p = new PrintWriter("hello.txt");//checked exception
        //System.out.println(10/0);//unchecked exception
    }
}

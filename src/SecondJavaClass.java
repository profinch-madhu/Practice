import java.sql.SQLOutput;
import java.util.Scanner;
public class SecondJavaClass {
    public static void main(String[] args) {
        System.out.println("Enter 3 numbers");
        Scanner s = new Scanner(System.in);
        int n1=s.nextInt();
        int n2=s.nextInt();
        int n3=s.nextInt();
        int res=n1+n2+n3;
        System.out.println("n1 + n2 + n3: "+res);

        //nested if else
        if(n1>n2 && n1>n3)
            System.out.println("n1 is greatest");
        else if(n2>n3)
            System.out.println("n2 is greatest");
        else
            System.out.println("n3 is greatest");

        //coding challenge1
        System.out.println("Enter your age");
        byte age=s.nextByte();
        if(age>21)
            System.out.println("Eligible");
        else
            System.out.println("Ineligible");

        //coding challenge2
        if(age > 21 && age<55)
            System.out.println("saving account");
        else if(age>55)
            System.out.println("senior citizen account");
        else
            System.out.println("ineligible");

        System.out.println("c"+'c');
    }

}

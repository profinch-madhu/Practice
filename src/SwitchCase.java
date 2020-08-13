import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        int a=1;
        final int v = 2;
        switch(a)//variable or expression
        {
            case 1://should be constant or constant expression
                System.out.println("1");
                break;//used to exit out of any loop or switch case
            case v:
                System.out.println("10");
                break;
            default:
                System.out.println("default");
        }

        //coding challenge 6
        char grade = 'A';
        switch(grade)
        {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Amazing");
                break;
            case 'C':
                System.out.println("Well done");
                break;
            case 'D':
                System.out.println("You can do better next time");
                break;
            default:
                System.out.println("Invalid grade");
        }

    }
}

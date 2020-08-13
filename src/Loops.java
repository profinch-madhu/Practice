import java.util.Scanner;
//while and do while
public class Loops {

    public static void main(String[] args) {
        //while loop facts
        /*final int num1=100,num2=200;
        while(num1<num2){
            System.out.println("inside while loop");}
        System.out.println("outside while loop");*/

        //coding challenge 3
        cc3();
        //coding challenge
        cc4();
    }

    public static void cc3(){
        //coding challenge 3
        int n=10;
        long res=1;
        System.out.println("Factorial of " +n+" is: ");
        while(n>1)
        {
            res*=n;
            n--;
        }
        System.out.println(res);
    }

    public static void cc4(){
        //coding challenge 4
        int choice = 1;
        do {
            System.out.println("Enter 2 numbers");
            Scanner s = new Scanner(System.in);
            int n1 = s.nextInt();
            int n2 = s.nextInt();
            int sum = n1 + n2;
            System.out.println("n1 + n2: " + sum);
            System.out.println("Do you want to perform the operation again\n yes: 1  or  no: 2");
            choice = s.nextInt();
        }while(choice == 1);
        System.out.println("OK BYE");
    }
}

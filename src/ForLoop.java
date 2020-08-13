import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        //coding challenge 5
        System.out.println("Enter the number");
        Scanner s = new Scanner(System.in);
        int num=s.nextInt();
        int res=num;
        for(int i=1;i<=10;i++)
        {
            res=num*i;
            System.out.println(num+" * "+i+" = "+res);
        }

        //brain teasers
        //1
        int j;
        for ( j = 0; j < 5; )
        {
            System.out.print( j + " " );
            j++ ;
        }
        System.out.println( );

        //2
        for ( int k = 0; k <= 10; k=k+2 )
        {
            System.out.print( k + " " );
        }
        System.out.println();
        //infinite for loop
        /*for(;;)
        {
            System.out.println("please stop");
        }
        */
        //continue
        System.out.println("continue example:");
        for(int i=1;i<=10;i++)
        {
            if(i==6)
                continue;
            System.out.println(i);

        }
    }
}

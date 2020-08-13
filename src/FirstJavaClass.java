public class FirstJavaClass {

    public static void main(String[] args){
        //single line comment
        /*multiline
        comment
         */

        //variable
        System.out.println("Namaste world");
        int a=10;
        int div=100;
        System.out.println(div/a);
        a=5;
        System.out.println(a);

        //float,double,int
        int myInt = 10/3;
        System.out.println("myInt:"+myInt);
        float myFloat=10.25f/3f;
        System.out.println("myFloat:"+myFloat);
        double myDouble=10.25d/3d;
        System.out.println("myDouble:"+myDouble);

        //char and boolean
        boolean myBoolean=true;
        System.out.println("myBoolean: "+myBoolean);

        char myChar = '\u00A9';
        System.out.println("myC:"+myChar);

        //Arithmetic operator
        a++;
        System.out.println("a++:"+a);
        int x=a++;
        System.out.println("x: "+x);
        System.out.println("a: "+a);
        x=++a;
        System.out.println("x: "+x);
        System.out.println("a: "+a);

        //pre and post
        int n1,n2,n3;
        n1=100;
        n2=++n1;
        n3=n1++ + --n2;
        System.out.println("n1 : "+n1+ " n2 : "+n2+ " n3 : " +n3);

        //Relational operators
        System.out.println("n1 == n2 " + (n1==n2));
        System.out.println("n1 != n2 " + (n1==n2));
        System.out.println("n1 < n2 " + (n1==n2));
        System.out.println("n1 > n2 " + (n1==n2));

        //Logical operators
        System.out.println("&&: "+ ((n1==n2) && (n1!=n2)));
        System.out.println("||: "+ ((n1==n2) || (n1!=n2)));
        System.out.println("!: "+ !(n1==n2));

        //Assignment operators
        int res=n3;
        System.out.println("res=n3: "+res);
        res+=n1;//res=res+n1
        System.out.println("res+=n1 : "+res);

        //Implicit typecasting
        char c='z';
        int i= c;//Ascii value will be stored
        System.out.println("i: "+i);

        //explicit typecasting[doubt]
        x=100;
        byte b = (byte)x;
        System.out.println("value of b: "+b);

        //ternary operator
        //greatest of 3 numbers
        n1=1200;
        n2=600;
        n3=300;
        res = (n1>n2 && n1>n3) ? n1 : ((n2>n3) ? n2 : n3 );
        System.out.println("Greatest of 3 numbers: " +res);

        //swap 2 numbers
        System.out.println("before swap: ");
        System.out.println("n1: "+n1+ " n2: "+ n2);
        int temp;
        temp = n1;
        n1=n2;
        n2 = temp;
        System.out.println("after swap: ");
        System.out.println("n1: "+n1+ " n2: "+ n2);

        //

    }
}

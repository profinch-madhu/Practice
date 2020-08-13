public class Practice2 {
    public static void main(String[] args) {
        int n,num;
        n = 1;
        num = 200;
        switch(n)
        {
            // code to be executed if n = 1;
            case 1:

                // Nested switch
                switch(num)
                {
                    // code to be executed if num = 10
                    case 10:
                        System.out.println("10 found");
                        break;

                    // code to be executed if num = 20
                    case 20:
                        System.out.println("20 found");
                        break;

                    // code to be executed if num = 30
                    case 30:
                        System.out.println("30 found");
                        break;

                    // code to be executed if num
                    // doesn't match any cases
                    default:
                        System.out.println("default num");
                }


                break;

            // code to be executed if n = 2;
            case 2:
                System.out.println("2 found");
                break;

            // code to be executed if n = 3;
            case 3:
                System.out.println("3 found");
                break;

            // code to be executed if n doesn't match any cases
            default:
                System.out.println("default n");
        }
    }
}

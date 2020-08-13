import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practice1 {
    public static void main(String[] args) {
        //phone number validation
        String re = "\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d";
        System.out.println("Enter the phone number");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        Pattern p = Pattern.compile(re);
        Matcher m = p.matcher(input);
        System.out.println(m.matches());

        //email validation
        String re1 = "(\\w)+(\\@)(\\w)+(\\.)(\\D{2,})";
        System.out.println("Enter the phone number");
        String input1 = sc.next();
        Pattern p1 = Pattern.compile(re1);
        Matcher m1 = p.matcher(input1);
        System.out.println(m1.matches());
    }
}

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Method_example {
    public static void main(String[] args) {
        System.out.println("Enter the email");
        Scanner s= new Scanner(System.in);
        String email=s.nextLine();
        if(email_validity(email))
            System.out.println("Valid email");
        else
            System.out.println("Invalid email");
    }
    public static boolean email_validity(String email)
    {
        String e="^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";
        Pattern pat = Pattern.compile(e);
        if(email == null)
            return false;
        return pat.matcher(email).matches();
    }
}

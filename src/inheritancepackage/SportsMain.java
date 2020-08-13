package inheritancepackage;

import java.util.Arrays;
import java.util.Scanner;

public class SportsMain {
    public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            //cricket sport object
            Sport cricket = new Sport();
            cricket.setSportname("Cricket");
            cricket.setType("outdoor");
            cricket.setNumber_of_formats(3);
            System.out.println("Please enter 3 cricket formats");
            String[] formats = new String[cricket.getNumber_of_formats()];
            for (int i=0;i<3;i++)
            {
                formats[i]=sc.nextLine();//inserting value into an array
            }
            cricket.setFormats(formats);
            cricket.setNumber_of_players(11);
            System.out.println(Arrays.toString(cricket.getFormats()));

            //Table tennis sport object
            Sport tt=new Sport();
            tt.setSportname("Table tennis");
            tt.setType("indoor");
            tt.setNumber_of_formats(3);
            System.out.println("Please enter 3 table tennis formats");
            String[] formats2 = new String[tt.getNumber_of_formats()];
            for (int i=0;i<3;i++)
            {
                formats2[i]=sc.nextLine();
            }
            tt.setFormats(formats2);
            tt.setNumber_of_players(5);
            System.out.println(Arrays.toString(tt.getFormats()));//converting the array to a string

            //shane warne player object , used constructor
            Player shane = new Player("Shane warne","Leg spinner",1000000);
            System.out.println(shane.getAbout());
            shane.setSportname("Cricket");
            System.out.println(shane.getSportname());//calling superclass method using child class object

            //calling the overridden method
            shane.display();
    }
}

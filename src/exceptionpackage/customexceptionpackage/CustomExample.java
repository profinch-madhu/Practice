package exceptionpackage.customexceptionpackage;

import java.util.Scanner;

public class CustomExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age:");
        int age=sc.nextInt();
        if(age<18){
            throw new TooYoung("Play at your own risk");
        }
        else if(age>60){
             throw new TooOld("Please go take rest");
        }
        else{
            System.out.println("PLAY");
        }
    }
}

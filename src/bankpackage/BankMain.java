package bankpackage;

import java.util.Date;
import java.util.Scanner;

import static java.lang.System.exit;
import static java.lang.System.setOut;

public class BankMain {
    public static void main(String[] args) {
        String customer_name;
        String Address;
        Long phone;
        String email;
        String dob;
        Long account_number;
        String account_type;
        Long amount;
        int choice;
        Customer c1 = new Customer();
        Account a1 = new Account();
        do{
        System.out.println("1: Add customer  2: Add account  3: Debit 4: Credit 5:Quit");
        Scanner sc = new Scanner(System.in);
        choice= sc.nextInt();
        switch(choice) {
            case 1:

            System.out.println("Enter the customer name");
            customer_name=sc.next();
            System.out.println("Enter the customer Address");
            Address=sc.next();
            System.out.println("Enter the customer phone number");
            phone=sc.nextLong();
            System.out.println("Enter the customer email");
            email=sc.next();
            System.out.println("Enter the customer date of birth");
            dob=sc.next();
            c1.createNewCustomer(customer_name, Address, dob, phone, email);
            System.out.println("-----------Customer details-------------");
            c1.displayCustomerDetails();
            break;

            case 2:
                System.out.println("-----------Account creation----------");

            System.out.println("Enter the customer name");
            customer_name=sc.next();
            System.out.println("Enter the customer Address");
            Address=sc.next();
            System.out.println("Enter the customer phone number");
            phone=sc.nextLong();
            System.out.println("Enter the customer email");
            email=sc.next();
            System.out.println("Enter the customer date of birth");
            dob=sc.next();
            a1.createNewCustomer(customer_name, Address, dob, phone, email);
            System.out.println("Enter the account number");
            account_number=sc.nextLong();
            System.out.println("Enter the account type");
            account_type=sc.next();
            System.out.println("Enter the amount");
            amount=sc.nextLong();
            a1.createAccount(account_number, account_type,amount);
            System.out.println("-----------Customer and Account details-------------");
            a1.displayCustomerDetails();
            break;

            case 3:
                System.out.println("Balance: "+a1.getAmount());
                System.out.println("Enter the amount to be debited");
                Long a=sc.nextLong();
                a1.debit(a);
                System.out.println("Debited: "+a);
                System.out.println("Balance: "+a1.getAmount());
                break;

            case 4:
                System.out.println("Balance: "+a1.getAmount());
                System.out.println("Enter the amount to be credited");
                Long b=sc.nextLong();
                a1.credit(b);
                System.out.println("credited: "+b);
                System.out.println("Balance: "+a1.getAmount());
                break;

            case 5:
                System.out.println("--THANK YOU--");
                break;

            default:
                System.out.println("Please enter the correct choice");

        }
    }while(choice!=5);
    }
}

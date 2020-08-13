package bankpackage;
interface Transaction{
    public void debit(Long amount);
    public void credit(Long amount);
};
public class Account extends Customer implements Transaction{

    //variables
    private Long account_number;
    private String account_type;
    private Long amount;




    //getters and setters
    public Long getAccount_number() {
        return account_number;
    }

    public void setAccount_number(Long account_number) {
        this.account_number = account_number;
    }

    public String getAccount_type() {
        return account_type;
    }

    public void setAccount_type(String account_type) {
        this.account_type = account_type;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }


    //methods
    public void createAccount(Long account_number,String account_type,Long amount){
                setAccount_number(account_number);
                setAccount_type(account_type);
                setAmount(amount);
    }

    @Override
    public void credit(Long amount) {
        this.amount+=amount;
    }

    @Override
    public void debit(Long amount) {
        this.amount-=amount;
    }

    public void displayAccountDetails(){
        displayCustomerDetails();
        System.out.println("Account number: "+this.account_number);
        System.out.println("Account type: "+this.account_type);
        System.out.println("Balance amount: "+this.amount);
    }
}

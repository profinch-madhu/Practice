package bankpackage;

import java.util.Date;

public class Customer {

    //variables
    private String customer_name;
    private String Address;
    private Long phone;
    private String email;
    private String dob;

    public String getDob() {
        return dob;
    }

    public void setDob(String date) {
        this.dob = date;
    }



    //getters and setters
    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }




    //methods
    public void createNewCustomer(String customer_name, String Address, String dob, Long phone, String email){
        setCustomer_name(customer_name);
        setAddress(Address);
        setDob(dob);
        setEmail(email);
        setPhone(phone);

    }

    public void displayCustomerDetails(){
        System.out.println("Customer name: "+this.customer_name);
        System.out.println("Customer address: "+this.Address);
        System.out.println("Customer dob: "+this.dob);
        System.out.println("Customer phone number: "+this.phone);
        System.out.println("Customer email: "+this.email);
    }

}

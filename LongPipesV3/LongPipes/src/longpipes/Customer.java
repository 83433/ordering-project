/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longpipes;

/**
 *
 * @author User
 */
public class Customer {
    
    private String firstName, surName, email, phone, company, companyAddress;
    private double payment;
    
    public Customer()
    {}
    
    /** Constructor for objects of type Pipe.
     * 
     * @param cFName The customers first name
     * @param cSName The customers surname
     * @param cEmail The customers email
     * @param cPhone The customers phone number
     * @param cCompany The company that the customer works for
     * @param cAddress The address of the customers company
     * @param cPayment The customer payment details
     */    
    
    public Customer(String cFName, String cSName, String cEmail, String cPhone, String cCompany, String cAddress, double cPayment){
    
        firstName = cFName;
        surName = cSName;
        email = cEmail;
        phone = cPhone;
        company = cCompany;
        companyAddress = cAddress;
        payment = cPayment;
    }
    
    public void setFName(String fNameIn){
        firstName = fNameIn;    
    }
    
    public String getFName(){
        return firstName;
    }
    
    public void setSName(String sNameIn){
        surName = sNameIn;    
    }
    
    public String getSName(){
        return surName;
    }
    
    public void setEmail(String emailIn){
        email = emailIn;    
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setPhone(String phoneIn){
        phone = phoneIn;    
    }
    
    public String getPhone(){
        return phone;
    }
    
    public void setCompany(String companyIn){
        company = companyIn;    
    }
    
    public String getCompany(){
        return company;
    }
    
    public void setCompAdd(String companyAddIn){
        company = companyAddIn;    
    }
    
    public String getCompAdd(){
        return company;
    }
    
    public void setPayment(double paymentIn){
        payment = paymentIn;    
    }
    
    public double getPayment(){
        return payment;
    }
    
    // Displays the details of the customer
    public void displayDetails(){
        System.out.println("\nName: " + firstName + " " + surName);
        System.out.println("\nEmail Address: " + email);
        System.out.println("\nPhone Number: " + phone);
        System.out.println("\nCompany Name: " + company);
        System.out.println("\nCompany Address: " + companyAddress);
        System.out.println("\nAmount Paid: £" + payment);
    }
            
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oline.shopping;

/**
 *
 * @author User
 */
class Customer extends Person {

    long SSN, Credit_Card_No;

    public Customer() {}
    
    Customer(String Name, String Email, String Password, long SSN, long Credit_Card_No)
    {
        super(Name,Email,Password);
        this.SSN = SSN;
        this.Credit_Card_No = Credit_Card_No;
    }
    
    public void Update_Info(String Name, String Email, String Password, long SSN, long Credit_Card_No)
    {
        this.Name = Name;
        this.Email = Email;
        this.Password = Password;
        this.SSN = SSN;
        this.Credit_Card_No = Credit_Card_No;
    }
    
}


class Admin extends Person {
    
    public Admin(String Name, String Email, String Password)
    {
        super(Name,Email,Password);
    }
    
}
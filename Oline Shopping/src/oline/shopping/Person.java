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

abstract class Person {

    String Name,Email,Password;

    Person(){}
    
    Person(String Name, String Email, String Password)
    {
        this.Name = Name;
        this.Email = Email;
        this.Password = Password;
    }
    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
}

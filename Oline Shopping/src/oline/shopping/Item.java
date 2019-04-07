/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oline.shopping;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */

class Item {
    
    String Name;
    String Description;
    double Price;
    int Quantity;
    float Sale;
    List<String> Feedback; //////////
    
    Item(String name , String description, double  p , int Q)
    {
        Name = name;
        Description = description;
        Price = p;
        Quantity += Q;
        
        Feedback = new ArrayList<>();
    }
    
    Item(String n, String description , double  p , int Q, float sale)
    {
        this(n, description, p, Q);
        Sale = sale;
    }

    public void setSale(float Sale) {
        this.Sale = Sale;
    }
    
    public Boolean Check_availability(int Number_Of_Items)
    {
        return (Quantity >= Number_Of_Items);
    }
    
    public double Calculate_Price()
    {
        return Price - Price*Sale;
    }
    
}
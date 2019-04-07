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
class Order {
    
    Shopping_Cart shopping_cart;
    Customer customer;
    // date & time sql , gui , net
    
    // mm/dd/yyyy hh:mm:mm AM

    public Order(Shopping_Cart shopping_cart, Customer customer) // date & time
    {
        this.shopping_cart = new Shopping_Cart();
        this.customer = new Customer();
        
        this.customer = customer;
        this.shopping_cart = shopping_cart;
    }
    
    
    
}

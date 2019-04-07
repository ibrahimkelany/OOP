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
public class Category {
    
    String Name;
    List<Product>products=new ArrayList();

    Category(String name) {
        this.Name=name;
    }
    
    void AddProudect (Product product)
    {
        products.add(product);
    }
    
    void Add_Item(Item item ,String Product_Name)
    {
        for(int i=0 ; i < products.size() ; i++)
        {
            if(products.get(i).Name==Product_Name)
            {
                products.get(i).Add_Item(item);
                break;
            }
        }
    }
    
    
    
}

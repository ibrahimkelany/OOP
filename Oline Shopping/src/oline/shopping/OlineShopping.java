/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oline.shopping;

import java.util.*;

/**
 *
 * @author User
 */
public class OlineShopping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        List<Category> Cat=new ArrayList();
        Category C=new  Category("Mobiles");
        Product P=new Product("Iphone");
        C.AddProudect(P);

        Item I=new Item("Iphone 6s", "IOS", 6000.52f, 1);
        
        Product P1=new Product("Android");
                        C.AddProudect(P1);

        C.Add_Item(I, "Iphone");
        C.Add_Item(I, "Android");

        C.Add_Item(I, P.Name);
        C.Add_Item(I, P1.Name);
        Cat.add(C);
        for (int i=0;i<Cat.size();i++)
        {
        System.out.println("CatName "+Cat.get(i).CatName);
           for(int k=0;k<Cat.get(i).products.size();k++)
           {
               System.err.println("Product Name "+Cat.get(i).products.get(k).Name);
               
           
           }
    
        }
    }
    
}

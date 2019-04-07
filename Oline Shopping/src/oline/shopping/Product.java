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
public class Product {
    
    String Name;
    List<Item> items=new ArrayList();
    
    Product(String name)
    {
        Name=name;
    }
    
    void Add_Item(Item item)
    {
        items.add(item);
    }
}

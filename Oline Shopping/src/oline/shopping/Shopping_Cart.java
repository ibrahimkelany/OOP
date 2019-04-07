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

class Item_And_No{
    
    int No_Of_Item;
    Item item;
    
    Item_And_No(Item item, int No_Of_Item)
    {
        this.item = item;
        this.No_Of_Item = No_Of_Item;
    }
    
    public double Price()
    {
        return item.Calculate_Price() * No_Of_Item;
    }
}

class Shopping_Cart {
    
    List<Item_And_No> item_and_no;
    double total_price;
    
    Shopping_Cart()
    {
        item_and_no = new ArrayList<>();
    }
    
    public void Add_Item_And_No(Item item , int No_Of_Item)
    {
        Item_And_No obj = new Item_And_No(item, No_Of_Item);
        
        item_and_no.add(obj);
    }
    
    public double Total_Price()
    {
        total_price = 0;
        
        for(int i=0 ; i<item_and_no.size() ; i++)
        {
            total_price += item_and_no.get(i).Price();
        }
        
        return total_price;
    }
    
    public void Remove_Item(int Index_Of_Item, int No_Of_Item)
    {
        if(item_and_no.get(Index_Of_Item).No_Of_Item > No_Of_Item)
            item_and_no.get(Index_Of_Item).No_Of_Item -= No_Of_Item;
        
        else if(item_and_no.get(Index_Of_Item).No_Of_Item == No_Of_Item)
            item_and_no.remove(Index_Of_Item);
    }
    
}




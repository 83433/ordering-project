/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longpipes;

import java.util.ArrayList;

/**
 *
 * @author Nasser 
 */

/** Constructor for objects of type Pipe.
     * 
     * @param stOrderID the order's orderID
     * @param stOrderDate The order's orderDate 
     * @param stOrderTotal The order's orderTotal 
     */    

public class Order {
   
    private int orderID;    
    private int orderDate;
    private float orderTotal; 
    private ArrayList<PipeOrder> pipeOrders;

    public Order (int stOrderID, int stOrderDate, float stOrderTotal) {
       
       orderID = stOrderID;
       orderDate = stOrderDate;
       orderTotal = 0;
       pipeOrders = new ArrayList<PipeOrder>();  
    }
   
            
    public void setOrderID(int orderIDln){
        orderID = orderIDln;
    } 
    
    public int getOrderID(){
        return orderID;
    }
     
    public void setOrderDate(int orderDateln){
        orderDate = orderDateln;
    }
    
    public int getOrderDate(){
        return orderDate;
    }
            
 // By using getCost from the pipe class this will prompt the orderTotal                        
            
    public float orderTotal() {
        pipeOrders.forEach((aPipeOrder) -> {
            orderTotal += aPipeOrder.getCost();
        });
        return 0;
    } 
}


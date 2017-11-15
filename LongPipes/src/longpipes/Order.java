/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longpipes;

/**
 *
 * @author Nasser 
 */

public class Order {
    
    private int customerID;
    private int orderID;    
    private int orderDate;
    private float orderTotal; 
    private ArrayList<PipeOrder> pipeOrders;

    public Order(int stCustomerID, int stOrderID, int stOrderDate, float stOrderTotal) {
       customerID = stCustomerID;
       orderID = stOrderID;
       orderDate = stOrderDate;
       orderTotal = 0;
       pipeOrders = new ArrayList<Piporder>();  
    }
   
    
    public void setCustomerID(int customerIDln){
        customerID = customerIDln;
      }
    
    public int getCustomerID(){
        return customerID;
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
            
 // Assuming that Pipeorder class will have "getCost"                       
            
    public float orderTotal() {
        for (Pipeorder aPipeOrder : pipeOrders) 
               orderTotal += aPipeOrder.getCost();
    } 
}


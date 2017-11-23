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
     * @param stOrderDate The order's orderDate 
     * @param stOrderTotal The order's orderTotal 
     */    

public class Order { 
    private final String orderDate;
    private double orderTotal; 
    private final ArrayList<PipeOrder> pipeOrders;

    public Order (String stOrderDate) {

       orderDate = stOrderDate;
       orderTotal = 0;
       pipeOrders = new ArrayList<>();  
    }
    
    public String getOrderDate(){
        return orderDate;
    }
            
    // By using getCost from the pipe class this will prompt the orderTotal                        
            
    public double getOrderTotal() {
        orderTotal = 0;
        pipeOrders.forEach((aPipeOrder) -> {
            orderTotal += aPipeOrder.getCost();
        });
        return orderTotal;
    }
    
    public void addPipeOrder(PipeOrder newPipeOrder){
        pipeOrders.add(newPipeOrder);
    }
    
    public ArrayList<PipeOrder> getPipeOrders(){
        return pipeOrders;
    }
}


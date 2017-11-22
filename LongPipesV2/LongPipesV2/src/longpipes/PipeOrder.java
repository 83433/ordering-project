/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longpipes;

/**
 *
 * @author ximas
 */
public class PipeOrder {
    private int orderId;
    private Pipe pipe;
    private int quantity;
    private double cost;
    
    public PipeOrder(){}
    
    public PipeOrder(int newOrderId, Pipe newPipe, int newQuantity){
        orderId = newOrderId;
        pipe = newPipe;
        quantity = newQuantity;
    }
    
    public int getOrderId(){
        return orderId;
    }
    
    public void setOrderId(int newOrderId){
        orderId = newOrderId;
    }
    
    public Pipe getPipe(){
        return pipe;
    }
    
    public void setPipe(Pipe newPipe){
        pipe = newPipe;
        // when pipe is changed recalculate cost
        calcCost();
    }
    
    public int getQuantity(){
        return quantity;
    }
    
    public void setQuantity(int newQuantity){
        quantity = newQuantity;
        // when quantity is changed recalculate cost
        calcCost();
    }
    
    public double getCost(){
        return cost;
    }
    
    public void calcCost(){
        // cost = pipe.getCost() * quantity;
    }
}

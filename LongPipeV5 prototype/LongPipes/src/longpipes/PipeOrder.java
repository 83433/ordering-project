/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longpipes;

/**
 *
 * @author Sami
 */
public class PipeOrder {
    private Pipe pipe;
    private int quantity;
    private double cost;
    
    public PipeOrder(){}
    
    public PipeOrder(Pipe newPipe, int newQuantity){
        pipe = newPipe;
        quantity = newQuantity;
    }
    
    public Pipe getPipe(){
        return pipe;
    }
    
    public int getQuantity(){
        return quantity;
    }
    
    public double getCost(){
        calcCost();
        return cost;
    }
    
    private void calcCost(){
        cost = pipe.getCost() * quantity;
    }
}

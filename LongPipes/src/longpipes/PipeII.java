/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longpipes;

/**
 *
 * @author Marcus
 */
public class PipeII extends Pipe {
    
    public PipeII(int grade, double diam, double len, boolean chemResist) {
        super(1, grade, diam, len, false, false, chemResist);
    }
    
    @Override
    public double getCost() {
        double cost = 0;
        double plasticVolume = super.getPlasticVolume();
        
        switch (grade) {
            case 2:
                cost = plasticVolume * 0.6;
                break;
            case 3:
                cost = plasticVolume * 0.75;
                break;
            case 4:
                cost = plasticVolume * 0.8;
                break;
            default:
                break;
        }
        
        double colourPremium = (cost * 1.12) - cost;
        
        double chemicalPremium = 0;
        if (chemResist) {
            chemicalPremium = (cost * 1.14) - cost;
        }
        
        cost = cost + chemicalPremium + colourPremium;
        return cost;
    }
}

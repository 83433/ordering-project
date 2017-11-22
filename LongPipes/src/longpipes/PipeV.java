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
public class PipeV extends Pipe {
    public PipeV(int grade, double diam, double len, boolean chemResist) {
        super(2, grade, diam, len, true, true, chemResist);
    }
    
    @Override
    public double getCost() {
        double cost = 0;
        double plasticVolume = super.getPlasticVolume();
        
        switch (grade) {
            case 3:
                cost = plasticVolume * 0.75;
                break;
            case 4:
                cost = plasticVolume * 0.8;
                break;
            case 5:
                cost = plasticVolume * 0.95;
            default:
                break;
        }
        
        double colourPremium = (cost * 1.16) - cost;
        double insulatePremium = (cost * 1.13) - cost;
        double reinforcePremium = (cost * 1.17) - cost;
        
        double chemicalPremium = 0;
        if (chemResist) {
            chemicalPremium = (cost * 1.14) - cost;
        }
        
        cost = (cost + chemicalPremium + colourPremium +
                insulatePremium + reinforcePremium);
        return cost;
    }
}

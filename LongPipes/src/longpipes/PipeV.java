package longpipes;

/**
 * 
 * @author Marcus
 *
 * Subclass of PipeIV describing objects of class PipeV
 */
public class PipeV extends PipeIV {
    
    /**
     * Constructor for subclass PipeV
     * Predefined properties of PipeV:
     *      Number of colours: 2
     *      Inner insulation: true
     *      Outer reinforcement: true
     * 
     * @param grade the grade of the plastic (3-5)
     * @param diam the outer diameter of the pipe in inches
     * @param len the length of the pipe in meters (up to 6m)
     * @param chemResist whether the pipe needs chemical resistance
     */
    public PipeV(int grade, double diam, double len, boolean chemResist, int type) {
        super(grade, diam, len, true, chemResist, type);
    }
    
    /**
     * Calculates the cost for this length of pipe
     * @return The cost of this length of pipe
     */
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

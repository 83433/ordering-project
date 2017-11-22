package longpipes;

/**
 * 
 * @author Marcus
 * @version 1.0.0
 * 
 * Class describing objects of type Pipe I
 */
public class PipeI extends Pipe {
    
    /**
     * Constructor for subclass PipeI
     * Predefined properties from Pipe superclass:
     *      Number of colours: 0
     *      Inner insulation: false
     *      Outer reinforcement: false
     * 
     * @param grade the grade of the plastic (1-3)
     * @param diam the outer diameter of the pipe in inches
     * @param len the length of the pipe in meters (up to 6m)
     * @param chemResist whether the pipe needs chemical resistance
     */
    public PipeI(int grade, double diam, double len, boolean chemResist) {
        super(0, grade, diam, len, false, false, chemResist);
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
            case 1:
                cost = plasticVolume * 0.4;
                break;
            case 2:
                cost = plasticVolume * 0.6;
                break;
            case 3:
                cost = plasticVolume * 0.75;
                break;
            default:
                break;
        }
        
        double chemicalPremium = 0;
        if (chemResist) {
            chemicalPremium = (cost * 1.14) - cost;
        }
        
        cost = cost + chemicalPremium;
        return cost;
    }
}

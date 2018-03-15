package longpipes;

/**
 *
 * @author Marcus
 *
 * Subclass of Pipe describing objects of class PipeIII
 */
public class PipeIII extends Pipe {
    
    /**
     * Constructor for subclass PipeIII
     * Predefined properties for PipeIII:
     *      Number of colours: 2
     *      Inner insulation: false
     *      Outer reinforcement: false
     * 
     * @param grade the grade of the plastic (2-5)
     * @param diam the outer diameter of the pipe in inches
     * @param len the length of the pipe in meters (up to 6m)
     * @param chemResist whether the pipe needs chemical resistance
     * @param reinforcement whether the pipe has outer reinforcement, 
     * only there for subclass use
     * @param insulation whether the pipe has inner insulation, only there 
     * for subclass use
     * @param type the type of the pipe
     */
    public PipeIII(int grade, double diam, double len, boolean insulation, 
            boolean reinforcement, boolean chemResist, int type) {
        super(2, grade, diam, len, false, false, chemResist, type);
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
            case 2:
                cost = plasticVolume * 0.6;
                break;
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
        
        double chemicalPremium = 0;
        if (chemResist) {
            chemicalPremium = (cost * 1.14) - cost;
        }
        
        cost = cost + chemicalPremium + colourPremium;
        return cost;
    }
}

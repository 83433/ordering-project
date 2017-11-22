package longpipes;

/**
 *
 * @author Marcus
 * @version 1.0.0
 */
public class PipeI extends Pipe {
    
    public PipeI(int grade, double diam, double len, boolean chemResist) {
        super(0, grade, diam, len, false, false, chemResist);
    }
    
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

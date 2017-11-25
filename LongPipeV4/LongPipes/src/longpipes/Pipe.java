package longpipes;

/**
 *
 * @author Marcus Wharton
 * @version 22.11.17
 * 
 * Describes object of class Pipe
 */
public abstract class Pipe {
    
    int noColours;
    int grade;
    double outerDiameter, length;
    boolean insulation, reinforcement, chemResist;
    int type;
    
    /**
     * Empty constructor for objects of type Pipe
     */
    public Pipe() {}
    
    /** Constructor for objects of type Pipe.
     * 
     * @param col the number of colours of the pipe (0, 1, 2)
     * @param grde the grade of the plastic (1-5)
     * @param diam the outer diameter of the pipe (inches)
     * @param len the length of the pipe piece, up to 6m (meters)
     * @param insulate True/False whether the pipe has insulation
     * @param reinforce True/False whether the pipe has outer reinforcement
     * @param chemical True/False whether the pipe has chemical resistance
     */
    public Pipe(int col, int grde, double diam, double len, 
            boolean insulate, boolean reinforce, boolean chemical, int _type) {
        noColours = col;
        grade = grde;
        outerDiameter = diam;
        length = len;
        insulation = insulate;
        reinforcement = reinforce;
        chemResist = chemical;
        type = _type;
    }
    
    /**
     * Abstract method to get the cost of the pipe
     * 
     * @return the cost of the pipe
     */
    public abstract double getCost();
    
    /**
     * Works out the volume of plastic in the pipe
     * @return the volume of plastic in the pipe
     */
    public double getPlasticVolume() {
        double imperialLength = length / 0.0254;
        double innerDiameter = outerDiameter * 0.9;
        double totalVolume = Math.pow((outerDiameter / 2), 2) * imperialLength * Math.PI;
        double innerVolume = Math.pow((innerDiameter / 2), 2) * imperialLength * Math.PI;
        double plasticVolume = totalVolume - innerVolume;
        return plasticVolume;
    }   
    /**
     * Accessor & mutator methods for each variable
     */
    /**
     * @param newNoColours The edited number of colours required; 0 - 2.
     */
    public void setColour(int newNoColours) {
        if (newNoColours >= 0 && newNoColours <=2) {
            noColours = newNoColours;
        }
    }
    
    public int getNoColours() {
        return noColours;
    }
    
    /**
     * 
     * @param newGrade The edited grade of plastic required for the pipe; 1-5
     */
    public void setGrade(int newGrade) {
        if (newGrade > 0 && newGrade <=5) {
            grade = newGrade;
        }
    }
    
    public int getGrade() {
        return grade;
    }
    
    /**
     * 
     * @param newDiameter The edited outer diameter of the pipe
     */
    public void setOuterDiameter(double newDiameter) {
        outerDiameter = newDiameter;
    }
    
    public double getOuterDiameter() {
        return outerDiameter;
    }
    
    /**
     * 
     * @param newLength The edited length of the pipe, less than 6m
     */
    public void setLength(double newLength) {
        if (newLength > 0.0 && newLength <= 6.0) {
            length = newLength;
        }
    }
    
    public double getLength() {
        return length;
    }
    
    /**
     * 
     * @param insulate Whether the pipe needs inner insulation
     */
    public void setInsulation(boolean insulate) {
        insulation = insulate;
    }
    
    public boolean getInsulation() {
        return insulation;
    }
    
    /**
     * 
     * @param reinforce Whether the pipe needs outer reinforcement
     */
    public void setReinforcement(boolean reinforce) {
        reinforcement = reinforce;
    }
    
    public boolean getReinforcement() {
        return reinforcement;
    }
    
    /**
     * @param chemResistance Whether the pipe needs chemical resistance
    */
    public void setChemResist(boolean chemResistance) {
        chemResist = chemResistance;
    }
    
    public boolean getChemResist() {
        return chemResist;
    }
    
    public int getType(){
        return type;
    }
}

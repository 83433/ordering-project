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
    String type;
    
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
            boolean insulate, boolean reinforce, boolean chemical) {
        noColours = col;
        grade = grde;
        outerDiameter = diam;
        length = len;
        insulation = insulate;
        reinforcement = reinforce;
        chemResist = chemical;
    }
    
    /**
     * Displays the details of the pipe, giving all variables, displays
     * whether LongPipes can supply this specification of pipe, and the cost, 
     * and the type.
     */
    public void pipeDetails() {
        System.out.println("\nNumber of colours: " + noColours);
        System.out.println("\nGrade: " + grade);
        System.out.println("\nOuter diameter (inches): " + outerDiameter);
        System.out.println("\nLength of pipe (meters): " + length);
        System.out.println("\nPipe has internal insulation: " + insulation);
        System.out.println("\nPipe has external reinforcement: "
                + reinforcement);
        System.out.println("\nPipe has chemical resistance: " + chemResist);
        System.out.println("\nCost of one length of this pipe: " 
                + getCost());
        System.out.println("\nLongPipes can supply this type of pipe: "
                + canBeSupplied());
        System.out.println("\nType of pipe: " + type);
        
    }
    
    /**
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
     * Checks if the pipe can be supplied by LongPipes
     * @return whether the pipe can be supplied
     */
    public boolean canBeSupplied() {
        boolean possible = false;
        if (checkTypeI()) {
            possible = true;
        }
        else if (checkTypeII()) {
            possible = true;
        }
        else if (checkTypeIII()) {
            possible = true;
        }
        else if (checkTypeIV()) {
            possible = true;
        }
        else if (checkTypeV()) {
            possible = true;
        }
        return possible;
    }
    
    /**
     * Checks if Type I is applicable to this pipe
     * 
     * @return returns true if type I works for this pipe
     */
    public boolean checkTypeI() {
        boolean possible = false;
        if (grade >= 1 && grade <=3) {
            if (noColours == 0) {
                if (insulation == false) {
                    if (reinforcement == false) {
                        possible = true;
                        type = "I";
                    }
                }
            }
        }
        return possible;
    }
    
    /** Checks if type II is applicable to this pipe
     * 
     * @return if type II works for this pipe
     */
    public boolean checkTypeII() {
        boolean possible = false;
        if (grade >= 2 && grade <= 4) {
            if (noColours == 1) {
                if (insulation == false) {
                    if (reinforcement == false) {
                        possible = true;
                        type = "II";
                    }
                }
            }
        }
        return possible;
    }
    
    /** Checks if Type III is applicable to this pipe
     * 
     * @return whether type III works for this pipe
     */
    public boolean checkTypeIII() {
        boolean possible = false;
        if (grade >= 2 && grade <= 5) {
            if (noColours == 2) {
                if (insulation == false) {
                    if (reinforcement == false) {
                        possible = true;
                        type = "III";
                    }
                }
            }
        }
        return possible;
    }
    
    /**
     * Checks if type IV is applicable to this pipe
     * @return whether type IV works for this pipe
     */
    public boolean checkTypeIV() {
        boolean possible = false;
        if (grade >= 2 && grade <= 5) {
            if (noColours == 2) {
                if (insulation == true) {
                    if (reinforcement == false) {
                        possible = true;
                        type = "IV";
                    }
                }
            }
        }
        return possible;
    }
    
    /**
     * Checks if type V is applicable to this pipe
     * @return whether type V works for this pipe
     */
    public boolean checkTypeV() {
        boolean possible = false;
        if (grade >= 3 && grade <= 5) {
            if (noColours == 2) {
                if (insulation == true) {
                    if (reinforcement == true) {
                        possible = true;
                        type = "V";
                    }
                }
            }
        }
        return possible;
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
}

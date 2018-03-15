/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longpipes;

/**
 *
 * @author Marcus, Sami
 */
public class PipeChecker {
    private final int grade, noColours;
    private final boolean insulation, reinforcement;
    private int type = 0;
    
    public PipeChecker(int _grade, int _noColour, boolean _insul, boolean _reinf){
        grade = _grade;
        noColours = _noColour;
        insulation = _insul;
        reinforcement = _reinf;
    }
    
    public int getType(){
        canBeSupplied();
        return type;
    }
    
    private void canBeSupplied() {
        if (checkTypeI()) {
            type = 1;
        }
        else if (checkTypeII()) {
            type = 2;
        }
        else if (checkTypeIII()) {
            type = 3;
        }
        else if (checkTypeIV()) {
            type = 4;
        }
        else if (checkTypeV()) {
            type = 5;
        }
    }
    
    /**
     * Checks if Type I is applicable to this pipe
     * 
     * @return returns true if type I works for this pipe
     */
    private boolean checkTypeI() {
        boolean possible = false;
        if (grade >= 1 && grade <=3) {
            if (noColours == 0) {
                if (insulation == false) {
                    if (reinforcement == false) {
                        possible = true;
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
    private boolean checkTypeII() {
        boolean possible = false;
        if (grade >= 2 && grade <= 4) {
            if (noColours == 1) {
                if (insulation == false) {
                    if (reinforcement == false) {
                        possible = true;
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
    private boolean checkTypeIII() {
        boolean possible = false;
        if (grade >= 2 && grade <= 5) {
            if (noColours == 2) {
                if (insulation == false) {
                    if (reinforcement == false) {
                        possible = true;
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
    private boolean checkTypeIV() {
        boolean possible = false;
        if (grade >= 2 && grade <= 5) {
            if (noColours == 2) {
                if (insulation == true) {
                    if (reinforcement == false) {
                        possible = true;
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
    private boolean checkTypeV() {
        boolean possible = false;
        if (grade >= 3 && grade <= 5) {
            if (noColours == 2) {
                if (insulation == true) {
                    if (reinforcement == true) {
                        possible = true;
                    }
                }
            }
        }
        return possible;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum;

/**
 *
 * @author Zeta Arsetya
 */
public class bola {
    public double jari;
    
    public void setjari(double r){
        jari=r;
    }
    public double showjari(){
        return jari;
    }
    public double showdiameter(){
        double diameter = jari*2;
        return diameter;
    }
    public double showvolume(){
        double volume = (4*Math.PI*jari*jari)/3;
        return volume;
    }
    public double showluas(){
        double luas = 4*Math.PI*jari*jari;
        return luas;
    }
}

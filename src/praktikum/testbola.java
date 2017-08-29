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
public class testbola {
    public static void main (String[]arg){
        bola hitung = new bola();
        double luas,volume;
        hitung.setjari(7);
        luas = hitung.showluas();
        volume = hitung.showvolume();
        System.out.println("Jari-jari adalah " + hitung.showjari()+
                "\nDiameter adalah " + hitung.showdiameter()+ "\nLuas adalah "+
                (int)Math.round(luas) + "\nVolume adalah " + (int)Math.round(volume));
    }
}

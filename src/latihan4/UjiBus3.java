/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan4;

/**
 *
 * @author Zeta Arsetya
 */
public class UjiBus3 {
    public static void main(String[] args) {
        Bus3 bus=new Bus3(5);
        bus.addpenumpang(17);
        bus.getpenumpang(24);
        bus.cetakpenumpang();
       
        bus.addpenumpang (2);
        bus.cetakpenumpang();
        
        bus.addpenumpang (1);
        bus.cetakpenumpang();
        
        bus.addpenumpang (2);
        bus.cetakpenumpang();
        
        bus.addpenumpang (2);
        bus.cetakpenumpang();
    }
}

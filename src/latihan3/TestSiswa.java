/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3;

/**
 *
 * @author Zeta Arsetya
 */
public class TestSiswa {
    public static void main(String args[]){
        EncapSiswa siswa = new EncapSiswa();
        siswa.setName("Zeta");
        siswa.setAbsen(38);
        siswa.setAddress("Malang");
        
        System.out.print("Name : " +siswa.getName()
                + " Absen : " +siswa.getAbsen()+
                " Address : " +siswa.getAddress());
    
        }

}
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
public class Bus3 {
    private int penumpang;
    public final int maxpenumpang;
    
    public Bus3(int maxpenumpang)
    {
        this.maxpenumpang = maxpenumpang;
        penumpang = 0;
    }

    public void addpenumpang(int penumpang)
    {
        int temp;
        temp = this.penumpang+penumpang;
        if (temp>maxpenumpang)
        {
            System.out.println("penumpang melebihi kuota");
        }
        else 
        {
            this.penumpang=temp;
        }
    }
    public void getpenumpang(int password)
    {
        if (password==24)
        {
            System.out.println("Password Benar");
        }
        else
        {
            System.out.println("Password Salah");
        }
    }
    public void cetakpenumpang()
    {
        System.out.println("penumpang Bus Sekarang = "+penumpang);
        System.out.println("Maksimum penumpang yang seharusnya adalah = "+maxpenumpang);
    }
}

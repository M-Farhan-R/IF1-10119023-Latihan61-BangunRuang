/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package if1.pkg10119023.latihan61.bangunruang;

/**
 *
 * @author 
 * NAMA              : Muhammad Farhan R  
 * KELAS             : IF1
 * NIM               : 10119023
 * Deskripsi Program : 
 *
 */
import java.text.DecimalFormatSymbols;
import java.text.DecimalFormat;
public class IF110119023Latihan61BangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bola b = new Bola();
        Tabung t = new Tabung();
        Kerucut k = new Kerucut();
        
        b.setR(7);
        
        t.setR(10);
        t.setT(21);
        
        k.setR(14);
        k.setT(9);
        
        float[] v = new float[3];
        v[0] = b.volume();
        v[1] = t.volume();
        v[2] = k.volume();
        
        String[] a = new String[3];
        a[0] = "Jari-jari sebuah bola basket adalah "+b.getR()+
                "cm\nHasil : V = ";
        a[1] = "Sebuah tabung memiliki jari-jari berukuran "+t.getR()+
                "cm. Jika tingginya "+t.getT()+"cm,\nHasil : V = ";
        a[2] = "Diketahui tinggi sebuah kerucut "+k.getT()+
                "cm. Jika jari-jarinya "+k.getR()+"cm,\nHasil : V = ";
        
        DecimalFormat ff = new DecimalFormat();
        DecimalFormat ff2 = new DecimalFormat("###.#");
        DecimalFormatSymbols f = new DecimalFormatSymbols();
        DecimalFormatSymbols f2 = new DecimalFormatSymbols();
        f.setGroupingSeparator('.');
        f2.setDecimalSeparator(',');
        ff.setDecimalFormatSymbols(f);
        ff2.setDecimalFormatSymbols(f2);
        
        System.out.println(a[0]+ff2.format(v[0])+"\n");
        System.out.printf(a[1].concat("%.0f%n%n"),v[1]);
        System.out.println(a[2]+ff.format(v[2]));
        
    }

}

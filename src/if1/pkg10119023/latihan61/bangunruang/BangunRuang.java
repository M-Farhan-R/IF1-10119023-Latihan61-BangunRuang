/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119023.latihan61.bangunruang;

/**
 *
 * @author Muhammad Farhan R <farhan.10119023@mahasiswa.email.ac.id>
 */
public abstract class BangunRuang {
    public float PHi = 22/7f;
    public float volume;
    public int r;
    
    public abstract void setR(int r);
    public abstract int getR();
    public abstract float volume();
}

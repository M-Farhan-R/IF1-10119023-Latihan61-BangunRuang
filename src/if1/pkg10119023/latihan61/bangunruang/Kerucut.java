/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119023.latihan61.bangunruang;

/**
 *
 * @author Muhammad Farhan R 
 */
public class Kerucut extends BangunRuang{
    private int t;
    private int r;
    
    @Override
    public void setR(int r){
        this.r = r;
    }
    
    @Override
    public int getR(){
        return r;
    }
    
    public void setT(int t){
        this.t = t;
    }
    
    public int getT(){
        return t;
    }
    
    
    @Override
    public float volume(){
        volume =   r*r * t * 1/3 * PHi;
        return volume;
    }
}

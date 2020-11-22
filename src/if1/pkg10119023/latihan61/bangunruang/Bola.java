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
public class Bola extends BangunRuang{
    public int r;
    
    @Override
    public float volume(){
        volume =   PHi*r*r*r*4/3 ;
        return volume;
    }
    
    @Override
    public int getR(){
        return r;
    }
    
    @Override
    public void setR(int r){
        this.r = r;
    }
}

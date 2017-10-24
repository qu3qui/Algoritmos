/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author jbuitrago
 */
public class Circulo {
    
    private int radio;

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
    
    public int area(){
        return this.radio;
    }
    
    public int perimetro(){
        return 0;
    }
    
    public Circulo(){}
    
    public Circulo(int radio){
    this.radio = radio;
    }
    
    
}

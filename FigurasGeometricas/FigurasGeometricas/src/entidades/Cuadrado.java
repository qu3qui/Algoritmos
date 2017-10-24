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
public class Cuadrado {
    private int lado;

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
    
    public int area(){
        return this.lado*this.lado;
    }
    
    public int perimetro(){
        return this.lado*4;
    }
    
    public Cuadrado(){
    }
    
    public Cuadrado(int lado){
        this.lado = lado;
    }
    
}

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
public class Triangulo {

    private int altura;
    private int base;

    public int area() {
        return 0;
    }

    public int perimetro() {
        return 0;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public Triangulo() {
    }

    public Triangulo(int altura, int base) {
        this.altura = altura;
        this.base = base;
    }
}

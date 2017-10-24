/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

/**
 *
 * @author jbuitrago
 */
public class Utilidades {
    
    public static int obtenerParametro(String parametro){
        try{
            return Integer.parseInt(parametro);
        }catch(NumberFormatException ex){
            return 0;
        }
    }
}

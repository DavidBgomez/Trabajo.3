/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

/**
 *
 * @author Asus
 */
public class Evaluacion {
    public static String evaluarValores(double A, double B){
        String resultado = null;
        
        if (A < B){
            resultado = (A + " es menor que " + B);
        } if (A > B){
            resultado = (A + " es mayor que " + B);
        } if (A == B){
            resultado =(A + " es igual que " + B);
        }
        
     
        return resultado;
    }
}

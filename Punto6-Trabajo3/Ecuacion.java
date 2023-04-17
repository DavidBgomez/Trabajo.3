/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

/**
 *
 * @author Asus
 */
public class Ecuacion {
    public static double calcularResultado1EcuacionSegundoGrado(double valorA, double valorB, double valorC){
        double valor1Ecuacion;
        double discriminante = (Math.pow(valorB, 2) - 4*valorA*valorC);
        
        if (discriminante<0){
            valor1Ecuacion = -1;
        } else{
            valor1Ecuacion = ((-1)*(valorB) + Math.sqrt(discriminante))/(2*valorA);
        }
        
    return valor1Ecuacion;
    }
    
    public static double calcularResultado2EcuacionSegundoGrado(double valorA, double valorB, double valorC){
        double valor2Ecuacion;
        double discriminante = (Math.pow(valorB, 2) - 4*valorA*valorC);
        
        if (discriminante<0){
            valor2Ecuacion = -1;
        } else{
            valor2Ecuacion = ((-1)*(valorB) - Math.sqrt(discriminante))/(2*valorA);;
        }
     
    return valor2Ecuacion;
    }
    
}

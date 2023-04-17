/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

/**
 *
 * @author Asus
 */
public class Circulo {

    public static double calcularAreaCirculo(int radio){
        return Math.round(Math.PI*Math.pow(radio, 2)*100.0)/100;
    }
    
    public static double calcularPerimetroCirculo(int radio){
        return Math.round(2*Math.PI*radio*100.0)/100.0;
    }
    
}

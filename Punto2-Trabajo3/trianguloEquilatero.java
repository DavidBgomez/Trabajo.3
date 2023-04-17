/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

/**
 *
 * @author Asus
 */
public class trianguloEquilatero {
    public static double calcularPerimetro(double lado){
        double perimetro = 3*lado;
        return perimetro;
    }
    
    public static double calcularAltura(double lado){
        double altura = ((lado*Math.sqrt(3))/2);
        return altura;
    }
    
    public static double calcularArea(double lado){
        double area = ((Math.pow(lado,2)*Math.sqrt(3))/4);
        return area;
    }
    
}

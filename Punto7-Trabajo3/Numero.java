/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

/**
 *
 * @author Asus
 */
public class Numero {
    
    public static double calcularRaizCuadrada(int numero){
        double raizCuadrada = Math.round(Math.sqrt(numero)*100.0)/100.0;
        return raizCuadrada;
    }
    
    public static double calcularCuadrado(int numero){
        double cuadrado = Math.round(Math.pow(numero, 2));
        return cuadrado;
    }
    
    public static double calcularCubo(int numero){
        double cubo = Math.round(Math.pow(numero, 3));
        return cubo;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

/**
 *
 * @author Asus
 */
public class Estudiante {
    public static double calcularValordeMatricula(double patrimonioEstudiante, int estratoEstudiante){
        double valorMatricula = 50.000;
        
        if((patrimonioEstudiante>2000.000) && (estratoEstudiante>3)){
            double aumento = ((patrimonioEstudiante*3)/100);
            valorMatricula = valorMatricula+aumento;
        }
        
        return valorMatricula;
    }
    
}

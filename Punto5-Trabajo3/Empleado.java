/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

/**
 *
 * @author Asus
 */
public class Empleado {
    public static String analizisDeSalario(double salarioBasicoPorHoras, int numeroDeHorasTrabajadas, String nombreEmpleado){
        String analisis = null;
        double salarioDelEmpleado =(salarioBasicoPorHoras*numeroDeHorasTrabajadas);
        
        if (salarioDelEmpleado>450.00){
            analisis = ("NOMBRE: "+ nombreEmpleado + ", SALARIO MENSUAL: " + salarioDelEmpleado);
        } else{
            analisis = ("NOMBRE: " + nombreEmpleado);
        }
        
    return analisis;
    }
    
}

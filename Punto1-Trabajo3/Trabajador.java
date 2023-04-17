/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

/**
 *
 * @author Asus
 */
public class Trabajador {
    
    public static double calcularSalarioBruto(double valorHoraDeTrabajo, double horasTrabajadasAlMes){
        double salarioBruto = horasTrabajadasAlMes*valorHoraDeTrabajo;
        return salarioBruto;
    }
    
    public static double calcularSalarioNeto(double salarioBruto, double porcentajeDeRetencion){
        double retencionTotal = (salarioBruto*porcentajeDeRetencion)/100;
        double salarioNeto = salarioBruto -  retencionTotal;
        return salarioNeto;
    }
    
}

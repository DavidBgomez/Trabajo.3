/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

/**
 *
 * @author Asus
 */
public class TrianguloRectangulo {
    ;
    ;

    public static double calcularAreaTrianguloRectangulo(int base, int altura){
        return Math.round(((base*altura)/2)*100.0)/100.0;
    }
    
    public static double calcularPerimetroTrianguloRectangulo(int base, int altura){
        return Math.round((base + altura + calcularHipotenusa(base, altura))*100.0)/100.0;
    }

    public static double calcularHipotenusa(int base,int altura){
        return Math.round((Math.pow(base*base + altura*altura, 0.5))*100.0)/100.0;
    }

    public static String determinarTipoDeTriangulo(int base,int altura){
        double hipotenusa = calcularHipotenusa(base, altura);
        String tipoDeTriangulo = null;
        if ((base==altura)&&(base==hipotenusa)&&(hipotenusa==altura)){
            tipoDeTriangulo = "El triangulo es equilatero";
        } if ((base!=altura)&&(base!=hipotenusa)&&(hipotenusa!=altura)){
            tipoDeTriangulo = "El triangulo es escaleno";
        } else{ 
            tipoDeTriangulo = "El triangulo es isoceles";
        }

        return tipoDeTriangulo;
    }
    
}

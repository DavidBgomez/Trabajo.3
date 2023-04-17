/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

/**
 *
 * @author Asus
 */
public class Numeros {
    public static int numeroMayor(int A, int B, int C, int D, int E, int F){
        int numeroMayor;
        
        if ((A>B)&&(A>C)&&(A>D)&&(A>E)&&(A>F)){
            numeroMayor = A;
        }if ((B>A)&&(B>C)&&(B>D)&&(B>E)&&(B>F)){
             numeroMayor = B;
        }if ((C>A)&&(C>B)&&(C>D)&&(C>E)&&(C>F)){
             numeroMayor = C;
        }if ((D>A)&&(D>B)&&(D>C)&&(D>E)&&(D>F)){
             numeroMayor = D;
        }if ((E>A)&&(E>B)&&(E>D)&&(E>C)&&(E>F)){
             numeroMayor = E;
        }if ((C>A)&&(C>B)&&(C>D)&&(C>E)&&(C>F)){
             numeroMayor = C;
        }else{
            numeroMayor = E;
        }
        
        return numeroMayor;
    }
    
}

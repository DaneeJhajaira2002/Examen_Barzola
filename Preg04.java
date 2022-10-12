
package preg04;

import java.util.Scanner;

public class Preg04 {

    public static void main(String[] args) {
        //Variable donativo
        int ganancia;
        float donativo = 0;
        Scanner sc=new Scanner(System.in);
        //Ingreso de datos por parte del usuario
        System.out.println("Ingrese su ganancia");
        ganancia=sc.nextInt();
        
        //Condicionales
        if( ganancia >0 && ganancia<=1000){
            donativo= (0.05f)* ganancia;
            
        }else if(ganancia>1000 && ganancia <=1500){
            donativo=(0.07f)*ganancia;
            
        }else if(donativo>1500 && donativo<2000){
            donativo=(0.07f)*ganancia;
        }else if(ganancia>2000 && ganancia <=5000){
            donativo=(0.08f)*ganancia;
        }else if(ganancia>5000){
            donativo=(0.15f)*ganancia;
        }
        
        System.out.println("El monto a donar es:" + donativo);
    }
    
}

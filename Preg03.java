
package preg03;

import java.util.Scanner;

public class Preg03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horas;
        int importe = 0;
        int horas_adicionales;
        System.out.println("Cantidad de horas: ");
        horas = sc.nextInt();
        
        if(horas<=4){
            importe = 6;
        }
        else{
            horas_adicionales = horas - 4;
            importe = 6 + (horas_adicionales * 2);
        }
        
        System.out.println("\nImporte a pagar = S/. " + importe);
    }
    
}

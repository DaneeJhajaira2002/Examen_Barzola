
package preg01;

import java.util.Scanner;

public class Preg01 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int a;
       int b;
       int temp;
       
       System.out.print("Valor de a: ");
       a = sc.nextInt();
       System.out.print("Valor de b: ");
       b = sc.nextInt();
       
       System.out.println("\nIntercambiado valores... \n");
       
       temp = a;
       a = b;
       b = temp;
       
       System.out.println("A: "+a);
       System.out.println("B: "+b);
    
    }
}

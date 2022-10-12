package preg02;

import java.util.Scanner;

public class Preg02 {

   
    public static void main(String[] args) {
        int n;
        int suma = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Valor de n: ");
        n = sc.nextInt();
        
        for(int i=1; i<=n; i++){
            suma += i;
        }
        
        System.out.println("\nLa suma es de: " + suma);
    }
}
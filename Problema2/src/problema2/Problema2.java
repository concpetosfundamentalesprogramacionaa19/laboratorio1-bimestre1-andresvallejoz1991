/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2;
import java.util.Scanner;
/**
 *
 * @author Salas
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Se 
        String v1;
        String v2;
        String v3;
        double m;
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese la variable X");
        v1 = sc.nextLine();
        System.out.println("Ingrese la variable Y");
        v2 = sc.nextLine();
        System.out.println("Ingrese la variable Z");
        v3 = sc.nextLine();
        
        double x = Double.parseDouble(v1);
        double y = Double.parseDouble(v2);
        double z = Double.parseDouble(v3);
        
        m = (x+(y/z))/(x-(y/z));
        System.out.printf("El valor de m, en base de las variables: "
                + "\nX = %.1f\n\tY= %.2f\n\t\tZ= %.3f"
                + " \nDa como resultado: \n\t\t\t m= %.4f", x , y , z , m);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema3;
import java.util.Scanner;
/**
 *
 * @author Salas
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        String n1;
        String n2;
        String n3;
        System.out.println("Ingrese la nota 1");
        n1 = sc.nextLine();
        System.out.println("Ingrese la nota 2");
        n2 = sc.nextLine();
        System.out.println("Ingrese la nota 3");
        n3 = sc.nextLine();
        
        int  not1 = (int) Double.parseDouble(n1);
        int  not2 = (int) Double.parseDouble(n2);
        int  not3 = (int) Double.parseDouble(n3);
        
        int Promedio = (int) ((not1+not2+not3)/3);
        
        String resultado = Promedio > 14 ? "Pasa el año":"No pasa el año";
        System.out.printf("Su promedio es: %d\n", Promedio);
        System.out.printf("%s\n", resultado);
    }
    
}

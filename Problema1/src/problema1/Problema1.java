/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1;
import java.util.Scanner;
/**
 *
 * @author Salas
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        int hora = 100; 
        int costo;
        int SueldoMensual;
        int total;
        int seguro;
        //Se ingresa por consola el costo por hora
        System.out.println("Ingrese la cantidad de costo por hora");
        costo = sc.nextInt();
        //Se calcula el descuento de seguro social
        total = (hora * costo);
        seguro = (int) (total * 0.10);
        //Se muestra el descuento del seguro Social
        System.out.printf("El valor del seguro es: %d\n", seguro);
        //Se calcula el total  pagar del sueldo Mensual
        SueldoMensual = (hora * costo - seguro);
        System.out.printf("El sueldo mensual del trabajador es: %d\n", SueldoMensual);
        
        
        
        
        
    }
    
}

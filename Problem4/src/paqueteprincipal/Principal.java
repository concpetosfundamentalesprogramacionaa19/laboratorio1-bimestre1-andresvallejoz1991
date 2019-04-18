/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteprincipal;
import paquete1.*;
import paquete2.*;
import paquete3.*;
/**
 *
 * @author Salas
 */
public class Principal {
    public static void main(String[] args) {
        int  resultado= (int) MiClase1.edad;
        String resultado1= MiClase2.nombre;
        String resultado2= MiClase3.apellido;
        System.out.printf("Nombre:\n\t%s"
                + "\nApellido: \n\t%s"
                + "\nEdad: \n\t%d y mayor de edad", resultado1, resultado2, resultado);
    }
}

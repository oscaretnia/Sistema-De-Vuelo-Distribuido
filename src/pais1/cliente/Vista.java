/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pais1.cliente;

import java.util.Scanner;

/**
 *
 * @author Sophy
 */
public class Vista {
    
    private static int opcion = 0;
    private static Scanner scanner = new Scanner(System.in);
    
    private int mostrarMenu() {
        
        System.out.println(componerMenu());
        System.out.print("Ingresa la opción -> ");
        opcion = scanner.nextInt();
        
        return opcion;
    }
    
    private static String componerMenu() {
        
        StringBuilder builder = new StringBuilder();
        
        builder.append("**** Menú ****\n")
               .append("1.- Mostrar aviones locales \n")
               .append("2.- Mostrar aviones extranjeros \n")
               .append("3.- Mostrar rutas activas \n")
               .append("4.- Mostrar rutas disponibles \n")
               .append("6.- SALIR \n");    
        
        return builder.toString();
    }
    
}

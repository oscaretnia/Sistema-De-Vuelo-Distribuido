/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pais1.cliente;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import pais1.servidor.Avion;
import pais1.servidor.SistemaVuelo;

/**
 *
 * @author Sophy
 */
public class Vista {
    
    private int opcion = 0;
    private final Scanner scanner = new Scanner(System.in);
    private SistemaVuelo sisVuelo1;
    
    public Vista() {
        conectarServidor();
    }
    
    
    private int mostrarMenu() {
        
        System.out.println(componerMenu());
        System.out.print("Ingresa la opción -> ");
        opcion = scanner.nextInt();
        
        return opcion;
    }
    
    private String componerMenu() {
        
        StringBuilder builder = new StringBuilder();
        
        builder.append("**** Menú ****\n")
               .append("1.- Mostrar aviones locales \n")
               .append("2.- Mostrar aviones extranjeros \n")
               .append("3.- Mostrar rutas activas \n")
               .append("4.- Mostrar rutas disponibles \n")
               .append("5.- SALIR \n");    
        
        return builder.toString();
    }
    
    private void conectarServidor() {
        try {
            Registry registro = LocateRegistry.getRegistry("localhost", 4444);
            sisVuelo1 = (SistemaVuelo) registro.lookup("sistemaPais1");            
        } catch (Exception e) {
            Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    private void ejecutar(int opcion) {
            
        
            switch(opcion) {
                //Opcion 1
                case 1: 
                    this.mostrarAvionesLocales();            
                break;
                //Fin opcion 1
                
              
                //Opcion 2
                case 2:
                    
                break;
                //Fin opcion 2
                

                //Opcion 3
                case 3:
                    
                    
                break;
                //Fin opcion 3
                
                
                //Opcion 4
                case 4:
                    
                    
                break;
                //Fin opcion 4
                
                
                //Opcion 5
                case 5:
                    System.exit(0);
                break;
                //Fin opcion 6
            }        
    }
    
    public void iniciar() {
        do{
            ejecutar(mostrarMenu());
        }while(opcion != 6);
    }
    
    private void mostrarAvionesLocales() {
        try {
            
            for (Avion avion : sisVuelo1.obtenerAVionesLocales() ) {
                System.out.println("Avion");
                System.out.println("-------------------");
                System.out.println("Matricula : " + avion.getMatricula());
                System.out.println("Origen : " + avion.getOrigen());
                System.out.println("Destino : " + avion.getDestino());
                System.out.println("Fecha de vuelo : " + avion.getFechaVuelo());
            }
            
            
        } catch (RemoteException ex) {
            Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}

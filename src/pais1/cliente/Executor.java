/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pais1.cliente;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import pais1.servidor.Aeropuerto;
import pais1.servidor.Avion;
import pais1.servidor.Ruta;
import pais1.servidor.SistemaVuelo;

/**
 *
 * @author Sophy
 */
public class Executor {
    
    private int opcion = 0;
    private final Scanner scanner = new Scanner(System.in);
    private SistemaVuelo sisVuelo1;
    
    public Executor() {
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
               .append("1.- Mostrar aeropuertos \n")
               .append("2.- Mostrar aviones \n")
               .append("3.- Mostrar rutas \n")
               .append("4.- SALIR \n");    
        
        return builder.toString();
    }
    
    private void conectarServidor() {
        try {
            Registry registro = LocateRegistry.getRegistry("localhost", 4444);
            sisVuelo1 = (SistemaVuelo) registro.lookup("sistemaPais1");            
        } catch (Exception e) {
            Logger.getLogger(Executor.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    private void ejecutar(int opcion) {            
        
            switch(opcion) {
                //Opcion 1
                case 1: 
                    try {
                        List<Aeropuerto> aeropuertos = new ArrayList<>();
                        aeropuertos.addAll(sisVuelo1.obtenerAeropuertos());
                        this.mostrarAeropuertos(aeropuertos);
                    } catch (RemoteException ex) {
                        Logger.getLogger(Executor.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                break;
                //Fin opcion 1
                
              
                //Opcion 2
                case 2:
                    try {
                        List<Avion> aviones = new ArrayList<>();
                        aviones.addAll(sisVuelo1.obtenerAViones());
                        this.mostrarAviones(aviones);
                    } catch (RemoteException ex) {
                        Logger.getLogger(Executor.class.getName()).log(Level.SEVERE, null, ex);
                    }
                break;
                //Fin opcion 2                //Fin opcion 2
                

                //Opcion 3
                case 3:  
                    
                    try {
                        List<Ruta> rutas = new ArrayList<>();
                        rutas.addAll(sisVuelo1.obtenerRutas());
                        this.mostrarRutas(rutas);
                    } catch (RemoteException ex) {
                        Logger.getLogger(Executor.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                break;
                //Fin opcion 3
                
                
                //Opcion 4
                case 4:
                    System.exit(0);                    
                break;
                //Fin opcion 4
                
            }        
    }
    
    public void iniciar() {
        do{
            ejecutar(mostrarMenu());
        }while(opcion != 6);
    }
    
    private void mostrarAviones(List<Avion> aviones) {

        System.out.println("Aviones: ");
        System.out.println("");

        for (Avion avion : aviones) {
            System.out.println("-------------------");
            System.out.println("Matricula : " + avion.getMatricula());
            System.out.println("Aeropuerto : " + avion.getPais());
            System.out.println("Origen : " + avion.getOrigen());
            System.out.println("Destino : " + avion.getDestino());
            System.out.println("Fecha de vuelo : " + avion.getFechaVuelo());
            System.out.println("-------------------");
        }
        System.out.println("");
    }
    
    private void mostrarRutas(List<Ruta> rutas) {
        System.out.println("Rutas: ");
        System.out.println("");

        for (Ruta ruta : rutas) {
            System.out.println("-------------------");
            System.out.println("Aeropuerto : " + ruta.getPais());
            System.out.println("Origen : " + ruta.getOrigen());
            System.out.println("Destino : " + ruta.getDestino());
            System.out.println("stado : " + ruta.getEstado());
            System.out.println("-------------------");
        }
        System.out.println("");
    }
    
    private void mostrarAeropuertos(List<Aeropuerto> aeropuertos) {
        System.out.println("Aeropuertos: ");
        System.out.println("");

        for (Aeropuerto aeropuerto : aeropuertos) {
            System.out.println("-------------------");
            System.out.println("Aeropuerto : " + aeropuerto.getPais());
            System.out.println("-------------------");
        }
        System.out.println("");
    }
}

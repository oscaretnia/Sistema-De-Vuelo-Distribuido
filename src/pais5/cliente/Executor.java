/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pais5.cliente;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import common.SistemaVuelo;
import common.Aeropuerto;
import common.Avion;
import common.Ruta;

/**
 *
 * @author Sophy
 */
public class Executor {
    
    private int opcion = 0;
    private final Scanner scanner = new Scanner(System.in);
    private SistemaVuelo sisVuelo1;
    private SistemaVuelo sisVuelo2;
    private SistemaVuelo sisVuelo3;
    private SistemaVuelo sisVuelo4;
    private SistemaVuelo sisVuelo5;
    
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
        
        builder.append("**** Sistema Pais 5 ****\n")
               .append("**** Menú ****\n")
               .append("1.- Mostrar aeropuertos \n")
               .append("2.- Mostrar aviones \n")
               .append("3.- Mostrar rutas \n")
               .append("4.- SALIR \n");    
        
        return builder.toString();
    }
    
    private void conectarServidor() {
        try {
            Registry registro1 = LocateRegistry.getRegistry("localhost", 4444);
            sisVuelo1 = (SistemaVuelo) registro1.lookup("sistemaPais1");
            
            Registry registro2 = LocateRegistry.getRegistry("localhost", 4445);
            sisVuelo2 = (SistemaVuelo) registro2.lookup("sistemaPais2"); 

            Registry registro3 = LocateRegistry.getRegistry("localhost", 4446);
            sisVuelo3 = (SistemaVuelo) registro3.lookup("sistemaPais3");  
            
            Registry registro4 = LocateRegistry.getRegistry("localhost", 4447);
            sisVuelo4 = (SistemaVuelo) registro4.lookup("sistemaPais4"); 
            
            Registry registro5 = LocateRegistry.getRegistry("localhost", 4448);
            sisVuelo5 = (SistemaVuelo) registro5.lookup("sistemaPais5"); 
            
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
                        aeropuertos.addAll(sisVuelo2.obtenerAeropuertos());
                        aeropuertos.addAll(sisVuelo3.obtenerAeropuertos());
                        aeropuertos.addAll(sisVuelo4.obtenerAeropuertos());
                        aeropuertos.addAll(sisVuelo5.obtenerAeropuertos());
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
                        aviones.addAll(sisVuelo2.obtenerAViones());
                        aviones.addAll(sisVuelo3.obtenerAViones());
                        aviones.addAll(sisVuelo4.obtenerAViones());
                        aviones.addAll(sisVuelo5.obtenerAViones());
                        this.mostrarAviones(aviones);
                    } catch (RemoteException ex) {
                        Logger.getLogger(Executor.class.getName()).log(Level.SEVERE, null, ex);
                    }
                break;
                //Fin opcion 2
                

                //Opcion 3
                case 3:  
                    
                    try {
                        List<Ruta> rutas = new ArrayList<>();
                        rutas.addAll(sisVuelo1.obtenerRutas());
                        rutas.addAll(sisVuelo2.obtenerRutas());
                        rutas.addAll(sisVuelo3.obtenerRutas());
                        rutas.addAll(sisVuelo4.obtenerRutas());
                        rutas.addAll(sisVuelo5.obtenerRutas());
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

        System.out.println("");
        System.out.println("Aviones: ");
        System.out.println("-------------------");

        for (Avion avion : aviones) {            
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
        
        System.out.println("");
        System.out.println("Rutas: ");
        System.out.println("-------------------");

        for (Ruta ruta : rutas) {            
            System.out.println("Aeropuerto : " + ruta.getPais());
            System.out.println("Origen : " + ruta.getOrigen());
            System.out.println("Destino : " + ruta.getDestino());
            System.out.println("stado : " + ruta.getEstado());
            System.out.println("-------------------");
        }
        System.out.println("");
    }
    
    private void mostrarAeropuertos(List<Aeropuerto> aeropuertos) {
        
        System.out.println("");
        System.out.println("Aeropuertos: ");
        System.out.println("-------------------");

        for (Aeropuerto aeropuerto : aeropuertos) {            
            System.out.println("Aeropuerto : " + aeropuerto.getPais());
            System.out.println("-------------------");
        }
        System.out.println("");
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package argentina.cliente;

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
    private SistemaVuelo sistemaColombia;
    private SistemaVuelo sistemaMexico;
    private SistemaVuelo sistemaArgentina;
    private SistemaVuelo sistemaChile;
    private SistemaVuelo sistemaPeru;
    
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
        
        builder.append("**** Sistema Argentina ****\n")
               .append("**** Menú ****\n")
               .append("1.- Mostrar aeropuertos \n")
               .append("2.- Mostrar aviones \n")
               .append("3.- Mostrar rutas \n")
               .append("4.- Insertar nuevo avion \n")
               .append("5.- Insertar nueva ruta \n")
               .append("6.- SALIR \n");    
        
        return builder.toString();
    }
    
    private void conectarServidor() {
        try {
            Registry registro1 = LocateRegistry.getRegistry("localhost", 4444);
            sistemaColombia = (SistemaVuelo) registro1.lookup("sistemaPais1");
            
            Registry registro2 = LocateRegistry.getRegistry("localhost", 4445);
            sistemaMexico = (SistemaVuelo) registro2.lookup("sistemaPais2"); 

            Registry registro3 = LocateRegistry.getRegistry("localhost", 4446);
            sistemaArgentina = (SistemaVuelo) registro3.lookup("sistemaPais3");  
            
            Registry registro4 = LocateRegistry.getRegistry("localhost", 4447);
            sistemaChile = (SistemaVuelo) registro4.lookup("sistemaPais4"); 
            
            Registry registro5 = LocateRegistry.getRegistry("localhost", 4448);
            sistemaPeru = (SistemaVuelo) registro5.lookup("sistemaPais5"); 
            
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
                        aeropuertos.addAll(sistemaColombia.obtenerAeropuertos());
                        aeropuertos.addAll(sistemaMexico.obtenerAeropuertos());
                        aeropuertos.addAll(sistemaArgentina.obtenerAeropuertos());
                        aeropuertos.addAll(sistemaChile.obtenerAeropuertos());
                        aeropuertos.addAll(sistemaPeru.obtenerAeropuertos());
                        this.mostrarAeropuertos(aeropuertos);
                    } catch (RemoteException ex) {
                        Logger.getLogger(Executor.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                break;
                //Fin opcion 1                //Fin opcion 1                //Fin opcion 1                //Fin opcion 1                //Fin opcion 1                //Fin opcion 1                //Fin opcion 1                //Fin opcion 1                //Fin opcion 1                //Fin opcion 1                //Fin opcion 1                //Fin opcion 1                //Fin opcion 1                //Fin opcion 1                //Fin opcion 1                //Fin opcion 1                //Fin opcion 1                //Fin opcion 1                //Fin opcion 1                //Fin opcion 1                //Fin opcion 1                //Fin opcion 1                //Fin opcion 1                //Fin opcion 1                //Fin opcion 1                //Fin opcion 1                //Fin opcion 1                //Fin opcion 1                //Fin opcion 1                //Fin opcion 1                //Fin opcion 1                //Fin opcion 1
                
              
                //Opcion 2
                case 2:
                    try {
                        List<Avion> aviones = new ArrayList<>();
                        aviones.addAll(sistemaColombia.obtenerAViones());
                        aviones.addAll(sistemaMexico.obtenerAViones());
                        aviones.addAll(sistemaArgentina.obtenerAViones());
                        aviones.addAll(sistemaChile.obtenerAViones());
                        aviones.addAll(sistemaPeru.obtenerAViones());
                        this.mostrarAviones(aviones);
                    } catch (RemoteException ex) {
                        Logger.getLogger(Executor.class.getName()).log(Level.SEVERE, null, ex);
                    }
                break;
                //Fin opcion 2                //Fin opcion 2                //Fin opcion 2                //Fin opcion 2                //Fin opcion 2                //Fin opcion 2                //Fin opcion 2                //Fin opcion 2                //Fin opcion 2                //Fin opcion 2                //Fin opcion 2                //Fin opcion 2                //Fin opcion 2                //Fin opcion 2                //Fin opcion 2                //Fin opcion 2                //Fin opcion 2                //Fin opcion 2                //Fin opcion 2                //Fin opcion 2                //Fin opcion 2                //Fin opcion 2                //Fin opcion 2                //Fin opcion 2                //Fin opcion 2                //Fin opcion 2                //Fin opcion 2                //Fin opcion 2                //Fin opcion 2                //Fin opcion 2                //Fin opcion 2                //Fin opcion 2
                

                //Opcion 3
                case 3:  
                    
                    try {
                        List<Ruta> rutas = new ArrayList<>();
                        rutas.addAll(sistemaColombia.obtenerRutas());
                        rutas.addAll(sistemaMexico.obtenerRutas());
                        rutas.addAll(sistemaArgentina.obtenerRutas());
                        rutas.addAll(sistemaChile.obtenerRutas());
                        rutas.addAll(sistemaPeru.obtenerRutas());
                        this.mostrarRutas(rutas);
                    } catch (RemoteException ex) {
                        Logger.getLogger(Executor.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                break;
                //Fin opcion 3                //Fin opcion 3                //Fin opcion 3                //Fin opcion 3                //Fin opcion 3                //Fin opcion 3                //Fin opcion 3                //Fin opcion 3                //Fin opcion 3                //Fin opcion 3                //Fin opcion 3                //Fin opcion 3                //Fin opcion 3                //Fin opcion 3                //Fin opcion 3                //Fin opcion 3                //Fin opcion 3                //Fin opcion 3                //Fin opcion 3                //Fin opcion 3                //Fin opcion 3                //Fin opcion 3                //Fin opcion 3                //Fin opcion 3                //Fin opcion 3                //Fin opcion 3                //Fin opcion 3                //Fin opcion 3                //Fin opcion 3                //Fin opcion 3                //Fin opcion 3                //Fin opcion 3
                
                
                //Opcion 4
                case 4:
                    
                    System.out.print("Ingresa el pais -> ");
                    String aPais = scanner.next();
                    System.out.print("Ingresa el origen -> ");
                    String aOrigen = scanner.next();
                    System.out.print("Ingresa el destino -> ");
                    String aDestino = scanner.next();
                    System.out.print("Ingresa la matricula -> ");
                    String aMatricula = scanner.next();
                    System.out.print("Ingresa la cantidad de pasajeros -> ");
                    int aCantidad = scanner.nextInt();
                    System.out.print("Ingresa la fecha de vuelo -> ");
                    String aFecha = scanner.next();
                    System.out.println("");
                    System.out.println("");
                    
                    this.insertarAvion(aPais, aOrigen, aDestino, aMatricula, aCantidad, aFecha);
                                       
                break;
                //Fin opcion 4
                
                //Opcion 5
                case 5:
                    
                    System.out.print("Ingresa el pais -> ");
                    String rPais = scanner.next();
                    System.out.print("Ingresa el origen -> ");
                    String rOrigen = scanner.next();
                    System.out.print("Ingresa el destino -> ");
                    String rDestino = scanner.next();
                    System.out.print("Ingresa el estado -> ");
                    String rEstado = scanner.next();
                    System.out.println("");
                    System.out.println("");
                    
                    this.insertarRuta(rPais, rOrigen, rDestino, rEstado);
                                       
                break;
                //Fin opcion 5
                
                //Opcion 6
                case 6:
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
    
    void insertarAvion(String pais, String origen, String destino, String matricula, int cantidadPasajeros, String fechaVuelo) {
        try {
            sistemaArgentina.insertarAvion(new Avion(pais, origen, destino, matricula, cantidadPasajeros, fechaVuelo));
        } catch (RemoteException ex) {
            Logger.getLogger(Executor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    void insertarRuta(String pais, String origen, String destino, String estado) {
        try {
            sistemaArgentina.insertarRuta(new Ruta(pais, origen, destino, estado));
        } catch (RemoteException ex) {
            Logger.getLogger(Executor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
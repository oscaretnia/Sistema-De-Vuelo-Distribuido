/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pais1.cliente;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import pais1.servidor.SistemaVuelo;

/**
 *
 * @author Sophy
 */
public class Cliente {
    
    public static void main(String args[]){
        
        try {
            Registry registro = LocateRegistry.getRegistry("localhost", 4444);
            SistemaVuelo sisVuelo1 = (SistemaVuelo) registro.lookup("sistemaPais1");
            
            int countA = sisVuelo1.obtenerAVionesLocales().size();
            int countR = sisVuelo1.obtenerRutasLocales("Activa").size();
            
            System.out.println("Aviones : " + countA);
            System.out.println("Rutas : " + countR);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}

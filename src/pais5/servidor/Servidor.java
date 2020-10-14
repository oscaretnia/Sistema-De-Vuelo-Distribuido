/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pais5.servidor;

import common.SistemaVuelo;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author Sophy
 */

public class Servidor {
    
    public Servidor() {
        try {
            SistemaVuelo sistemavuelo = new SistemaVueloImpl();
            Registry registro = LocateRegistry.createRegistry(4448);
            registro.bind("sistemaPais5", sistemavuelo);
            System.out.println("Servidor del pais 5 corriendo en puerto 4448");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public static void main (String args[]) {        
        new Servidor();
    }
    
}

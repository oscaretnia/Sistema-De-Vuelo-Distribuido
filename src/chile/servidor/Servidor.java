/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chile.servidor;

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
            Registry registro = LocateRegistry.createRegistry(4447);
            registro.bind("sistemaPais4", sistemavuelo);
            System.out.println("Servidor del pais 4 corriendo en puerto 4447");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public static void main (String args[]) {        
        new Servidor();
    }
    
}

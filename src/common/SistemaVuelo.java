/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author Sophy
 */

public interface SistemaVuelo extends Remote {
    
    public List<Aeropuerto> obtenerAeropuertos() throws RemoteException;
    
    public List<Avion> obtenerAViones() throws RemoteException;
    
    public List<Ruta> obtenerRutas() throws RemoteException;
    
}

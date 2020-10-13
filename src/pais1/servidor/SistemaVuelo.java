/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pais1.servidor;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author Sophy
 */

public interface SistemaVuelo extends Remote {
    
    public List<Avion> obtenerAVionesLocales() throws RemoteException;
    
    public List<Avion> obtenerAVionesExtranjeros() throws RemoteException;
    
    public List<Ruta> obtenerRutasLocales(String estado) throws RemoteException;
    
    public List<Ruta> obtenerRutasExtranjeras(String estado) throws RemoteException;
    
}

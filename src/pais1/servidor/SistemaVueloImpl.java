/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pais1.servidor;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Sophy
 */
public class SistemaVueloImpl extends UnicastRemoteObject implements SistemaVuelo {
    
    private final Datos db;

    public SistemaVueloImpl() throws RemoteException {
        super();
        db = new Datos();
    }
    
    @Override
    public List<Aeropuerto> obtenerAeropuertos() throws RemoteException {
        return null;
    }
    
    @Override
    public List<Avion> obtenerAViones() throws RemoteException {
        return this.db.obtenerAviones();
    }

    @Override
    public List<Ruta> obtenerRutas() throws RemoteException {
        return db.obtenerRutas();
    }   
    
    
}

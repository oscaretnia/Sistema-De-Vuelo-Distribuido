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
    public List<Avion> obtenerAVionesLocales() throws RemoteException {
        return this.db.obtenerAviones();
    }

    @Override
    public List<Avion> obtenerAVionesExtranjeros() throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Ruta> obtenerRutasLocales(String estado) throws RemoteException {
        return new ArrayList<>(db.obtenerRutas().stream().filter(ruta -> ruta.getEstado().equalsIgnoreCase(estado)).collect(Collectors.toList()));
    }

    @Override
    public List<Ruta> obtenerRutasExtranjeras(String estado) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}

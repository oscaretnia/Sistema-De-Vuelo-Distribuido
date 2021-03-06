/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peru.servidor;

import common.Ruta;
import common.Avion;
import common.Aeropuerto;
import common.SistemaVuelo;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

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
        return this.db.getAeropuertos();
    }
    
    @Override
    public List<Avion> obtenerAViones() throws RemoteException {
        return this.db.obtenerAviones();
    }

    @Override
    public List<Ruta> obtenerRutas() throws RemoteException {
        return db.obtenerRutas();
    }  
    
    @Override
    public void insertarAvion(Avion avion) throws RemoteException {
        db.insertarAvion(avion);
    }

    @Override
    public void insertarRuta(Ruta ruta) throws RemoteException {
        db.insertarRuta(ruta);
    }

    @Override
    public boolean eliminarRuta(int id) throws RemoteException {
        return db.eliminarRuta(id);
    }

    @Override
    public boolean eliminarAvion(String matricula) throws RemoteException {
        return db.eliminarAvion(matricula);
    }
    
}

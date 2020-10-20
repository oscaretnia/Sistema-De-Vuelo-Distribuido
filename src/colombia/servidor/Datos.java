/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colombia.servidor;

import common.Aeropuerto;
import common.Avion;
import common.Ruta;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sophy
 */

public class Datos {
    
    private final Aeropuerto aeropuerto;

    public Datos() {
       this.aeropuerto = new Aeropuerto("Colombia");
       this.setDatos();
    }

    private void setDatos() {
        this.setAviones();
        this.setRutas();
    }
    
    private void setAviones() {
        
        List<Avion> aviones = new ArrayList<>();
        
        //crear aviones
        Avion avion1 = new Avion(this.aeropuerto.getPais(), "Colombia", "Mexico", "hdh7483", 130, "03-10-2020");
        
        //agregar aviones
        
        aviones.add(avion1);
        
        this.aeropuerto.setAvionList(aviones);
    }
    
    private void setRutas() {
        
        List<Ruta> rutas = new ArrayList<>();
        
        //crear rutas
        
        Ruta ruta1 = new Ruta(1, this.aeropuerto.getPais(), "Colombia", "Argentina", "Activa");
        Ruta ruta2 = new Ruta(2, this.aeropuerto.getPais(), "Chile", "Colombia", "Disponible");
        
        //agregar rutas
        
        rutas.add(ruta1);
        rutas.add(ruta2);
        
        this.aeropuerto.setRutaList(rutas);
    }
    
    public List<Avion> obtenerAviones() {
        return this.aeropuerto.getAvionList();
    }
    
    public List<Ruta> obtenerRutas() {
        return this.aeropuerto.getRutaList();
    }

    public List<Aeropuerto> obtenerAeropuertos() {
        List<Aeropuerto> aeropuertos = new ArrayList<>();
        aeropuertos.add(this.aeropuerto);
        return aeropuertos;
    }
    
    void insertarAvion(Avion avion) {
        this.aeropuerto.getAvionList().add(avion);
    }
    
    void insertarRuta(Ruta ruta) {
        this.aeropuerto.getRutaList().add(ruta);
    }  
    
    boolean eliminarAvion(String matricula) {
        return this.aeropuerto.getAvionList().remove(obtenerAvionPorMatricula(matricula));
    }
    
    Avion obtenerAvionPorMatricula(String matricula) {
        
        for (Avion avion: this.obtenerAviones()) {
            if (avion.getMatricula() == null ? matricula == null : avion.getMatricula().equals(matricula)) {
                return avion;
            }
        }
        
        return null;
        
    }
    
    boolean eliminarRuta(int id) {
        return this.aeropuerto.getRutaList().remove(obtenerRutaPorId(id));
    }
    
    Ruta obtenerRutaPorId(int id) {
        
        for (Ruta ruta: this.obtenerRutas()) {
            if (ruta.getId() == id) {
                return ruta;
            }
        }
        
        return null;
        
    }
    
}

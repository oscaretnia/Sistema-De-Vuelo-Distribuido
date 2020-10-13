/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pais1.servidor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Sophy
 */

public class Datos {
    
    private final Aeropuerto aeropuerto;

    public Datos() {
       this.aeropuerto = new Aeropuerto();
       this.setDatos();
    }

    public Aeropuerto getAeropuerto() {
        return this.aeropuerto;
    }
    
    private void setDatos() {
        this.setAviones();
        this.setRutas();
    }
    
    private void setAviones() {
        
        List<Avion> aviones = new ArrayList<>();
        
        //crear aviones
        Avion avion1 = new Avion("Pais 1", "Pais 2", "ert2524", 130, "10-12-2020");
        
        //agregar aviones
        
        aviones.add(avion1);
        
        this.aeropuerto.setAvionList(aviones);
    }
    
    private void setRutas() {
        
        List<Ruta> rutas = new ArrayList<>();
        
        //crear rutas
        
        Ruta ruta1 = new Ruta("Pais 1", "Pais 2", "Activa");
        Ruta ruta2 = new Ruta("Pais 2", "Pais 1", "Disponible");
        
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
        
}

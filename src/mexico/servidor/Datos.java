/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mexico.servidor;

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
       this.aeropuerto = new Aeropuerto("Mexico");
       this.setDatos();
    }

    private void setDatos() {
        this.setAviones();
        this.setRutas();
    }
    
    private void setAviones() {
        
        List<Avion> aviones = new ArrayList<>();
        
        //crear aviones
        Avion avion1 = new Avion(this.aeropuerto.getPais(), "Mexico", "Argentina", "yrt7463", 150, "11-02-2020");
        
        //agregar aviones
        
        aviones.add(avion1);
        
        this.aeropuerto.setAvionList(aviones);
    }
    
    private void setRutas() {
        
        List<Ruta> rutas = new ArrayList<>();
        
        //crear rutas
        
        Ruta ruta1 = new Ruta(this.aeropuerto.getPais(), "Mexico", "Argentina", "Activa");
        Ruta ruta2 = new Ruta(this.aeropuerto.getPais(), "Chile", "Mexico", "Disponible");
        
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

    public List<Aeropuerto> getAeropuertos() {
        List<Aeropuerto> aeropuertos = new ArrayList<>();
        aeropuertos.add(this.aeropuerto);
        return aeropuertos;
    }
            
}

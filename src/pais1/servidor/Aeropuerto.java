/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pais1.servidor;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Sophy
 */
public class Aeropuerto implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private final String pais;
    private List<Avion> aviones;
    private List<Ruta> rutas;

    public Aeropuerto() {
        this.pais = "Pais 1";
    }

    public String getPais() {
        return pais;
    }

    public List<Avion> getAvionList() {
        return aviones;
    }

    public void setAvionList(List<Avion> avionList) {
        this.aviones = avionList;
    }

    public List<Ruta> getRutaList() {
        return rutas;
    }

    public void setRutaList(List<Ruta> rutaList) {
        this.rutas = rutaList;
    }
    
}

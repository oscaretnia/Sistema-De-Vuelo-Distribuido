/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.io.Serializable;

/**
 *
 * @author Sophy
 */
public class Avion implements Serializable {
    
    private static final long serialVersionUID = 1L;
   
    private String pais;
    private String origen;
    private String destino;
    private String matricula;
    private int cantidadPasajeros;
    private String fechaVuelo;

    public Avion() {
        
    }

    public Avion(String pais, String origen, String destino, String matricula, int cantidadPasajeros, String fechaVuelo) {
        this.origen = origen;
        this.destino = destino;
        this.matricula = matricula;
        this.cantidadPasajeros = cantidadPasajeros;
        this.fechaVuelo = fechaVuelo;
        this.pais = pais;
    }
    
    public String getPais() {
        return pais;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public String getFechaVuelo() {
        return fechaVuelo;
    }
    
}

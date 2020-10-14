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

public class Ruta implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String pais;
    private String origen;
    private String destino;
    private String estado;

    public Ruta() {
    }

    public Ruta(String pais, String origen, String destino, String estado) {
        this.origen = origen;
        this.destino = destino;
        this.estado = estado;
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}

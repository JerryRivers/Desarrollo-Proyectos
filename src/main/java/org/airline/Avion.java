/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.airline;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 *
 * @author Gerardo.Rios
 */
@Entity
class Avion implements Serializable 
{
    @Id
    @GeneratedValue
    private Long id_avion;
    @OneToOne
    @JoinColumn(name="id_aeropuerto")
    private Aeropuerto id_aeropuerto;
    private String fabricante;
    private String modelo;
    private int capacidad_max;
    private int autonomia;

    public Avion() {
    }

    public Avion(Long id_avion) {
        this.id_avion = id_avion;
    }

    public Avion(Aeropuerto id_aeropuerto) {
        this.id_aeropuerto = id_aeropuerto;
    }

    public Avion(String modelo) {
        this.modelo = modelo;
    }

    public Avion(int capacidad_max) {
        this.capacidad_max = capacidad_max;
    }

    public Avion(Long id_avion, Aeropuerto id_aeropuerto, String fabricante, String modelo, int capacidad_max, int autonomia) {
        this.id_avion = id_avion;
        this.id_aeropuerto = id_aeropuerto;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.capacidad_max = capacidad_max;
        this.autonomia = autonomia;
    }

    public Long getId_avion() {
        return id_avion;
    }

    public void setId_avion(Long id_avion) {
        this.id_avion = id_avion;
    }

    public Aeropuerto getId_aeropuerto() {
        return id_aeropuerto;
    }

    public void setId_aeropuerto(Aeropuerto id_aeropuerto) {
        this.id_aeropuerto = id_aeropuerto;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidad_max() {
        return capacidad_max;
    }

    public void setCapacidad_max(int capacidad_max) {
        this.capacidad_max = capacidad_max;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }
}

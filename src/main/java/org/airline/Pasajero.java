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
public class Pasajero implements Serializable 
{
    @Id
    @GeneratedValue
    private Long id_pasajero;
    @OneToOne
    @JoinColumn(name="id_vuelo")
    private Vuelo id_vuelo;
    private String nombre;
    private String apellido_pat;
    private String apellido_mat;
    private String asiento;
    private String clase;

    public Pasajero() {
    }

    public Pasajero(Long id_pasajero) {
        this.id_pasajero = id_pasajero;
    }

    public Pasajero(Vuelo id_vuelo) {
        this.id_vuelo = id_vuelo;
    }

    public Pasajero(String nombre) {
        this.nombre = nombre;
    }

    public Long getId_pasajero() {
        return id_pasajero;
    }

    public void setId_pasajero(Long id_pasajero) {
        this.id_pasajero = id_pasajero;
    }

    public Vuelo getId_vuelo() {
        return id_vuelo;
    }

    public void setId_vuelo(Vuelo id_vuelo) {
        this.id_vuelo = id_vuelo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido_pat() {
        return apellido_pat;
    }

    public void setApellido_pat(String apellido_pat) {
        this.apellido_pat = apellido_pat;
    }

    public String getApellido_mat() {
        return apellido_mat;
    }

    public void setApellido_mat(String apellido_mat) {
        this.apellido_mat = apellido_mat;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }
}

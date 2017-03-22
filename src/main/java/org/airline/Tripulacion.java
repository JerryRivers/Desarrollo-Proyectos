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

/**
 *
 * @author Gerardo.Rios
 */
@Entity
class Tripulacion implements Serializable 
{
    @Id
    @GeneratedValue
    private Long id_usuario_trip;
    private String nombre;
    private String apellido_pat;
    private String apellido_mat;

    public Tripulacion() {
    }

    public Tripulacion(Long id_usuario_trip) {
        this.id_usuario_trip = id_usuario_trip;
    }

    public Tripulacion(String nombre) {
        this.nombre = nombre;
    }

    public Long getId_usuario_trip() {
        return id_usuario_trip;
    }

    public void setId_usuario_trip(Long id_usuario_trip) {
        this.id_usuario_trip = id_usuario_trip;
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
}

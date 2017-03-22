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
class Personal implements Serializable 
{
    @Id
    @GeneratedValue
    private Long id_empleado;
    @OneToOne
    @JoinColumn(name="id_aeropuerto")
    private Aeropuerto id_aeropuerto;
    @OneToOne
    @JoinColumn(name="id_usuario_sys")
    private Sistemas id_usuario_sys;
    @OneToOne
    @JoinColumn(name="id_usuario_trip")
    private Tripulacion id_usuario_trip;
    private String categoria_pro;
    private String puesto;

    public Personal() {
    }

    public Personal(Long id_empleado) {
        this.id_empleado = id_empleado;
    }

    public Personal(Aeropuerto id_aeropuerto) {
        this.id_aeropuerto = id_aeropuerto;
    }

    public Personal(Sistemas id_usuario_sys) {
        this.id_usuario_sys = id_usuario_sys;
    }

    public Personal(Tripulacion id_usuario_trip) {
        this.id_usuario_trip = id_usuario_trip;
    }

    public Personal(String puesto) {
        this.puesto = puesto;
    }

    public Long getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(Long id_empleado) {
        this.id_empleado = id_empleado;
    }

    public Aeropuerto getId_aeropuerto() {
        return id_aeropuerto;
    }

    public void setId_aeropuerto(Aeropuerto id_aeropuerto) {
        this.id_aeropuerto = id_aeropuerto;
    }

    public Sistemas getId_usuario_sys() {
        return id_usuario_sys;
    }

    public void setId_usuario_sys(Sistemas id_usuario_sys) {
        this.id_usuario_sys = id_usuario_sys;
    }

    public Tripulacion getId_usuario_trip() {
        return id_usuario_trip;
    }

    public void setId_usuario_trip(Tripulacion id_usuario_trip) {
        this.id_usuario_trip = id_usuario_trip;
    }

    public String getCategoria_pro() {
        return categoria_pro;
    }

    public void setCategoria_pro(String categoria_pro) {
        this.categoria_pro = categoria_pro;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
}

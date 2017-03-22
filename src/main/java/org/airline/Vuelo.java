/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.airline;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Gerardo.Rios
 */
@Entity
public class Vuelo implements Serializable 
{
    @Id
    @GeneratedValue
    private Long id_vuelo;
    @OneToOne
    @JoinColumn(name="id_aeropuerto_orig")
    private Aeropuerto puerto_origen;
    @OneToOne
    @JoinColumn(name="id_aeropuerto_dest")
    private Aeropuerto puerto_destino;
    @OneToOne
    @JoinColumn(name="id_avion")
    private Avion id_avion;
    @OneToOne
    @JoinColumn(name="id_empleado")
    private Personal id_empleado;
    @Temporal(TemporalType.DATE)
    private Date fecha_vuelo;

    public Vuelo() 
    {}

    public Vuelo(Long id_vuelo) 
    {
        this.id_vuelo = id_vuelo;
    }

    public Vuelo(Aeropuerto puerto_destino) 
    {
        this.puerto_destino = puerto_destino;
    }

    public Vuelo(Avion id_avion) 
    {
        this.id_avion = id_avion;
    }

    public Vuelo(Personal id_empleado) 
    {
        this.id_empleado = id_empleado;
    }

    public Vuelo(Date fecha_vuelo) 
    {
        this.fecha_vuelo = fecha_vuelo;
    }

    public Vuelo(Long id_vuelo, Aeropuerto puerto_origen, Aeropuerto puerto_destino, Avion id_avion, Personal id_empleado, Date fecha_vuelo) 
    {
        this.id_vuelo = id_vuelo;
        this.puerto_origen = puerto_origen;
        this.puerto_destino = puerto_destino;
        this.id_avion = id_avion;
        this.id_empleado = id_empleado;
        this.fecha_vuelo = fecha_vuelo;
    }
    
    public Long getId_vuelo() {
        return id_vuelo;
    }

    public void setId_vuelo(String apellido_mat) {
        this.id_vuelo = id_vuelo;
    }
}

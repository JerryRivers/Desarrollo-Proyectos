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
public class Aeropuerto implements Serializable
{
    @Id
    @GeneratedValue
    private Long id_aeropuerto;
    private String nombre;
    private String localizacion;

    public Aeropuerto() 
    {}

    public Aeropuerto(Long id_aeropuerto) 
    {
        this.id_aeropuerto = id_aeropuerto;
    }

    public Aeropuerto(String nombre) 
    {
        this.nombre = nombre;
    }

    public Aeropuerto(Long id_aeropuerto, String nombre, String localizacion) 
    {
        this.id_aeropuerto = id_aeropuerto;
        this.nombre = nombre;
        this.localizacion = localizacion;
    }

    public Long getId_aeropuerto() 
    {
        return id_aeropuerto;
    }

    public void setId_aeropuerto(Long id_aeropuerto) 
    {
        this.id_aeropuerto = id_aeropuerto;
    }

    public String getNombre() 
    {
        return nombre;
    }
    
    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public String getLocalizacion() 
    {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) 
    {
        this.localizacion = localizacion;
    }
}

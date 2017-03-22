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
public class Sistemas implements Serializable 
{
    @Id
    @GeneratedValue
    private Long id_usuario_sys;
    private String nombre;
    private String apellido_pat;
    private String apellido_mat;
    private String usuario;
    private String password;

    public Sistemas() {
    }

    public Sistemas(Long id_usuario_sys) {
        this.id_usuario_sys = id_usuario_sys;
    }

    public Sistemas(String nombre, 
            String apellido_pat, String apellido_mat, 
            String usuario, String password) 
    {
        this.nombre = nombre;
        this.apellido_pat = apellido_pat;
        this.apellido_mat = apellido_mat;
        this.usuario=usuario;
        this.password=password;
    }

    public Long getId_usuario_sys() {
        return id_usuario_sys;
    }

    public void setId_usuario_sys(Long id_usuario_sys) {
        this.id_usuario_sys = id_usuario_sys;
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

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}

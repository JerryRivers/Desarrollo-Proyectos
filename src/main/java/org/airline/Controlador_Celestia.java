/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.airline;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Gerardo.Rios
 */
@RestController
public class Controlador_Celestia 
{
    @Autowired Repositorio_Aeropuerto repoAero;
    @Autowired Repositorio_Avion repoAvion;
    @Autowired Repositorio_Pasajero repoPas;
    @Autowired Repositorio_Personal repoPer;
    @Autowired Repositorio_Sistemas repoSys;
    @Autowired Repositorio_Tripulacion repoTrip;
    @Autowired Repositorio_Vuelo repoVuelo;
    //@CrossOrigin sirve para que las funciones REST funcionen en el navegador web
    @CrossOrigin
    @RequestMapping(value="/sistemas/{nombre}/{apellido_pat}/{apellido_mat}/"
            + "{usuario}/{password}", method=RequestMethod.POST, 
            headers={"Accept=text/html"})
    public String guardar(@PathVariable String nombre, 
            @PathVariable String apellido_pat, 
            @PathVariable String apellido_mat,
            @PathVariable String usuario,
            @PathVariable String password)
    {
        repoSys.save(new Sistemas(nombre,apellido_pat,apellido_mat,usuario,password));
        return "Mensaje guardado con exito!!!";
    }
    @CrossOrigin
    @RequestMapping(value="/sistemas/{id_usuario_sys}", 
            method=RequestMethod.GET, headers={"Accept=application/json"})
    public String buscarId(@PathVariable Long id_usuario_sys) throws Exception
    {
        Sistemas user_sys=repoSys.findOne(id_usuario_sys);
        ObjectMapper mapeo=new ObjectMapper();
        return mapeo.writeValueAsString(user_sys);
    }
    //----------------------BuscarTodos-----------------------
    @CrossOrigin
    @RequestMapping(value="/sistemas", 
            method=RequestMethod.GET, headers={"Accept=application/json"})
    public String buscarTodos() throws Exception
    {
        ArrayList<Sistemas> user_sys=(ArrayList<Sistemas>) repoSys.findAll();
        ObjectMapper mapeo=new ObjectMapper();
        return mapeo.writeValueAsString(user_sys);
    }
    //---------------------Actualizar-------------------------
    @CrossOrigin
    @RequestMapping(value="/mensaje/{id_usuario_sys}//{apellido_pat}/"
            + "{apellido_mat}/{usuario}/{password}", method=RequestMethod.PUT, 
            headers={"Accept=text/html"})
    public String Actualizar(@PathVariable String nombre, 
            @PathVariable String apellido_pat, 
            @PathVariable String apellido_mat,
            @PathVariable String usuario,
            @PathVariable String password)
    {
        Sistemas user_sys=new Sistemas(nombre,apellido_pat,apellido_mat,usuario,password);
        repoSys.save(user_sys);
        return "Mensaje Actualizado con éxito";
    }
}

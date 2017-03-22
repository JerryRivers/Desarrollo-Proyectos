/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.airline;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.CustomLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Panel;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;

/**
 *
 * @author Gerardo.Rios
 */
@SpringUI
@Title("CelestiaQuery")
@Theme("valo")
public class CelestiaLogin extends UI
{
    @Override
    protected void init(VaadinRequest request)
    {
        //Vista final para la UI
        final VerticalLayout layout=new VerticalLayout();
        
        Panel loginPanel = new Panel("Login");
        CustomLayout login = new CustomLayout("LoginLayout");
        //Sección de Vista del Login
        //VerticalLayout login=new VerticalLayout(); 
        Label label=new Label("Iniciar Sesión / Registrarse"); 
        TextField user = new TextField("","Usuario");
        TextField passwd = new TextField("","Contraseña");
        
        Button init_session=new Button("Iniciar Sesión");
            init_session.setStyleName(ValoTheme.BUTTON_PRIMARY);
            init_session.addClickListener(cliqueo ->{
            Notification.show("Bienvenido "+user.getValue());
            });
       
        login.addComponent(label);
        login.addComponent(user);
        login.addComponent(passwd);
        login.addComponent(init_session);
        login.setWidth("500px");
        //login.setMargin(true);
        login.setResponsive(true);
        
        layout.addComponent(login);
        layout.setComponentAlignment(login, Alignment.MIDDLE_CENTER);
        setContent(login);
    }
}

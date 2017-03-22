/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Gerardo.Rios
 * Created: 20-mar-2017
 */
create table Aeropuerto
(
    id_aeropuerto integer primary key not null auto_increment, 
    nombre varchar(20), localizacion varchar(20)
);

create table Sistemas
(
    id_usuario_sys integer primary key not null auto_increment,
    nombre varchar(20), apellido_pat varchar(20), apellido_mat varchar(20),
    usuario varchar(8), password varchar(8)
);

create table Tripulacion
(
    id_usuario_trip integer primary key not null auto_increment,
    nombre varchar(20), apellido_pat varchar(20), apellido_mat varchar(20)
);

create table Avion
(
    id_avion integer primary key not null auto_increment,
    id_aeropuerto integer, fabricante varchar(20),
    modelo varchar(20), capacidad_max integer,
    autonomia integer, foreign key(id_aeropuerto) references Aeropuerto(id_aeropuerto)
);

create table Personal
(
    id_empleado integer primary key not null auto_increment,
    id_aeropuerto integer, id_usuario_sys integer, id_usuario_trip integer, 
    categoria_pro varchar (20), puesto varchar(20),
    foreign key(id_aeropuerto) references Aeropuerto(id_aeropuerto),
    foreign key(id_usuario_sys) references Sistemas(id_usuario_sys),
    foreign key(id_usuario_trip) references Tripulacion(id_usuario_trip)
);

create table Vuelo
(
    id_vuelo integer primary key not null auto_increment,
    id_aeropuerto_orig integer, id_aeropuerto_dest integer,
    id_avion integer, id_empleado integer, fecha_vuelo date,
    foreign key(id_aeropuerto_orig) references Aeropuerto(id_aeropuerto),
    foreign key(id_aeropuerto_dest) references Aeropuerto(id_aeropuerto),
    foreign key(id_avion) references Avion(id_avion),
    foreign key(id_empleado) references Personal(id_empleado)
);

create table Pasajero
(
    id_pasajero integer primary key not null auto_increment,
    id_vuelo integer, nombre varchar(20), apellido_pat varchar(20),
    apellido_mat varchar(20), asiento varchar(4), clase varchar(15),
    foreign key(id_vuelo) references Vuelo(id_vuelo)
);


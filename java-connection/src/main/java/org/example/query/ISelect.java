package org.example.query;

import org.example.clases.Persona;

import java.util.List;

public interface ISelect {

    Persona getPersonID(int id);
    Persona getPersonNombre(String nombre);
    List<Persona> getPersonas();


}

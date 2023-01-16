package org.example;

import org.example.clases.Persona;
import org.example.query.ISelect;
import org.example.query.Select;

import java.util.List;

public class Main {


    public static void main(String[] args) {
        ISelect select = new Select();

        //Persona persona = select.getPersonID(1);
        //Persona persona = select.getPersonNombre("Juan");
        List<Persona> personas = select.getPersonas();
        //for
        /*for (int i = 0; i < personas.size(); i++) {
            System.out.println(personas.get(i).toString());
        }*/
        //for
        /*for(Persona p: personas){
            System.out.println(p.toString());
        }*/
        //foreach

        personas.forEach(p->{
            System.out.println(p.toString());
        });

    }


}
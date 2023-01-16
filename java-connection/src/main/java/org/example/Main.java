package org.example;

import org.example.clases.Persona;
import org.example.query.*;

import java.util.List;

public class Main {


    public static void main(String[] args) {
        ISelect select = new Select();
        ICreate create = new Create();
        IUpdate update = new Update();
        IDelete delete = new Delete();

        //Persona persona = select.getPersonID(1);
        //Persona persona = select.getPersonNombre("Juan");

        //for
        /*for (int i = 0; i < personas.size(); i++) {
            System.out.println(personas.get(i).toString());
        }*/
        //for
        /*for(Persona p: personas){
            System.out.println(p.toString());
        }*/
        //foreach

        /*personas.forEach(p -> {
            System.out.println(p.toString());
        });*/

        Persona cp = new Persona();
        cp.setId(1);
        cp.setNombre("Luis");
        //int result = create.create(cp);
        //int result = update.update(cp);
        int result = delete.delete(5);
        System.out.println(result + " row affect");

        List<Persona> personas = select.getPersonas();

        personas.forEach(p -> {
            System.out.println(p.toString());
        });
    }


}
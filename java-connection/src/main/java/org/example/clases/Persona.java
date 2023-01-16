package org.example.clases;

public class Persona {

    private int id;
    private String nombre;

    //GET
    public int getId() {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }
    //SET

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}

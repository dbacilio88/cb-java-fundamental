package org.example.query;

import org.example.clases.Persona;
import org.example.connection.ConnectionDb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Select implements ISelect {

    private Connection connection;
    private PreparedStatement statement;
    private ResultSet result;
    private ConnectionDb db;

    public Select() {
        db = new ConnectionDb();
    }

    //jdbc = query consultas custom
    //jpa hibernate. ORM

    @Override
    public Persona getPersonID(int id) {
        Persona persona = new Persona();
        try {

            connection = db.getConnection();
            String sql = "SELECT * FROM PERSONA WHERE ID = ?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            result = statement.executeQuery();

            while (result.next()) {
                persona.setId(result.getInt("id"));
                persona.setNombre(result.getString("nombre"));
            }


        } catch (Exception e) {
            System.out.println("Error de consulta " + e.getMessage());
        }

        return persona;
    }

    @Override
    public Persona getPersonNombre(String nombre) {
        Persona persona = new Persona();
        try {

            connection = db.getConnection();
            String sql = "SELECT * FROM PERSONA WHERE NOMBRE = ?";
            statement = connection.prepareStatement(sql);
            statement.setString(1, nombre);
            result = statement.executeQuery();

            while (result.next()) {
                persona.setId(result.getInt("id"));
                persona.setNombre(result.getString("nombre"));
            }


        } catch (Exception e) {
            System.out.println("Error de consulta " + e.getMessage());
        }

        return persona;
    }

    @Override
    public List<Persona> getPersonas() {

        List<Persona> personas = new ArrayList<>();

        try {

            connection = db.getConnection();
            String sql = "SELECT * FROM PERSONA";
            statement = connection.prepareStatement(sql);
            result = statement.executeQuery();

            while (result.next()) {
                Persona persona = new Persona();
                persona.setId(result.getInt("id"));
                persona.setNombre(result.getString("nombre"));
                personas.add(persona);
            }
        } catch (Exception e) {
            System.out.println("Error de consulta " + e.getMessage());
        }

        return personas;
    }
}

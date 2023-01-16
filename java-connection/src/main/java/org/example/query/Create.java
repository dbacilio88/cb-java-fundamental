package org.example.query;

import org.example.clases.Persona;
import org.example.connection.ConnectionDb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Create implements ICreate {


    private Connection connection;
    private PreparedStatement statement;
    private ResultSet result;
    private ConnectionDb db;

    public Create() {
        db = new ConnectionDb();
    }

    @Override
    public int create(Persona persona) {
        int result = 0;
        try {
            connection = db.getConnection();
            String sql = "INSERT INTO PERSONA(ID,NOMBRE) VALUES(?,?)";
            statement = connection.prepareStatement(sql);
            statement.setInt(1, persona.getId());
            statement.setString(2, persona.getNombre());
            result = statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error de consulta " + e.getMessage());
        }
        try {
            statement.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println("Error de cierre de session " + e.getMessage());
        }
        return result;
    }
}

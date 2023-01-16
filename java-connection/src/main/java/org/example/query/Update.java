package org.example.query;

import org.example.clases.Persona;
import org.example.connection.ConnectionDb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Update implements IUpdate {


    private Connection connection;
    private PreparedStatement statement;
    private ResultSet result;
    private ConnectionDb db;

    public Update() {
        db = new ConnectionDb();
    }

    @Override
    public int update(Persona persona) {
        int result = 0;
        try {
            connection = db.getConnection();
            String sql = "UPDATE PERSONA SET NOMBRE = ? WHERE ID = ?";
            statement = connection.prepareStatement(sql);
            statement.setString(1, persona.getNombre());
            statement.setInt(2, persona.getId());
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

package org.example.query;

import org.example.clases.Persona;
import org.example.connection.ConnectionDb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete implements IDelete {


    private Connection connection;
    private PreparedStatement statement;

    private ConnectionDb db;

    public Delete() {
        db = new ConnectionDb();
    }

    @Override
    public int delete(int id) {
        int result = 0;
        try {

            connection = db.getConnection();
            String sql = "DELETE FROM PERSONA WHERE ID = ?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            result = statement.executeUpdate();

        } catch (Exception e) {
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

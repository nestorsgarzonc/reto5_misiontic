package core;

import java.sql.*;

public final class DbHelper {

    private Connection conn = null;

    public DbHelper() throws CustomException {
        connect();
    }

    public void connect()
            throws CustomException {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/misiontic", "root", "sebastian"
            );
            if (conn == null) {
                throw new CustomException("Error conectando a la DB");
            }
            System.out.println("Connected to DB");
        } catch (SQLException | ClassNotFoundException ex) {
            throw new CustomException("Error conectando a la DB");
        }

    }

    public ResultSet select(String query) throws CustomException {
        try {
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(query);
            return result;
        } catch (SQLException ex) {
            throw new CustomException("No se pudo obtener los datos");
        }
    }

    public void delete(String query) throws CustomException {
        try {
            Statement statement = conn.createStatement();
            int rowsDeleted = statement.executeUpdate(query);
            if (rowsDeleted > 0) {
                System.out.println("Deleted successfully");
            } else {
                throw new CustomException("No se pudo eliminar el registro solicitado");
            }
        } catch (SQLException ex) {
            throw new CustomException("Ha ocurrido un error");
        }
    }

    public void update(String query) throws CustomException {
        try {
            Statement statement = conn.createStatement();
            int rowsDeleted = statement.executeUpdate(query);
            if (rowsDeleted > 0) {
                System.out.println("Updated successfully");
            } else {
                throw new CustomException("No se pudo actualizar el registro solicitado");
            }
        } catch (SQLException ex) {
            throw new CustomException("Ha ocurrido un error");
        }
    }

    public void create(String query) throws CustomException {
        try {
            Statement statement = conn.createStatement();
            int rowsDeleted = statement.executeUpdate(query);
            if (rowsDeleted > 0) {
                System.out.println("Updated successfully");
            } else {
                throw new CustomException("No se pudo crear");
            }
        } catch (SQLException ex) {
            System.out.println(ex);
            throw new CustomException("Ha ocurrido un error");
        }
    }
}

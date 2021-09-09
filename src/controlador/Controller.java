/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import core.CustomException;
import core.DbHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Director;
import reto5java.Reto5JAVA;

/**
 *
 * @author nesto
 */
public class Controller {

    public static String deleteDirector(Director director) {
        try {
            DbHelper db = new DbHelper();
            db.delete(director.toDeleteSQL());
            return "Eliminado correctamente";
        } catch (CustomException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
            return ex.getMessage();
        }
    }

    public static String updateDirector(Director director, String newDirectorName, String newNationality, String newImageUrl) {
        try {
            DbHelper db = new DbHelper();
            db.update(director.toUpdateSQL(newDirectorName, newNationality, newImageUrl));
            return "Actualizado correctamente";
        } catch (CustomException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
            return ex.getMessage();
        }
    }

    public static String createDirector(Director director) {
        try {
            DbHelper db = new DbHelper();
            db.create(director.toCreateSQL());
            return "Creado correctamente";
        } catch (CustomException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
            return ex.getMessage();
        }
    }

    public static Director getDirectorByName(String name) {
        try {
            DbHelper db = new DbHelper();
            Director director = new Director();
            ResultSet result = db.select(director.toSelectByNameSQL(name));
            try {
                while (result.next()) {
                    director = new Director(result.getInt(1), result.getString(2), result.getString(3), result.getString(4));
                }
            } catch (SQLException ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
            return director;
        } catch (CustomException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static ArrayList<Director> getDirectors() {
        try {
            DbHelper db = new DbHelper();
            Director director = new Director();
            ResultSet result = db.select(director.toSelectSQL());
            ArrayList<Director> directors = parseDirectors(result);
            return directors;
        } catch (CustomException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    private static ArrayList<Director> parseDirectors(ResultSet result) {
        ArrayList<Director> directors = new ArrayList();
        try {
            while (result.next()) {
                Director temp = new Director(result.getInt(1), result.getString(2), result.getString(3), result.getString(4));
                directors.add(temp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Reto5JAVA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return directors;
    }

}

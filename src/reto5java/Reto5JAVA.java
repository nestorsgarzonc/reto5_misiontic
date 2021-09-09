package reto5java;

import controlador.Controller;
import core.CustomException;
import core.DbHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Director;

/**
 *
 * @author Angela and Sebastian ;)
 */
public class Reto5JAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //GET ALL
        ArrayList<Director> directors = Controller.getDirectors();
        System.out.println(directors);
        
        //GET BY NAME
//        Director director = Controller.getDirectorByName("Hayo Miyazaki");
//        System.out.println(director);

        //CREATE NEW DIRECTOR
//        Director newDirector = new Director(
//                "NW",
//                "Someone"
//        );
        //String res = Controller.createDirector(newDirector);
        //System.out.println(res);

        //UPDATE:
        //String res=Controller.updateDirector(directors.get(4), "SomeName", null, null);
        //System.out.println(res);
        
        //DELETE
        //String res = Controller.deleteDirector(directors.get(4));
        //System.out.println(res);

    }

}

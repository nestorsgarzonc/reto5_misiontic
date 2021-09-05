package reto5java;
import core.CustomException;
import core.DbHelper;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Angela and Sebastian ;)
 */
public class Reto5JAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            DbHelper db = new DbHelper();
            // ResultSet result = db.select("select * from director;");
            // while (result.next()) {
            // System.out.println(result.getString(1) + " " + result.getString(2));
            // }
            
            //db.update("DELETE FROM director where nationality = 'colombian'");
            Director director = new Director();
            db.update(director.toUpdateSQL(null, "asddas"));
            db.update("UPDATE director SET nationality='chichombiano' where nationality = 'chichombiano :v'");
        } catch (CustomException ex) {
            System.out.println(ex.getMessage());
        }
    }

}

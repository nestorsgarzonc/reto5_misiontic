package modelo;

/**
 * TABLE: create table director( id int AUTO_INCREMENT, director_name char(255),
 * nationality char(255), image_url char(255), primary key (id) );
 *
 */
public class Director {
    //TODO: Finalizar metodos y poner atributos
    private String name;
    
    public String toCreateSQL(String name, String nationality, String imageUrl) {
        return "";
    }

    public String toSelectSQL(String name, String nationality, String imageUrl) {
        return "";
    }

    public String toUpdateSQL(String newName, String newNationality, String newImageUrl) {
        return "";
    }

    public String toDeleteSQL() {
        return "";
    }
}

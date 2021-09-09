package modelo;

import core.CustomException;

/**
 * TABLE: create table director( id int AUTO_INCREMENT, director_name char(255),
 * nationality char(255), image_url char(255), primary key (id) );
 *
 */
public class Director {

    public Integer id;
    public String director_name;
    public String nationality;
    public String image_url;

    public Director() {
    }

    public Director(String director_name, String nationality, String image_url) {
        this.director_name = director_name;
        this.nationality = nationality;
        this.image_url = image_url;
    }
    
    public Director(String director_name, String nationality) {
        this.director_name = director_name;
        this.nationality = nationality;
       
    }

    public Director(Integer id, String director_name, String nationality, String image_url) {
        this.id = id;
        this.director_name = director_name;
        this.nationality = nationality;
        this.image_url = image_url;
    }

    public String toCreateSQL() {
        if(image_url==null){
            return "Insert into director(director_name, nationality) values (" + " '" + director_name + "', '"
                + nationality + "';";
        }
        return "Insert into director(director_name, nationality, image_url) values (" + " '" + director_name + "', '"
                + nationality + "' , '" + image_url + "');";
    }

    public String toSelectSQL() {
        return "Select * from director;";
    }

    public String toSelectByNameSQL(String name) {
        return "Select * from director WHERE director_name='" + name + "';";
    }

    public String toUpdateSQL(String newDirectorName, String newNationality, String newImageUrl) throws CustomException {
        if (newDirectorName != null) {
            return "Update director SET director_name= '" + newDirectorName + "' " + "Where director_name= '"
                    + director_name + "';";
        }
        if (newNationality != null) {
            return "Update director SET nationality= '" + newNationality + "' " + "where nationality= '" + nationality
                    + "';";
        }
        if (newImageUrl != null) {
            return "Update director SET image_url= '" + newImageUrl + "' " + "where image_url= '" + image_url + "' ";
        } else {
            throw new CustomException("Debes actualizar uno de los campos");
        }
    }

    public String toDeleteSQL() {
        return "DELETE FROM director WHERE id=" + id;
    }

    public String getDirector_name() {
        return director_name;
    }

    public void setDirector_name(String director_name) {
        this.director_name = director_name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    @Override
    public String toString() {
        return "Director{" + "id=" + id + ", director_name=" + director_name + ", nationality=" + nationality + ", image_url=" + image_url + '}';
    }
}

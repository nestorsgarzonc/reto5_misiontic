/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Angela
 */
public class presentación {

    private int id_director;
    private char d_nombre;
    private char d_apellido;
    private char d_nacionalidad;

    public presentación(int id_director, char d_nombre, char d_apellido, char d_nacionalidad) {
        this.id_director = id_director;
        this.d_nombre = d_nombre;
        this.d_apellido = d_apellido;
        this.d_nacionalidad = d_nacionalidad;
    }

    /**
     * @return the id_director
     */
    public int getId_director() {
        return id_director;
    }

    /**
     * @return the d_nombre
     */
    public char getD_nombre() {
        return d_nombre;
    }

    /**
     * @param d_nombre the d_nombre to set
     */
    public void setD_nombre(char d_nombre) {
        this.d_nombre = d_nombre;
    }

    /**
     * @return the d_apellido
     */
    public char getD_apellido() {
        return d_apellido;
    }

    /**
     * @param d_apellido the d_apellido to set
     */
    public void setD_apellido(char d_apellido) {
        this.d_apellido = d_apellido;
    }

    /**
     * @return the d_nacionalidad
     */
    public char getD_nacionalidad() {
        return d_nacionalidad;
    }

    /**
     * @param d_nacionalidad the d_nacionalidad to set
     */
    public void setD_nacionalidad(char d_nacionalidad) {
        this.d_nacionalidad = d_nacionalidad;
    }

    public String toCreateQuery() {
        return "insert into director (director_name, nationality) values ('Vincent Ward', 'neozelandes');";
    }
}

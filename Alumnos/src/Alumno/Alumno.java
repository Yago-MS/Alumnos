package Alumno;

/**
 * Alumno.java Definición de la clase Alumno
 *
 * @author Yago
 * V1.2
 * modificacíon de la variable nota
 */
public class Alumno {

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the nota
     */
    public double getNota() {
        return nota;
    }

    /**
     * @param nota the nota to set
     */
    public void setNota(double nota) {
        this.nota = nota;
    }

    private String nombre;
    private double nota;

}

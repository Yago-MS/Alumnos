package alumnos;
/**
 * Alumno.java Definición del programa de alumnos
 *
 * @author Luis José Sánchez
 * @version V 1.2
 */
import Alumno.Alumno;
import java.util.Scanner;

public class Alumnos {

    /*
    * Definición de la función registraAlumno
    *for i
    *
    * @param Alumno[] parametro objeto array
    */
    public static void registraAlumnos(Alumno[] alum) {
        Scanner entrada = new Scanner(System.in);
        String nombreIntroducido;
        double notaIntroducida;
        for (int i = 0; i < 5; i++) {
            alum[i] = new Alumno();
            System.out.print("Alumno " + i + "\nNombre: ");
            nombreIntroducido = entrada.nextLine();
            (alum[i]).setNombre(nombreIntroducido);
            System.out.print("Nota media: ");
            notaIntroducida = entrada.nextDouble();
            alum[i].setNota(notaIntroducida);
        } 

    }
    /*
    * Definición de la función muestraAlumno
    * 
    * @param Alumno[] parametro objeto array
    * @param i indice del objeto array 
    */
    public static void muestraAlumno(Alumno[] alum, int i){
             System.out.println("Alumno " + i 
                     + "\nNombre: " + alum[i].getNombre() 
                     + "\nNota media: " + alum[i].getNota()
                     + "\n----------------------------");
    }
    
    public static void main(String[] args) {
        
        // Define la estructura, un array de 5 alumnos
        // pero no crea los objetos
        Alumno[] alum = new Alumno[5];

        // Pide los datos de los alumnos /////////////////////////////////
        System.out.println("A continuacion debera introducir el nombre y la nota media de 5 alumnos.");
        
        //llamada a la funcion registraAlumnos
        registraAlumnos(alum);
        
        // Muestra los datos de los alumnos /////////////////////////////////
        System.out.println("Los datos introducidos son los siguientes:");

        double sumaDeMedias = 0;

        for (int i = 0; i < 5; i++) {
            //Llamada a la funcion muestraAlumnos
            muestraAlumno(alum, i);
            sumaDeMedias += alum[i].getNota();
        } 

        System.out.println("La media global de la clase es " + sumaDeMedias / 5);
    }
}

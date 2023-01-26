/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g06.e01;

import java.util.Scanner;

/**
 * Crear una clase llamada Libro que contenga los siguientes atributos: ISBN,
 * Título, Autor, Número de páginas, y un constructor con todos los atributos
 * pasados por parámetro y un constructor vacío. Crear un método para cargar un
 * libro pidiendo los datos al usuario y luego informar mediante otro método el
 * número de ISBN, el título, el autor del libro y el numero de páginas.
 *
 * @author Cristian
 */
public class G06E01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Libro lib1 = new Libro();
        System.out.println("Ingrese el ISBN");
        int isbn = leer.nextInt();
        System.out.println("Ingrese el titulo");
        String titulo = leer.next();
        System.out.println("Ingrese el autor");
        String autor = leer.next();
        System.out.println("Ingrese la cantidad de paginas");
        int nropag = leer.nextInt();
        
        lib1.cargarLibro(isbn,titulo,autor,nropag);
        lib1.mostrarLibro();
    }

}

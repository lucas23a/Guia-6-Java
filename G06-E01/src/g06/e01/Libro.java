/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g06.e01;

/**
 *
 * @author Cristian
 */
public class Libro {
    public int isbn;
    public String titulo;
    public String autor;
    public int nropag;

    public Libro() {
    }

    public Libro(int isbn, String titulo, String autor, int nropag) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.nropag = nropag;
    }


    
    public void cargarLibro(int isbn, String titulo, String autor, int nropag){
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.nropag = nropag;
        
    }
    
    public void mostrarLibro(){
            System.out.println("El ISBN es " + isbn);
            System.out.println("El titulo del libro es " + titulo);
            System.out.println("Del autor " + autor);
            System.out.println("La cantidad de paginas es " + nropag);
}
   
    
    
}

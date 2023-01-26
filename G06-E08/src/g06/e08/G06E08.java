/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g06.e08;

import cadena.service.Cad_Service;
import java.util.Scanner;
import newpackage.cadena.Cadena;

/**
 *Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
la frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 * @author Cristianhola
 */
public class G06E08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Cad_Service cs1 = new Cad_Service();
            Cadena cad1 = cs1.ingresarFrase();
        cs1.mostrarVocales(cad1);
        cs1.invertirCadena(cad1);
        System.out.println("Ingrese una segunda frase");
        cs1.cad2 = String.valueOf(leer.nextLine());
        cs1.compararLongitud(cad1, cs1.cad2);
        cs1.juntar = cad1.getFrase().concat(" " + cs1.cad2);
        cs1.unirFrases(cad1, cs1.cad2, cs1.juntar);
        cs1.reemplazarA(cs1.juntar);
        cs1.contieneLetra(cs1.juntar);

    }

}

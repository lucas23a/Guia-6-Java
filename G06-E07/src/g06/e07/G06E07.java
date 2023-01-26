/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g06.e07;

import datos.persona.Persona;
import java.util.Scanner;

/*  System.out.println("Nombre de la persona");
        per1.setNombre(leer.next());
        System.out.println("Edad");
        per1.setEdad(leer.nextInt());
        System.out.println("Sexo - H/ hombre , M/mujer");
        per1.setSexo(leer.next());
        if ((per1.getSexo().equalsIgnoreCase("h")) || (per1.getSexo().equalsIgnoreCase("m"))) {
            
        } else {
            System.out.println("Sexo no valido");
        }
        System.out.println("Peso");
        per1.setPeso(leer.nextDouble());
        System.out.println("Altura");
        per1.setAltura(leer.nextDouble());
 */
/**
 *Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
atributo, puede hacerlo. Los métodos que se implementarán son:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
 Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
 Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas

cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores
 * @author Cristian
 */
public class G06E07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int contg = 0;
        int contf = 0;
        int contok = 0;
double imc;
        Persona per1 = new Persona();
        Persona per2 = new Persona();
        Persona per3 = new Persona();
        Persona per4 = new Persona();

       /*   per1.crearPersona(per1.getNombre(), 0, per1.getSexo(), 0, 0);

        if (per1.calcularIMC() == 1) {
            contg++;
        } else if (per1.calcularIMC() == 0) {
            contok++;
        } else if (per1.calcularIMC() == -1) {
            contf++;
        }

        per1.x(per1.getEdad());
*/
       
       //LO IDEAL ES USAR SERVICE
       
       
          per1.crearPersona(per1.getNombre(), 0, per1.getSexo(), 0, 0);
        per1.calcularIMC(per1.getPeso(), per1.getAltura(),per1.cImc);
        imc = per1.getPeso() / Math.pow(per1.getAltura(), 2);
        per1.cImc= 0;
        if (imc < 20) {
            per1.cImc = per1.cImc -1;
            contf++;
            System.out.println("la persona se encuentra por debajo de su peso");
        } else if ((imc > 19) && (imc < 26)) {
            per1.cImc = 0;
             contok++;
            System.out.println("La persona esta en su peso ideal");
        } else if(imc > 25) {
            per1.cImc=per1.cImc + 1;
             contg++;
            System.out.println("La persona tiene sobrepeso");
        }
        per1.x(per1.getEdad());
       
         per2.crearPersona(per2.getNombre(), 0, per2.getSexo(), 0, 0);
        per2.calcularIMC(per2.getPeso(), per2.getAltura(),per2.cImc);
         imc = per2.getPeso() / Math.pow(per2.getAltura(), 2);
        per2.cImc= 0;
        if (imc < 20) {
            per2.cImc = per2.cImc -1;
            contf++;
          
        } else if ((imc > 19) && (imc < 26)) {
            per2.cImc = 0;
             contok++;
         
        } else if(imc > 25) {
            per2.cImc=per2.cImc + 1;
             contg++;
          
        }
        per2.x(per2.getEdad());
     
        per3.crearPersona(per3.getNombre(), 0, per3.getSexo(), 0, 0);
        per3.calcularIMC(per3.getPeso(), per3.getAltura(), per3.cImc);
        imc = per3.getPeso() / Math.pow(per3.getAltura(), 2);
        per3.cImc= 0;
        if (imc < 20) {
            per3.cImc = per3.cImc -1;
            contf++;
            System.out.println("la persona se encuentra por debajo de su peso");
        } else if ((imc > 19) && (imc < 26)) {
            per3.cImc = 0;
             contok++;
            System.out.println("La persona esta en su peso ideal");
        } else if(imc > 25) {
            per3.cImc=per3.cImc + 1;
             contg++;
            System.out.println("La persona tiene sobrepeso");
        }
        per3.x(per3.getEdad());
      
        per4.crearPersona(per4.getNombre(), 0, per4.getSexo(), 0, 0);
        per4.calcularIMC(per4.getPeso(), per4.getAltura(),per4.cImc);
        imc = per4.getPeso() / Math.pow(per4.getAltura(), 2);
        per4.cImc= 0;
        if (imc < 20) {
            per4.cImc = per4.cImc -1;
            contf++;
            System.out.println("la persona se encuentra por debajo de su peso");
        } else if ((imc > 19) && (imc < 26)) {
            per4.cImc = 0;
             contok++;
            System.out.println("La persona esta en su peso ideal");
        } else if(imc > 25) {
            per4.cImc=per4.cImc + 1;
             contg++;
            System.out.println("La persona tiene sobrepeso");
        }
        per4.x(per4.getEdad());
       
     int contMay= 0;
     
     if (per1.getEdad()>18){
     contMay= contMay +1;
     }
     if (per2.getEdad()> 18){
      contMay= contMay +1;
     }
     if (per3.getEdad()> 18){
      contMay= contMay +1;
     }
     if (per4.getEdad()> 18){
     contMay= contMay +1;
     }
       double porMay = (contMay*100) / 4;
        System.out.println("El porcentaje de mayores es " + porMay);
        double porMen= 100 - porMay;
        System.out.println("El porcenje de menores es " + porMen);
        
        double porf= (contf*100)/4;
        double porok= (contok*100)/4;        
        double porg= 100- porf- porok;
                
        System.out.println("el porcentaje de flacos es de %" + porf);
        System.out.println("el porcentaje de gente en su peso es de %"+contok);
        System.out.println(contg);
    }
    
         
    }


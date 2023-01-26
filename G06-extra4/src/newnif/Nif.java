/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newnif;

import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Nif {
    Scanner leer = new Scanner (System.in);
    private long dni;
    private String letra;

    public Nif() {
    }

    public Nif(long dni, String letra) {
        this.dni = dni;
        this.letra = letra;
    }

    public long getDni() {
        return dni;
    }

    public String getLetra() {
        return letra;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }
    
    public String crearNif(){
        System.out.println("Introduzca el numero de DNI");
    dni= leer.nextLong();
    double resultado = dni%23;
    String[] vector = new String [23];
    vector[0]= "T";
    vector[1]= "R";
    vector[2]= "W";
    vector[3]= "A";
    vector[4]= "G";
    vector[5]= "M";
    vector[6]= "Y";
    vector[7]= "F";
    vector[8]= "P";
    vector[9]= "D";
    vector[10]= "X";
    vector[11]= "B";
    vector[12]= "N";
    vector[13]= "J";
    vector[14]= "Z";
    vector[15]= "S";
    vector[16]= "Q";
    vector[17]= "V";
    vector[18]= "H";
    vector[19]= "L";
    vector[20]= "C";
    vector[21]= "K";
    vector[22]= "E";
    
        System.out.println(resultado);
    double num= Math.round(resultado);
    
    for (int i=0; i<22; i++){
    if (i== num){
    letra = vector[i];
    }
    
    }
    return letra;
    
    
    }
    
    
    public void mostrar(){
    
        System.out.println("El NIF es: " + dni + "-"+letra);
    
    }
    
    
    
    
    
    
    
    
    
}

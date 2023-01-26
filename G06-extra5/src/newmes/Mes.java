/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newmes;

import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Mes {
     Scanner leer = new Scanner (System.in);
   private String[] meses= new String[12];
   //meses[0]= "enero";
    private String mesSecreto;
    private String adivinar;

    public Mes() {
    }

    public Scanner getLeer() {
        return leer;
    }

    public String[] getMeses() {
        return meses;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public String getAdivinar() {
        return adivinar;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public void setMeses(String[] meses) {
        this.meses = meses;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

    public void setAdivinar(String adivinar) {
        this.adivinar = adivinar;
    }
    
    public void adivinarMes(){
    meses[0]= "enero";
    meses[1]= "febrero";
    meses[2]= "marzo";
    meses[3]= "abril";
    meses[4]= "mayo";
    meses[5]= "junio";
    meses[6]= "julio";
    meses[7]= "agosto";
    meses[8]= "septiembre";
    meses[9]= "octube";
    meses[10]= "noviembre";
    meses[11]= "diciembre";
    
    mesSecreto= meses[2];
    
        System.out.println(mesSecreto);
       
        System.out.println("Adivine el mes secreto. Introduzca el nombre del mes en minúsculas:");
    adivinar= String.valueOf(leer.nextLine());
int num;
   do{
    if (adivinar.equals(mesSecreto)){
        System.out.println("¡Ha acertado!");
   break;
    }else{
        
        System.out.println("No ha acertado.Intente adivinarlo introduciendo otro mes:");
        adivinar= leer.next();
    }
    
    
    }while (adivinar != mesSecreto);
    
    
    
    
    
    
}
}
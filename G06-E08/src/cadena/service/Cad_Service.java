/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadena.service;

import java.util.Scanner;
import newpackage.cadena.Cadena;

/**
 *
 * @author Cristian
 */
public class Cad_Service {
    Scanner leer = new Scanner (System.in);
    public String cad2;
    public String juntar;
    
    public Cadena ingresarFrase(){
    Cadena cad1 = new Cadena();
        System.out.println("Ingrese la frase");
        cad1.setFrase(String.valueOf(leer.nextLine()));
     cad1.setLongitud(cad1.getFrase().length());
        return cad1;
    }
    
    public void mostrarVocales(Cadena cad1){
        int cantVocales=0;
    for (int i =0; i< cad1.getLongitud(); i++ ){
        if (cad1.getFrase().charAt(i)== 'a' || (cad1.getFrase().charAt(i)== 'e') || (cad1.getFrase().charAt(i)== 'i') || (cad1.getFrase().charAt(i)== 'o') || (cad1.getFrase().charAt(i)== 'u')){
        cantVocales++;
        }
    }
        System.out.println("La cantidad de vocales son " + cantVocales);
}
    
    public void invertirCadena (Cadena cad1){
    String invert="";
    for (int i = cad1.getLongitud()-1; i>=0; i--){
        char actual= cad1.getFrase().charAt(i);
        invert= invert + actual;
    }
        System.out.println("La cadena invertida es [ " + invert + " ]");
    }
    
    public String compararLongitud (Cadena cad1, String cad2) {
     
    if (cad1.getLongitud() > cad2.length()){
        System.out.println("La primer cadena es mayor");
    }else{
        System.out.println("La segunda cadena tiene mayor longitu");
    }
    return cad2;
    }
    
    public String unirFrases (Cadena cad1, String cad2, String juntar){
         juntar = cad1.getFrase().concat(" "+ cad2);
        System.out.println(juntar);
    return juntar;
    }

    public void reemplazarA (String juntar){
        String cadena="";
        System.out.println("Con que caracter quiere reemplazar las 'A'");
    String reem = leer.next();
 cadena= juntar.replace("a", reem);
        System.out.println(cadena);
    }
    
    public void contieneLetra(String juntar){
        System.out.println("Que letra quiere buscar en la frase?");
    char letra = leer.next().charAt(0);
  boolean x= false;
    
    for (int i =0; i< juntar.length(); i++ ){
       if (juntar.charAt(i)== letra){
      x=true;
       }
      
    }
       System.out.println("Se encuentra en la frase? " + x);
   
    
    }
   
    
    }
    
    
    


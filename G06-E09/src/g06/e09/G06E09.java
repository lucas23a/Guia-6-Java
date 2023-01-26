/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g06.e09;

import java.util.Random;
import math.Matematica;


/**
 * op1.setNum1((int)(ale.nextGaussian()*100));
 * op1.setNum2((int)(ale.nextGaussian()*100));
 *
 * @author Cristian
 */
public class G06E09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random ale = new Random();
        Matematica op1 = new Matematica();
        op1.definirNumeros();
        op1.setNum1((int) (ale.nextGaussian() * 100));
        op1.setNum2((int) (ale.nextGaussian() * 100));
        System.out.println("Numero 1 :" + op1.getNum1());
        System.out.println("Numero 2:" + op1.getNum2());
        op1.devolverMayor(op1.getNum1(),op1.getNum2());
        op1.calcularPotencia(op1.getNum1(),op1.getNum2());
        op1.calcularRaiz(op1.getNum1(),op1.getNum2());
        
    }

}

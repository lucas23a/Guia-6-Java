/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpuntos;

import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Puntos {

    Scanner leer = new Scanner(System.in);
    private double x1;
    private double y1;
    private double x2;
    private double y2;

    public Puntos() {
    }

    public Puntos(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double getX1() {
        return x1;
    }

    public double getY1() {
        return y1;
    }

    public double getX2() {
        return x2;
    }

    public double getY2() {
        return y2;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    public void crearDosPuntos() {
        System.out.println("Valor de x1");
        x1 = leer.nextInt();
        System.out.println("Valor de y1");
        y1 = leer.nextInt();
        System.out.println("Valor de x2");
        x2 = leer.nextInt();
        System.out.println("Valor de y2");
        y2 = leer.nextInt();

    }

    public void calcularDistancia() {
        double resultado1 = Math.pow(x1, 2) - (2 * (x1 * y1)) + Math.pow(y1, 2);
        double resultado2 = Math.pow(x2, 2) - (2 * (x2 * y2)) + Math.pow(y2, 2);

        double resultado = resultado1 + resultado2;

        double raiz = Math.sqrt(resultado);

        System.out.println("La distancia entre los puntos es: " + raiz);

    }

}

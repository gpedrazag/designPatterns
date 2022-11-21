/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unipiloto.patterns.adapter;

/**
 *
 * @author USUARIO
 */
public class AdapterPatternEx {

    public static void main(String[] args) {
        System.out.println("***Adapter Pattern Demo***");
        CalculadoraAdapter cal = new CalculadoraAdapter();
        Triangulo t = new Triangulo(20, 10);
        System.out.println("\nAdapter Pattern Example\n");
        System.out.println("Area of Triangle is :" + cal.getArea(t));
    }

}

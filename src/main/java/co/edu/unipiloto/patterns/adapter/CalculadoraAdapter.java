/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unipiloto.patterns.adapter;

/**
 *
 * @author USUARIO
 */
public class CalculadoraAdapter {
    //Declara atributo calculadora
    private Calculadora calculadora;
    private Triangulo triangulo;
    public double getArea(Triangulo t){
        calculadora = new Calculadora();
        this.triangulo=t;
        Rectangulo rect=new Rectangulo();
        //Area del triangulo =0.5*base*altura
        rect.setLargo(triangulo.getBase());
        rect.setAncho(triangulo.getAltura()/2);
        return calculadora.getArea(rect);
        
       
    }
}

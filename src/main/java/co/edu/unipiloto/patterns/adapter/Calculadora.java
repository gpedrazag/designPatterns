/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unipiloto.patterns.adapter;

/**
 *
 * @author USUARIO
 */
public class Calculadora {
    //Calculadora puede calcular el area de un rectangulo. Para calcular el area se necesita como entrada un rectangulo
    Rectangulo rect;
    
    public double getArea(Rectangulo r){
        this.rect=r;
        return rect.getLargo()*rect.getAncho();
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unipiloto.patterns.strategy;

/**
 *
 * @author USUARIO
 */
public class SegundaSeleccion implements ISeleccion {

    public void miSeleccion(String s1, String s2) {
        System.out.println("You wanted to concatenate the numbers.");
        System.out.println(" The result of the addition is:" + s1 + s2);
        System.out.println("***End of the strategy***");
    }

}

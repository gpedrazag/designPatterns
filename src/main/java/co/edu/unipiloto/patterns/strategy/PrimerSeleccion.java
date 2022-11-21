/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unipiloto.patterns.strategy;

/**
 *
 * @author USUARIO
 */
public class PrimerSeleccion implements ISeleccion {

    public void miSeleccion(String s1, String s2) {
        System.out.println("You wanted to add the numbers.");
        int int1, int2, sum;
        int1 = Integer.parseInt(s1);
        int2 = Integer.parseInt(s2);
        sum = int1 + int2;
        System.out.println(" The result of the addition is:" + sum);
        System.out.println("***End of the strategy***");
    }
}

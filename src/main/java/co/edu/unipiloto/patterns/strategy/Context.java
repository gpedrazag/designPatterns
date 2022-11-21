/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unipiloto.patterns.strategy;

/**
 *
 * @author USUARIO
 */
public class Context {

    ISeleccion myC;
// Set a Strategy or algorithm in the Context

    public void setSeleccion(ISeleccion ic) {
        myC = ic;
    }

    public void getSeleccion(String s1, String s2) {
        myC.miSeleccion(s1, s2);
    }

}

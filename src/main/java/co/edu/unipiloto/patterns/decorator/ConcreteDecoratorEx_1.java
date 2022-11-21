/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unipiloto.patterns.decorator;

/**
 *
 * @author USUARIO
 */
public class ConcreteDecoratorEx_1 extends AbstractDecorator {

   
    public void doJob() {
        super.doJob();
//Add additional thing if necessary
        System.out.println("I am explicitly from Ex_1");
    }
}

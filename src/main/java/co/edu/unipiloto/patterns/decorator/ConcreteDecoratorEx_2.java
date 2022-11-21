/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unipiloto.patterns.decorator;

/**
 *
 * @author USUARIO
 */
public class ConcreteDecoratorEx_2 extends AbstractDecorator {

    public void doJob() {
        System.out.println("");
        System.out.println("***START Ex-2***");
        super.doJob();
//Add additional thing if necessary
        System.out.println("Explicitly From DecoratorEx_2");
        System.out.println("***END. EX-2***");
    }

  
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unipiloto.patterns.decorator;

/**
 *
 * @author USUARIO
 */
public class ConcreteComponent extends Component{

    @Override
    public void doJob() {
        System.out.println(" I am from Concrete Component-I am closed for modification");
    }
    
}

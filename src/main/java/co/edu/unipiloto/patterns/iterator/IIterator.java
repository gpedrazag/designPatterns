/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.unipiloto.patterns.iterator;

/**
 *
 * @author USUARIO
 */
public interface IIterator {

    void primero();//Reset to first element

    String siguiente();//get next element

    Boolean estaHecho();//End of collection check

    String actualItem();//Retrieve Current Item

}

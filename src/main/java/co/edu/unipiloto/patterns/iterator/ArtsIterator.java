/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unipiloto.patterns.iterator;

/**
 *
 * @author USUARIO
 */
public class ArtsIterator implements IIterator{

    private String[] subjects;
    private int position;

    public ArtsIterator(String[] subjects) {
        this.subjects = subjects;
        position = 0;
    }

    public void primero() {
        position = 0;
    }

    public String siguiente() {
        return subjects[position++];
    }

    public Boolean estaHecho() {
        
        return position >= subjects.length;
    }

    public String actualItem() {
        
        return subjects[position];
        
    }
}

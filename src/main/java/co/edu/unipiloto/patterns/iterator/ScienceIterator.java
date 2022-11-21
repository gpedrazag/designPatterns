/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unipiloto.patterns.iterator;

import java.util.LinkedList;

/**
 *
 * @author USUARIO
 */
public class ScienceIterator implements IIterator {

    private LinkedList<String> subjects;
    private int position;

    public ScienceIterator(LinkedList<String> subjects) {
        this.subjects = subjects;
        position = 0;
    }

    public void primero() {
        position = 0;
    }

    public String siguiente() {
        return subjects.get(position++);
    }

    public Boolean estaHecho() {
        return position >= subjects.size();
    }

    public String actualItem() {
        return subjects.get(position);
    }
}

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
public class Science implements ISubject {

    private LinkedList<String> subjects;

    public Science() {
        subjects = new LinkedList<String>();
        subjects.addLast("Maths");
        subjects.addLast("Comp. Sc.");
        subjects.addLast("Physics");
    }

    @Override
    public IIterator crearIterador() {
        return new ScienceIterator(subjects);
    }

}

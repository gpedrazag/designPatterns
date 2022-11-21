/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unipiloto.patterns.iterator;

/**
 *
 * @author USUARIO
 */
public class Arts implements ISubject{

    private String[] subjects;

    public Arts() {
        subjects = new String[2];
        subjects[0] = "Bengali";
        subjects[1] = "English";
    }

    public IIterator crearIterador() {
        return new ArtsIterator(subjects);
    }

}

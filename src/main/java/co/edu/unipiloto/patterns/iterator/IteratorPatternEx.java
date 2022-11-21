/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unipiloto.patterns.iterator;

/**
 *
 * @author USUARIO
 */
public class IteratorPatternEx {

    public static void main(String[] args) {
        System.out.println("***Iterator Pattern Demo***\n");
        ISubject Sc_subject = new Science();
        ISubject Ar_subjects = new Arts();
        IIterator Sc_iterator = Sc_subject.crearIterador();
        IIterator Ar_iterator = Ar_subjects.crearIterador();
        System.out.println("\nScience subjects :");
        imprimir(Sc_iterator);
        System.out.println("\nArts subjects :");
        imprimir(Ar_iterator);
    }

    public static void imprimir(IIterator iterator) {
        while (!iterator.estaHecho()) {
            System.out.println(iterator.siguiente());
        }
    }
}

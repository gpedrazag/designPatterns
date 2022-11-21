/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unipiloto.patterns.command;

/**
 *
 * @author USUARIO
 */
class Receptor {

    public void realizarDeshacer() {
        System.out.println("Executing -MyUndoCommand");
    }

    public void realizarRehacer() {
        System.out.println("Executing -MyRedoCommand");
    }

}

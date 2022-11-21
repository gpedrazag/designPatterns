/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unipiloto.patterns.command;

/**
 *
 * @author USUARIO
 */
public class MyRedoCommand implements ICommand {

    private Receptor receiver;

    MyRedoCommand(Receptor recv) {
        receiver = recv;
    }

    @Override
    public void hacer() {
//Call redo in receiver
        receiver.realizarRehacer();
    }

}

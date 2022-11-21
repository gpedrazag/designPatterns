/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unipiloto.patterns.command;

/**
 *
 * @author USUARIO
 */
public class MyUndoCommand implements ICommand {

    private Receptor receiver;

    MyUndoCommand(Receptor recv) {
        receiver = recv;
    }

    @Override
    public void hacer() {
//Call undo in receiver
        receiver.realizarDeshacer();
    }

}

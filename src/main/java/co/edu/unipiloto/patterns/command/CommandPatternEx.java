/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unipiloto.patterns.command;

/**
 *
 * @author USUARIO
 */
public class CommandPatternEx {

    public static void main(String[] args) {
        System.out.println("***Demo patron Command***\n");
        Receptor intendedreceiver = new Receptor();
        /*Client holds Invoker and Command Objects*/
        Invoke inv = new Invoke();
        MyUndoCommand unCmd = new MyUndoCommand(intendedreceiver);
        MyRedoCommand reCmd = new MyRedoCommand(intendedreceiver);
        inv.ejecutarComando(unCmd);
        inv.ejecutarComando(reCmd);
    }
}

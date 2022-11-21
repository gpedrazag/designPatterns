/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unipiloto.patterns.command;

/**
 *
 * @author USUARIO
 */
public class Invoke {

    ICommand cmd;

    public void ejecutarComando(ICommand cmd) {
        this.cmd = cmd;
        cmd.hacer();
    }

}

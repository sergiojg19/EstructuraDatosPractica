/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.exception;

/**
 *
 * @author danny
 */
public class SpaceException extends Exception{

    public SpaceException() {
        super("Espacio Lleno o posicion no valida");
    }

    public SpaceException(String message) {
        super(message);
    }
    
}

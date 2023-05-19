/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador.ed.lista.exception;

/**
 *
 * @author wilman
 */
public class PosicionException extends Exception{
    
    
    public PosicionException() {
        super("Lista vacia");
    }

    /**
     * Constructs an instance of <code>VacioException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public PosicionException(String msg) {
        super(msg);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package Controlador.util.exception;

/**
 *
 * @author wilman
 */
public class EspacioException extends Exception{

    /**
     * Creates a new instance of <code>EspacioException</code> without detail
     * message.
     */
    public EspacioException(String message) {
        super(message);
    }

    /**
     * Constructs an instance of <code>EspacioException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public EspacioException() {
        super("sin espacio");
    }
}

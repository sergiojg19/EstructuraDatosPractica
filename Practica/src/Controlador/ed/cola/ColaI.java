/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador.ed.cola;

import Controlador.ed.lista.ListaEnlazada;
import Controlador.ed.lista.exception.PosicionException;
import Controlador.ed.lista.exception.VacioException;
import Controlador.ed.pila.exception.TopeException;

/**
 *
 * @author wilman
 */
public class ColaI <E> extends ListaEnlazada<E>{
    private Integer tope;

    public ColaI(Integer tope) {
        this.tope = tope;
    }
    
    public Boolean isFull(){
        return(size() >= tope);
    }
    
    public void queue(E dato)throws TopeException{
        if (isFull()) {
            throw new TopeException("COLA SIN ESPACIO");
        }else{
            this.insertar(dato);
        }
    }
    public E dequeue()throws VacioException, PosicionException{
        E dato = null;
        if (isEmpty()) {
            throw new VacioException("Cola vacia");
        }else{
            return this.delete(0);
        }
    }
    public Integer getTope(){
        return tope;
    }
}

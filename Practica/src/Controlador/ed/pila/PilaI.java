/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador.ed.pila;

import Controlador.ed.lista.ListaEnlazada;
import Controlador.ed.lista.exception.PosicionException;
import Controlador.ed.lista.exception.VacioException;
import Controlador.ed.pila.exception.TopeException;

/**
 *
 * @author wilman
 */
public class PilaI<E> extends ListaEnlazada<E> {
    private Integer cima;

    public PilaI(Integer cima) {
        this.cima = cima;
    }
    
    public Boolean isFull(){
        return (size()>=cima);
    }
    
    public void push(E info)throws TopeException{
        if (!isFull()) {
            insertarInicio(info);
        }else{
            throw new TopeException();
        }
    }
    public E pop()throws VacioException, PosicionException{
        E dato = null;
        if (!isEmpty()) {
            throw new VacioException("pila vacia");
            
        }else{
            return this.delete(0);
        }
    }
    public Integer getCima(){
        return cima;
    }
}

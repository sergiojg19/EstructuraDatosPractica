/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.ed.lista;

/**
 *
 * @author santiago
 */
public class NodoLista <E>{
    
    //una lista enlazada es el E.lse_nodo // E element

    private E info; //dato generico
    private NodoLista sig;

    public NodoLista() {
        info = null;
        sig = null;
    }

    public NodoLista(E info, NodoLista sig) {
        this.info = info;
        this.sig = sig;
    }

    
    public E getInfo() {
        return info;
    }

    
    public void setInfo(E info) {
        this.info = info;
    }

    
    public NodoLista getSig() {
        return sig;
    }

    
    public void setSig(NodoLista sig) {
        this.sig = sig;
    }
    
    
    
    
    
}

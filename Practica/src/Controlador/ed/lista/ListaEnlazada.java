/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador.ed.lista;

import Controlador.ed.lista.exception.PosicionException;
import Controlador.ed.lista.exception.VacioException;
import java.util.List;

/**
 *
 * @author wilman
 */
public class ListaEnlazada <E>{
    private NodoLista<E> cabecera;
    private Integer size = 0;
    
    public ListaEnlazada() {
        cabecera = null;
        size = 0;
    }

    public ListaEnlazada(List<E> lista) {
        
        size = 0;
        for (E elemento : lista) {
            insertar(elemento);
        }
    }
    
    

    public NodoLista getCabecera() {
        return cabecera;
    }

    public void setCabecera(NodoLista cabecera) {
        this.cabecera = cabecera;
    }
    
    public boolean isEmpty(){
        return cabecera == null;
    }
    
    public void insertar(E info){
        NodoLista<E> nuevo = new NodoLista<>(info, null);
        if (isEmpty()) {
            this.cabecera = nuevo;
            this.size++;
        }else{
            NodoLista<E> aux = cabecera;
            while(aux.getSig() != null){
                aux = aux.getSig();
            }
            aux.setSig(nuevo);
            this.size++;
        }
    }
    
    public void insertarInicio(E info){
        if (isEmpty()) {
            insertar(info);
        }else{
            NodoLista<E> nuevo = new NodoLista<>(info, null);
            nuevo.setSig(cabecera);
            cabecera = nuevo;
            size++;
        }
    }
    
    public void insertarPosicion(E info, Integer pos) throws PosicionException{
        if (isEmpty()) {
            insertar(info);
        }else if (pos >= 0 && pos < size() && pos == 0) {
            NodoLista<E> nuevo = new NodoLista<>(info, null);
        } else if (pos >= 0 && pos < size() ){
            NodoLista<E> aux = cabecera;
            NodoLista<E> nuevo = new NodoLista<>(info, null);
            for (int i = 0; i < (pos - 1); i++) {
                aux = aux.getSig();
            }
            NodoLista<E> sig = aux.getSig();
            aux.setSig(nuevo);
            nuevo.setSig(sig);
            size++;
        }else{
            throw new PosicionException();
        }
    }
    
    public E get(Integer pos) throws VacioException, PosicionException{
        if (isEmpty()) {
            throw new VacioException();
        }else{
            E dato = null;
            if (pos >= 0 && pos < size()) {
                if (pos == 0) {
                    dato = cabecera.getInfo();
                }else{
                    NodoLista<E> aux = cabecera;
                    for (int i = 0; i < pos; i++) {
                        aux = aux.getSig();
                    }
                    dato = aux.getInfo();
                }
            }else{
                throw new PosicionException();
            }
            return dato;
        }
    }
    
    public E delete(Integer pos) throws VacioException, PosicionException{
        if (isEmpty()) {
            throw new VacioException();
        }else{
            E dato = null;
            if (pos >= 0 && pos < size()) {
                if (pos == 0) {
                    dato = cabecera.getInfo();
                    cabecera = cabecera.getSig();
                    size--;
                }else{
                    NodoLista<E> aux = cabecera;
                    for (int i = 0; i < (pos-1); i++) {
                        aux = aux.getSig();
                    }
                        NodoLista<E> aux1 = aux.getSig();
                        dato = aux1.getInfo();
                    
                    NodoLista<E> proximo = aux.getSig();
                    aux.setSig(proximo.getSig());
                    size--;
                    
                }
            }else{
                throw new PosicionException();
            }
            return dato;
        }
    }
    
    public void deleteAll(){ 
        this.cabecera = null;
    }
    
    public Integer size(){
        return size;
    }
    
    public void imprimir()throws VacioException{
        if (isEmpty()) {
            throw new VacioException();
        }else{
        NodoLista<E> aux = cabecera;
        
        System.out.println("----LISTA----");
            for (int i = 0; i < size(); i++) {
                System.out.println(aux.getInfo());
                aux = aux.getSig();
            }
        }
        System.out.println("----LISTA FIN-----");
    }  
}

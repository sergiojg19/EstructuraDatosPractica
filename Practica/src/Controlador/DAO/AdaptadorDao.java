///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package Controlador.DAO;
//
//import Controlador.ed.lista.ListaEnlazada;
//
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.Arrays;
//import java.util.Collection;
//import java.util.LinkedList;
//import java.util.List;
//
///**
// *
// * @author wilman
// */
//public class AdaptadorDao <T> implements InterfazDao<T>{
//    private Conexion conexion;
//    private Class<T> clazz;
//    private String url;
//    
//    
//    public AdaptadorDao(Class clazz){
//        conexion = new Conexion();
//        this.clazz= clazz;
//        this.url=Conexion.URL+clazz.getSimpleName()+".json";
//    }
//    
//    @Override
//    public void modificar(T obj, Integer pos) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//    
//    @Override
//    public void guardar(T obj) throws IOException {
//        /*ListaEnlazada<T> lista = new ListaEnlazada<>();
//
//        try {
//            ListaEnlazada<T> aux = listar();
//            lista = aux;
//            lista.insertar(obj);
//            System.out.println("okok");
//        } catch (Exception e) {
//            System.out.println("ok");
//            lista.insertar(obj);
//        }
//
//        conexion.getXstream().alias(clazz.getSimpleName().toLowerCase(), clazz);
//        conexion.getXstream().toXML(lista.getCabecera(), new FileWriter(url));
//        */
//        //////////////////
//        /*
//        ListaEnlazada<T> lista = new ListaEnlazada<>();
//
//        try {
//            ListaEnlazada<T> aux = listar();
//            lista = aux;
//            lista.insertar(obj);
//        } catch (Exception e) {
//            lista.insertar(obj);
//        }
//
//        conexion.getXstream().alias(clazz.getSimpleName().toLowerCase(), clazz);
//        FileWriter fileWriter = new FileWriter(url);
//        conexion.getXstream().toXML(lista.getCabecera(), fileWriter);
//        fileWriter.close();
//        */
//        ListaEnlazada<T> lista = new ListaEnlazada<>();
//
//        try {
//            ListaEnlazada<T> aux = listar();
//            lista = aux;
//            lista.insertar(obj);
//        } catch (Exception e) {
//            lista.insertar(obj);
//        }
//
//        conexion.getXstream().alias(clazz.getSimpleName().toLowerCase(), clazz);
//        FileWriter fileWriter = null;
//        try {
//            fileWriter = new FileWriter(url);
//            conexion.getXstream().toXML(lista.getCabecera(), fileWriter);
//        } finally {
//            if (fileWriter != null) {
//                fileWriter.close();
//            }
//        }
//    }
//    
//    @Override
//    public ListaEnlazada<T> listar() throws StreamException{
//        List<T> array = (List<T>) conexion.getXstream().fromXML(url);
//        return new ListaEnlazada<>(array);
//    }
//    
//    @Override
//    public void obtener(Integer id) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//}

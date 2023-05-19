///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
// */
//package Controlador.DAO;
//
//import Controlador.ed.lista.ListaEnlazada;
//import Modelo.EnumMes;
//import Modelo.Sucursal;
//import Modelo.Venta;
//import java.util.LinkedList;
//import java.util.List;
//
///**
// *
// * @author wilman
// */
//public class SucursalDao extends AdaptadorDao <Sucursal>{
//
//    private Sucursal sucursal;
//    public SucursalDao(){
//        super(Sucursal.class);
//    }
//
//    public Sucursal getSucursal() {
//        if (this.sucursal == null) {
//            this.sucursal = new Sucursal();
//        }
//        return sucursal;
//    }
//
//    public void setSucursal(Sucursal sucursal) {
//        this.sucursal = sucursal;
//    }
//    public static void main(String[] args){
//        SucursalDao sd = new SucursalDao();
//        sd.getSucursal().setNombre("Alice");
//        sd.getSucursal().setVentas(new LinkedList<Venta>());
//        
//        sd.sucursal.getVentas().add(new Venta());
//        sd.sucursal.getVentas().get(0).setMes(EnumMes.MAYO);
//        sd.sucursal.getVentas().get(0).setValor(567.9);
//
//        
//        /*sd.sucursal.getVentas().set(1, new Venta());
//        sd.sucursal.getVentas().get(1).setMes(EnumMes.MAYO);
//        sd.sucursal.getVentas().get(1).setValor(567.9);
//        */
//        
//        try {
//            sd.guardar(sd.getSucursal());
//            System.out.println(sd.listar());
//        }catch (Exception e){
//            System.out.println(e);
//            
//        }
//    }
//    
//}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package Controlador.DAO;
//
//import com.thoughtworks.xstream.XStream;
//import com.thoughtworks.xstream.io.StreamException;
//import com.thoughtworks.xstream.io.json.JettisonMappedXmlDriver;
//
//
//
///**
// *
// * @author wilman
// */
//public class Conexion {
//    private XStream xstream;
//    public static String URL = "data/";
//    private XStream conectar(){
//        /*xstream = new XStream(new JettisonMappedXmlDriver());
//        xstream.setMode(XStream.NO_REFERENCES);
//        return null;*/
//        try {
//        xstream = new XStream(new JettisonMappedXmlDriver());
//        xstream.setMode(XStream.NO_REFERENCES);
//        return xstream;
//        } catch (Exception e) {
//            e.printStackTrace();
//            throw new StreamException("Error al conectar con XStream: " + e.getMessage());
//        }
//    }
//
//    public XStream getXstream() {
//        if (xstream == null) {
//            conectar();
//        }
//        return xstream;
//    }
//
//    public void setXstream(XStream xstream) {
//        this.xstream = xstream;
//    }
//}

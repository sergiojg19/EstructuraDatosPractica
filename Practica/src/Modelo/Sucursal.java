/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author wilman
 */
public class Sucursal implements Serializable{
    
    private Integer id;
    private String nombre;
    private List<Venta> ventas;
    private Map<String, List<Venta>> ventasPorMes;

    public Sucursal(Integer id, String nombre, List<Venta> ventas, Map<String, List<Venta>> ventasPorMes) {
        this.id = id;
        this.nombre = nombre;
        this.ventas = ventas;
        this.ventasPorMes = ventasPorMes;
    }
    
    

    public Sucursal() {
        ventasPorMes = new HashMap<>();
    }

    public void agregarVenta(String mes, Venta venta) {
        List<Venta> ventas = ventasPorMes.getOrDefault(mes, new LinkedList<>());
        ventas.add(venta);
        ventasPorMes.put(mes, ventas);
    }
    
    public Double getTotalVentasAnio() {
        Double totalVentas = 0.0;
        for (List<Venta> ventasMes : ventasPorMes.values()) {
            for (Venta venta : ventasMes) {
                totalVentas += venta.getValor();
            }
        }
        return totalVentas;
    }
    
    public double getPromedioVentasMes(String mes) {
        List<Venta> ventas = ventasPorMes.getOrDefault(mes, new LinkedList<>());
        if (ventas.isEmpty()) {
            return 0.0;
        }
        double suma = 0.0;
        for (Venta venta : ventas) {
            suma += venta.getValor();
        }
        return suma / ventas.size();
    }
    
    public int getSucursalMayorVentasMes(String mes) {
        List<Venta> ventas = ventasPorMes.getOrDefault(mes, new LinkedList<>());
        if (ventas.isEmpty()) {
            return 0; // O cualquier otro valor que indique que no se encontraron ventas
        }
        double maxVentas = 0.0;
        int numSucursal = 0;
        for (Venta venta : ventas) {
            if (venta.getValor() > maxVentas) {
                maxVentas = venta.getValor();
                numSucursal = this.id;
            }
        }
        return numSucursal;
    }

    public Sucursal(String sucursal_1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    /*public void agregarVenta(String mes, Venta venta) {
        List<Venta> ventas = ventasPorMes.getOrDefault(mes, new LinkedList<>());
        ventas.add(venta);
        ventasPorMes.put(mes, ventas);
    }*/

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(List<Venta> ventas) {
        this.ventas = ventas;
    }

    @Override
    public String toString() {
        return "Sucursal{" + "id=" + id + ", nombre=" + nombre + ", ventas=" + ventas + '}';
    }
    
    
}

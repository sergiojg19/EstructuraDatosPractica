/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Vista;

/*
import Controlador.ed.cola.Cola;
import Controlador.ed.lista.ListaEnlazada;
import Controlador.ed.lista.exception.VacioException;
import Modelo.Sucursal;
import Controlador.ed.pila.Pila;
import Controlador.util.Utilidades;
import Vista.modeloTabla.ModeloTablaSucursal;
import java.util.LinkedList;
import java.util.List;
*/

import Modelo.EnumMes;
import Modelo.Sucursal;
import Modelo.Venta;
import Vista.modeloTabla.ModeloTablaSucursal;

import javax.swing.*;
import java.util.LinkedList;

/**
 *
 * @author wilman
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    /*public static void main(String[] args) {
        // TODO code application logic here
        
        Pila<Integer> pila = new Pila(5);
        Cola<Integer> cola = new Cola(5);
        try {
            pila.push(5);
            pila.push(56);
            pila.push(9);
            pila.push(45);
            pila.push(8);
            //pila.print();
            
            //pila.pop();
            pila.print();
//            pila.pop();
            System.out.println("============================================");
            
            cola.queue(5);
            cola.queue(56);
            cola.queue(9);
            cola.queue(45);
            cola.queue(8);
            
            cola.print();
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
    }*/

    public static void main(String[] args) {
        // Crear una lista de sucursales
        LinkedList<Sucursal> sucursales = new LinkedList<>();

        // Crear las sucursales y agregar ventas
        Sucursal s = new Sucursal();
        s.setId(3);
        s.setNombre("Wilman");
        s.agregarVenta("Septiembre", new Venta(3, 500.0));
        s.agregarVenta("Octubre", new Venta(2,50.0));
        sucursales.add(s);
        
        Sucursal sucursal1 = new Sucursal();
        sucursal1.setId(1);
        sucursal1.setNombre("Sucursal 1");
        sucursal1.agregarVenta("Enero", new Venta(1, 100.0));
        sucursal1.agregarVenta("Febrero", new Venta(2, 150.0));
        sucursales.add(sucursal1);

        Sucursal sucursal2 = new Sucursal();
        sucursal2.setId(2);
        sucursal2.setNombre("Sucursal 2");
        sucursal2.agregarVenta("Enero", new Venta(1, 200.0));
        sucursal2.agregarVenta("Febrero", new Venta(2, 250.0));
        sucursal2.agregarVenta("Marzo", new Venta(3, 300.0));
        sucursales.add(sucursal2);

        
            // Crear el modelo de tabla para mostrar el resumen de ventas
        ModeloTablaSucursal modelo = new ModeloTablaSucursal();
        modelo.setDatos(sucursales);

        // Crear y mostrar la tabla
        JTable tabla = new JTable(modelo);
        JScrollPane scrollPane = new JScrollPane(tabla);
        JFrame frame = new JFrame("Resumen de Ventas por Sucursal");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(scrollPane);
        frame.pack();
        frame.setVisible(true);
        
        
        Sucursal sucursal =sucursal1;// Obtener la sucursal deseada
        Double totalVentasAnio = sucursal.getTotalVentasAnio();
        System.out.println("Total de ventas en el año de la sucursal: " + totalVentasAnio);
        
        String mes = "Enero";
        double promedioVentas = sucursal1.getPromedioVentasMes(mes);
        System.out.println("El promedio de ventas en " + mes + " es: " + promedioVentas);
        
        //EnumMes mes =EnumMes.ENERO; // El mes que deseas consultar
        int numSucursalMayorVentas = 0;
        double maxVentas = 0.0;
        for (Sucursal sucursalActual : sucursales) {
            double ventasMes = sucursal.getPromedioVentasMes(mes);
            if (ventasMes > maxVentas) {
                maxVentas = ventasMes;
                numSucursalMayorVentas = sucursal.getId();
            }
        }

    }
}

    

    


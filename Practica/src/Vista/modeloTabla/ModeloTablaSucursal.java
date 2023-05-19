/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista.modeloTabla;

import Controlador.util.Utilidades;
import Modelo.Sucursal;
import java.util.LinkedList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author wilman
 */
public class ModeloTablaSucursal extends AbstractTableModel{
    
    private LinkedList<Sucursal> datos = new LinkedList<Sucursal>();

    public LinkedList<Sucursal> getDatos() {
        return datos;
    }

    public void setDatos(LinkedList<Sucursal> datos) {
        this.datos = datos;
    }

    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        
        Sucursal s = datos.get(i);
        switch(i1){
        case 0: return (s != null) ? s.getNombre() : "NO DEFINIDO";
        case 1: return (s != null) ? Utilidades.sumarVentas(s) : 0.0;
        case 2: return (s != null) ? Utilidades.mediaVentas(s) : 0.0;
        default: return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0: return "Sucursal";
            case 1: return "Venta anual";
            case 2: return "Venta promedio";
            default: return null;
        }
    }
    
    
    
}

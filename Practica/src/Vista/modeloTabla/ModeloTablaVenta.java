/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista.modeloTabla;

import Controlador.util.Utilidades;
import static Modelo.EnumMes.ENERO;
import Modelo.Sucursal;
import Modelo.Venta;
import java.util.LinkedList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author wilman
 */
public class ModeloTablaVenta extends AbstractTableModel{
    private List<Venta> datos = new LinkedList<Venta>();

    public List<Venta> getVenta() {
        return datos;
    }

    public void setVenta(List<Venta> datos) {
        this.datos = datos;
    }
    
    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        Venta sucursal = datos.get(i);
        //List<Venta> ventas = sucursal.getPromedioVentasMes(ENERO).get(i1);
        Venta s = datos.get(i);
        switch(i1) {
            case 0: return (s != null) ? s.getMes().toString() : "Sin definir";
            case 1: return (s != null) ? s.getValor() : 0.0;
            default: return null;
        }
        
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0: return "Mes";
            case 1: return "Valor";
            default: return null;
        }
    }
    
}

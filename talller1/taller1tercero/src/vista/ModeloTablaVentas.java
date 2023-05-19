/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import controlador.util.Utilidades;
import javax.swing.table.AbstractTableModel;
import modelo.Sucursal;
import modelo.Venta;

/**
 *
 * @author caim
 */
public class ModeloTablaVentas extends AbstractTableModel{
    private Venta [] datos = new Venta[12];

    /**
     * @return the datos
     */
    public Venta[] getVenta() {
        return datos;
    }

    /**
     * @param datos the datos to set
     */
    public void setVentas(Venta[] datos) {
        this.datos = datos;
    }
    
    @Override
    public int getColumnCount(){
        
        return 3;
        
    }

    @Override
    public int getRowCount(){
        return datos.length;
    }
   
    @Override
    public Object getValueAt(int i, int i1){
        Venta s = datos[i];
        switch(i1){
            case 0: return (s != null) ? s.getMes().toString() : "NO DEFINIDO" ; //Operador ternario
            case 1: return (s != null) ? s.getValor() : 0.0;
            
            default:return null;
            
        }
    }

    @Override
    public String getColumnName(int column) {
        
         switch(column){
            case 0: return "Mes";
            case 1: return "Valor";
            default:return null;
    
            // Ver el nombre de las columnas
         }
    }
    
    
}

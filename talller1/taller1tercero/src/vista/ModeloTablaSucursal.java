/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import controlador.util.Utilidades;
import javax.swing.table.AbstractTableModel;
import modelo.Sucursal;

/**
 *
 * @author caim
 */
public class ModeloTablaSucursal extends AbstractTableModel{
    private Sucursal [] datos = new Sucursal[4];

    /**
     * @return the datos
     */
    public Sucursal[] getDatos() {
        return datos;
    }

    /**
     * @param datos the datos to set
     */
    public void setDatos(Sucursal[] datos) {
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
        Sucursal s = datos[i];
        switch(i1){
            case 0: return (s != null) ? s.getNombre() : "NO DEFINIDO" ; //Operador ternario
            case 1: return (s != null) ? Utilidades.sumarVentas(s) : 0.0;
            case 2: return (s != null) ? Utilidades.mediaVentas(s) : 0.0;
            default:return null;
            
        }
    }

    @Override
    public String getColumnName(int column) {
        
         switch(column){
            case 0: return "SUCURSAL";
            case 1: return "VENTA ANUAL";
            case 2: return "VENTA PROMEDIO";
            default:return null;
    
            // Ver el nombre de las columnas
         }
    }
    
    
}

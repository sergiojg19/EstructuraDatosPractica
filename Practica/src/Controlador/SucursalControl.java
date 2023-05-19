/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Controlador.util.exception.EspacioException;
import Modelo.EnumMes;
import Modelo.Sucursal;
import Modelo.Venta;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author wilman
 */
public class SucursalControl {
    private List<Sucursal> sucursales;
    private Sucursal sucursal;
    private Venta venta;
    
    public SucursalControl() {
        sucursales = new LinkedList<>();
        for (int i = 0; i < 4; i++) {
            Sucursal s = new Sucursal();
            sucursales.add(s);
        }
    }

    public SucursalControl(List<Sucursal> sucursales, Sucursal sucursal, Venta venta) {
        this.sucursales = sucursales;
        this.sucursal = sucursal;
        this.venta = venta;
    }
    
    

    public List<Sucursal> getSucursales() {
        return sucursales;
    }

    public void setSucursales(List<Sucursal> sucursales) {
        this.sucursales = sucursales;
    }

    public Sucursal getSucursal() {
        if (sucursal == null) {
            sucursal = new Sucursal();
        }
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }
    
    public boolean registrar()throws EspacioException{
        int pos = -1;
        int cont = -1;
        for (Sucursal s : sucursales) {
            cont++;
            if (s==null) {
                pos = cont;
                break;
            }
        }
        if (pos == -1)
            throw new EspacioException();
        
        sucursales = new LinkedList<>();
        for (int i = 0; i < EnumMes.values().length; i++) {
            Sucursal sucursal = new Sucursal();
            sucursal.setVentas(new LinkedList<>());
            for (EnumMes mes : EnumMes.values()) {
                Venta venta = new Venta();
                venta.setId(mes.ordinal() + 1);
                venta.setMes(mes);
                venta.setValor(0.0);
                sucursal.getVentas().add(venta);
            }     
        }
        sucursales.add(sucursal);
        return true;
    }
    
    public boolean guardarVentas(Integer posVenta, Double valor) throws EspacioException {
        if (this.sucursal != null) {
            List<Venta> ventas = this.sucursal.getVentas();
            if (posVenta >= 1 && posVenta <= ventas.size()) {
                ventas.get(posVenta - 1).setValor(valor);
                
            } else {
                throw new EspacioException();
            }
        } else {
            throw new NullPointerException("Debe seleccionar una sucursal");
        }
        return true;
    }


}
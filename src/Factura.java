
import java.io.PrintWriter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Neiver Tapia
 */

public class Factura {
    
    private int codigo;
    private String nombEmple;
    private String nombPro;
    private float precio;
    private int cantidad;

    
    public Factura(int codigo, String nomEmp, String nomP, float precio, int cant){
        this.codigo=codigo;
        this.nombEmple=nomEmp;
        this.nombPro=nomP;
        this.precio= precio;
        this.cantidad= cant;
    }
    public Factura(){
        
    }   
    
    
    public int getCodigo(){
        return codigo;
    }
    
    public void setCodigo(int codigo){
        this.codigo=codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombEmple() {
        return nombEmple;
    }

    public void setNombEmple(String nombEmple) {
        this.nombEmple = nombEmple;
    }
    
    public float getPrecio(){
        return precio;
    }
    
    public void setPrecio(float precio){
        this.precio=precio;
    }
    
    public String getNombPro(){
        return nombPro;
    }
    
    public void setNomPro(String nombPro){
        this.nombPro=nombPro;
    }

    public float calculo(){
        float tot;
        
        return tot = cantidad*precio;
    }
    
    public void guardar(PrintWriter escribir){
        float total = calculo();

        escribir.print(codigo+";");
        escribir.print(nombEmple+";");
        escribir.print(nombPro+";");
        escribir.print(precio+";");
        escribir.print(cantidad+";");
        escribir.print(total+";");
        escribir.println();
    }
    public void indice(PrintWriter escribir){
        escribir.print("Codigo"+";"+"Nombre Empleado"+";"+"Nombre Producto"+";"+"Precio"+";"+"Cantidad"+";"+"Total"+";");
        escribir.println();
    }
}
// private int codigo;
//    private String nombEmple;
//    private String nombPro;
//    private float precio;
//    private int cantidad;
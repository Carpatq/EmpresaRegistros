
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Carpat
 */
public class Empleados {
    String Nombre, Documento, Cargo, Area;
    String FechaIngreso;
    double Salario;
    
    public Empleados(){
    }

    public Empleados(String Nombre, String Documento, String Cargo, String Area, String FechaIngreso, double Salario) {
        this.Nombre = Nombre;
        this.Documento = Documento;
        this.Cargo = Cargo;
        this.Area = Area;
        this.FechaIngreso = FechaIngreso;
        this.Salario = Salario;
    }

    
    public String getNombre() {
    return Nombre ;
    }
    
    public void setNombre ( String Nombre ) {
        this.Nombre = Nombre;
    }
    
    public String getDocumento() {
    return Documento ;
    }
    
    public void setDocumento ( String Documento ) {
        this.Documento = Documento;
    }
    
    public String getCargo() {
    return Cargo ;
    }
    
    public void setCargo ( String Cargo ) {
        this.Cargo = Cargo;
    }
    
    public String getArea() {
    return Area ;
    }
    
    public void setArea ( String Area ) {
        this.Area = Area;
    }
    
    public double getSalario() {
    return Salario ;
    }
    
    public void setSalario ( double Salario ) {
        this.Salario = Salario;
    }
    
    public String getFechaIngreso() {
    return FechaIngreso ;
    }
    
    public void setFechaIngreso ( String FechaIngreso ) {
        this.FechaIngreso = FechaIngreso;
    }
    
        
    
}

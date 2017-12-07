/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author RM-PC
 */
public class Admision {
    private String fecha_contrato;
    private String cargo_inicial;
    private String salario;
    private String jefe;
    private String area;
    private String contrato;
    
    public Admision(String fecha_contrato, String cargo_inicial, String salario, String jefe, String area, String contrato){
        this.fecha_contrato = fecha_contrato;
        this.cargo_inicial = cargo_inicial;
        this.salario = salario;
        this.jefe = jefe;
        this.area = area;
        this.contrato = contrato;   
        
    }

    public Admision() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void setFecha_contrato(String fecha){
        this.fecha_contrato = fecha;
    }
    public String getFecha_Contrato(){
        return fecha_contrato;
    }
    
    public void setCargo_Inicial(String cargo){
        this.cargo_inicial = cargo;
    }
    public String getCargo_Inicial(){
        return cargo_inicial;
    }
    
    public void setSalario(String salario){
        this.salario = salario;
    }
    public String getSalario(){
        return salario;
    }
    
    public void setJefe(String jefe){
        this.jefe = jefe;
    }
    public String getJefe(){
        return jefe;
    }
    
    public void setArea(String area){
        this.area = area;
    }
    public String getArea(){
        return area;
    }
    
    public void setContrato(String contrato){
        this.contrato = contrato;
    }
    public String getContrato(){
        return contrato;
    }
}

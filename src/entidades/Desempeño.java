/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author je_pa
 */
public class Desempeño {
    private String habilidades;
    private String cargo;
    private String fechaevaluacion;
    private String nota;
    private String remuneracion;
    
    public Desempeño(String habilidades, String cargo, 
                    String fechaevaluacion, String nota,
                    String remuneracion ){
    
        this.habilidades = habilidades;
        this.cargo = cargo;
        this.fechaevaluacion = fechaevaluacion;
        this.nota = nota;
        this.remuneracion = remuneracion;
        
    }

    public Desempeño() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the habilidades
     */
    public String getHabilidades() {
        return habilidades;
    }

    /**
     * @param habilidades the habilidades to set
     */
    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }

    /**
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * @return the fechaevaluacion
     */
    public String getFechaevaluacion() {
        return fechaevaluacion;
    }

    /**
     * @param fechaevaluacion the fechaevaluacion to set
     */
    public void setFechaevaluacion(String fechaevaluacion) {
        this.fechaevaluacion = fechaevaluacion;
    }

    /**
     * @return the nota
     */
    public String getNota() {
        return nota;
    }

    /**
     * @param nota the nota to set
     */
    public void setNota(String nota) {
        this.nota = nota;
    }

    /**
     * @return the remuneracion
     */
    public String getRemuneracion() {
        return remuneracion;
    }

    /**
     * @param remuneracion the remuneracion to set
     */
    public void setRemuneracion(String remuneracion) {
        this.remuneracion = remuneracion;
    }
    
}

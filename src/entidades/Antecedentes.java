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
public class Antecedentes {
    private String ultimaempresa;
    private String ultimocargo;
    private String ultimojefe;
    private String ultimosueldo;
    private String remuneracion;
    
    public Antecedentes(String ultimaempresa,String ultimocargo,String ultimojefe,String ultimosueldo
    , String remuneracion){
        
        this.ultimaempresa = ultimaempresa;
        this.ultimocargo = ultimocargo;
        this.ultimojefe = ultimojefe;
        this.ultimosueldo = ultimosueldo;
        this.remuneracion = remuneracion;
    
    }

    /**
     * @return the ultimaempresa
     */
    public String getUltimaempresa() {
        return ultimaempresa;
    }

    /**
     * @param ultimaempresa the ultimaempresa to set
     */
    public void setUltimaempresa(String ultimaempresa) {
        this.ultimaempresa = ultimaempresa;
    }

    /**
     * @return the ultimocargo
     */
    public String getUltimocargo() {
        return ultimocargo;
    }

    /**
     * @param ultimocargo the ultimocargo to set
     */
    public void setUltimocargo(String ultimocargo) {
        this.ultimocargo = ultimocargo;
    }

    /**
     * @return the ultimojefe
     */
    public String getUltimojefe() {
        return ultimojefe;
    }

    /**
     * @param ultimojefe the ultimojefe to set
     */
    public void setUltimojefe(String ultimojefe) {
        this.ultimojefe = ultimojefe;
    }

    /**
     * @return the ultimosueldo
     */
    public String getUltimosueldo() {
        return ultimosueldo;
    }

    /**
     * @param ultimosueldo the ultimosueldo to set
     */
    public void setUltimosueldo(String ultimosueldo) {
        this.ultimosueldo = ultimosueldo;
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

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
public class acceso {
    private String id_usuario;
    private String nivel_acceso;
    private String nombre_usu;
    private String contra_usu;
    
    
    public acceso(String id, String nivel, String nombre, String contra){
    id_usuario = id;
    nivel_acceso = nivel;
    nombre_usu = nombre;
    contra_usu = contra;
    }

    /**
     * @return the id_usuario
     */
    public String getId_usuario() {
        return id_usuario;
    }

    /**
     * @param id_usuario the id_usuario to set
     */
    public void setId_usuario(String id_usuario) {
        this.id_usuario = id_usuario;
    }

    /**
     * @return the nivel_acceso
     */
    public String getNivel_acceso() {
        return nivel_acceso;
    }

    /**
     * @param nivel_acceso the nivel_acceso to set
     */
    public void setNivel_acceso(String nivel_acceso) {
        this.nivel_acceso = nivel_acceso;
    }

    /**
     * @return the nombre_usu
     */
    public String getNombre_usu() {
        return nombre_usu;
    }

    /**
     * @param nombre_usu the nombre_usu to set
     */
    public void setNombre_usu(String nombre_usu) {
        this.nombre_usu = nombre_usu;
    }

    /**
     * @return the contra_usu
     */
    public String getContra_usu() {
        return contra_usu;
    }

    /**
     * @param contra_usu the contra_usu to set
     */
    public void setContra_usu(String contra_usu) {
        this.contra_usu = contra_usu;
    }
    
}

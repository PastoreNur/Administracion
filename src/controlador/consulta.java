/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import entidades.Admision;
import entidades.Antecedentes;
import entidades.Datos_personales;
import entidades.Desempeño;
import entidades.acceso;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author je_pa
 */
public class consulta{
    
    private conexion conectar(){
        conexion con = null;
        try{
            con = new conexion();
        }catch(Exception e){
        
        }
        return con;
    }
    
    public boolean agregar_empleado(Antecedentes atn, Datos_personales dat, Desempeño des,Admision ad, acceso ac){
    
    return agregar_dp(dat) && agregar_ant(atn) && agregar_des(des) && agregar_acceso(ac) && agregar_admision(ad);
    }
    
    private boolean agregar_ant(Antecedentes ant){
    PreparedStatement pst = null;
    ResultSet rs = null;
    conexion con = null;
    String sql = "INSERT INTO `antecedentes`(`id_usuario`, `ultima_empresa`, `ultimo_cargo`, `jefe_inmediato`, `ultimo_sueldo`, `remuneracion`)"
            + " VALUES (?,?,?,?,?,?)";
    
    try{
    con = conectar();
    pst = con.getconexion().prepareStatement(sql);
    pst.setString(1, "null");
    pst.setString(2, ant.getUltimaempresa());
    pst.setString(3, ant.getUltimocargo());
    pst.setString(4, ant.getUltimojefe());
    pst.setString(5, ant.getUltimosueldo());
    pst.setString(6, ant.getRemuneracion());
    
    
    
    if(pst.executeUpdate() == 1){
        return true;
    }
    
    }catch(Exception e){
    return false;
    }finally{
        
        try{ 
            if(con.getconexion() != null){
            con.getconexion().close();
            
            }
            
            if(pst != null){
                
            pst.close();
            
            }
                
                }catch(Exception e){}
        
   
    
        }
    
    return false;
    }
    
    private boolean agregar_dp(Datos_personales dat){
    PreparedStatement pst = null;
    ResultSet rs = null;
    conexion con = null;
    String sql = "INSERT INTO `datospersonales`(`id_usuario`, `nombre`, `apellido`, `sexo`, `edad`, `DUI`, `NIT`, `direccion`, `nacionalidad`, `telefono`, `estado_civil`, `tipo_sangre`) "
                + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
    
    try{
    con = conectar();
    pst = con.getconexion().prepareStatement(sql);
    pst.setString(1, "null");
    pst.setString(2, dat.getNombre() );
    pst.setString(3, dat.getApellido());
    pst.setString(4, dat.getSexo());
    pst.setString(5, dat.getEdad());
    pst.setString(6, dat.getDui());
    pst.setString(7, dat.getNit());
    pst.setString(8, dat.getDireccion());
    pst.setString(9, dat.getNacionalidad());
    pst.setString(10, dat.getTelefono());
    pst.setString(11, dat.getEstado_civil());
    pst.setString(12, dat.getTipo_sangre());
    
    
    if(pst.executeUpdate() == 1){
        return true;
    }
    
    }catch(Exception e){
    return false;
    }finally{
        
        try{ 
            if(con.getconexion() != null){
            con.getconexion().close();
            
            }
            
            if(pst != null){
                
            pst.close();
            
            }
                
                }catch(Exception e){}
        }
    
    return false;
    }
    
    private boolean agregar_des(Desempeño desp){
    PreparedStatement pst = null;
    ResultSet rs = null;
    conexion con = null;
    
    try{
    con = conectar();
    String sql = "INSERT INTO `desempeño`(`id_usuario`, `habilidades`, `remuneracion`, `cargo_actual`, `ultima_fecha`, `nota`) VALUES (?,?,?,?,?,?)";
    con.getconexion().prepareStatement(sql);
    con = conectar();
    pst = con.getconexion().prepareStatement(sql);
    pst.setString(1, "null");
    pst.setString(2, desp.getHabilidades());
    pst.setString(3, desp.getRemuneracion());
    pst.setString(4, desp.getCargo());
    pst.setString(5, desp.getFechaevaluacion());
    pst.setString(6, desp.getNota());
    
    if(pst.executeUpdate() == 1){
        return true;
    }
    
    }catch(Exception e){
    return false;
    }finally{
        
        try{ 
            if(con.getconexion() != null){
            con.getconexion().close();
            
            }
            
            if(pst != null){
                
            pst.close();
            
            }
                
                }catch(Exception e){}
        }
    return false;
    }
    
    private boolean agregar_admision(Admision ad){
    PreparedStatement pst = null;
    ResultSet rs = null;
    conexion con = null;
    
    try{
    con = conectar();
    String sql = "INSERT INTO `admision`(`fecha_contrato`, `cargo_inicial`, `salario`, `id_usario`, `jefe`, `area`, `contrato`) VALUES (?,?,?,?,?,?,?)";
    con.getconexion().prepareStatement(sql);
    con = conectar();
    pst = con.getconexion().prepareStatement(sql);
    pst.setString(1, ad.getFecha_Contrato());
    pst.setString(2, ad.getCargo_Inicial());
    pst.setString(3, ad.getSalario());
    pst.setString(4, "null");
    pst.setString(5, ad.getJefe());
    pst.setString(6, ad.getArea());
    pst.setString(7, ad.getContrato());
    
    if(pst.executeUpdate() == 1){
        return true;
    }
    
    }
    catch(Exception e){
        return false;
    }finally{
        
        try{ 
            if(con.getconexion() != null){
            con.getconexion().close();
            
            }
            
            if(pst != null){
                
            pst.close();
            
            }
                
                }catch(Exception e){}
        }
    return false;
    }
    
    
    private boolean agregar_acceso(acceso ac){
    PreparedStatement pst = null;
    ResultSet rs = null;
    conexion con = null;
    
    try{
    con = conectar();
    String sql = "INSERT INTO `acceso`(`id_usuario`, `nivel_acceso`, `nombre_usu`, `contra_usu`) VALUES (?,?,?,?)";
    con.getconexion().prepareStatement(sql);
    con = conectar();
    pst = con.getconexion().prepareStatement(sql);
    pst.setString(1, ac.getId_usuario());
    pst.setString(2, ac.getNivel_acceso());
    pst.setString(3, ac.getNombre_usu());
    pst.setString(4, ac.getContra_usu());
    
    if(pst.executeUpdate() == 1){
        return true;
    }
    
    }
    catch(Exception e){
        return false;
    }finally{
        
        try{ 
            if(con.getconexion() != null){
            con.getconexion().close();
            
            }
            
            if(pst != null){
                
            pst.close();
            
            }
                
                }catch(Exception e){}
        }
    return false;
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pweb.business;

/**
 *
 * @author alumno
 */
import java.io.Serializable;

public class Regist implements Serializable{
    
   private Integer codigo; 
   private String primerNombre;
   private String apellidos;
   private String email;
   
   public Regist (){
       
       codigo=0;
       primerNombre="";
       apellidos="";
       email="";
       
             
   }
       
   public Regist (String primerNombre, String Apellidos, String email, Integer codigo)
   {
       this.codigo=codigo;
       this.primerNombre=primerNombre;
       this.apellidos=apellidos;
       this.email=email;
              
   }
   
      public Integer getcodigo() {
        return codigo;
    }

    public void setcodigo(Integer codigo) {
        this.codigo = codigo;
    }
    
    public String getprimerNombre(){
        return primerNombre;
            }
    
    public void setprimerNombre(String primerNombre){
            this.primerNombre=primerNombre;
    }
    
    public String getapellidos(){
        return apellidos;
    }    
    public void setapellidos(String apellidos){
        this.apellidos=apellidos;               
    }

    public String getemail(){
        return email;
    }
    public void setemail(String email){
     this.email=email;
     }
 
}


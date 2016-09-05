package pweb.business;

import java.io.Serializable;

public class User implements Serializable {

    private String Usuario;
    private String Contraseña;
    
    
    //constructor (inicializar los campos)

    public User() {
        Usuario = "";
        Contraseña = "";
       
    }

  
    
    public User(String Usuario, String lastName) {
        this.Usuario = Usuario;
        this.Contraseña= Contraseña;
       
    }
    //campo
    /***
     * Devuelve el primer nombre
     * @return 
     */
    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContaseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }
 
}

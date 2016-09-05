/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pweb.email;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pweb.business.Regist;
import pweb.data.RegistDB;

/**
 *
 * @author alumno
 */
@WebServlet(name = "RegistroServlet", urlPatterns = {"/RegistroServlet"})
public class RegistroServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    protected void requestprocess (HttpServletRequest request, HttpServletResponse response)
                    throws ServletException, IOException 
    {
        
          String url = "/pg1.html";
          
         String action = request.getParameter("action");
         if (action == null) {
            action = "join";  
            
        }
         
        if (action.equals("join")) {
            url = "/pg1.html";    
        }
        else if (action.equals("add"))
        {
            //int uno = Integer.parseInt(request.getParameter("dato1"));
            int codigo = Integer.parseInt(request.getParameter("codigo"));
            String  primerNombre= request.getParameter("primerNombre");
            String  apellidos=request.getParameter("apellidos");
            String  email=request.getParameter("email");
            
        }
        
        
        //String number = Integer.parseInt(request.getParameter("number"));
            // almacenar datos en el objeto User y guardar el objeto User en la base de datos
            
            // objeto tipo user 
            
            Regist regist=new Regist(primerNombre, apellido, codigo, email);
            RegistDB.insert(regist);
            
            
            // establecer objeto Usuario en el objeto request y establecer la URL
            request.setAttribute("regist", regist);
            url = "/finMatri.jsp";   
        }
   

    
}

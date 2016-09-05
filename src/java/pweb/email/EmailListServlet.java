/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pweb.email;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pweb.business.User;
import pweb.data.UserDB;

/**
 *
 * @author Fortress of Solitude
 */
public class EmailListServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        String url = "/index.html";

        // reuperar accion actual 
        String action = request.getParameter("action");
        if (action == null) {
            action = "join";  // accion por defecto 
        }

        // realizar accion y establecer la URL a una pagina apropiada
        if (action.equals("join")) {
            url = "/index.html";    // la pagina "join" 
        }
        else if (action.equals("add")) {                
            // obtener parámetros de la peticion
            //request - petición 
            //recupera valores de los parámetros
            String Usuario = request.getParameter("Usuario");
            String Contraseña = request.getParameter("Contraseña");
            

            //String number = Integer.parseInt(request.getParameter("number"));
            // almacenar datos en el objeto User y guardar el objeto User en la base de datos
            
            // objeto tipo user 
            User user = new User(Usuario, Contraseña);
            UserDB.insert(user);
            
            // establecer objeto Usuario en el objeto request y establecer la URL
            request.setAttribute("user", user);
            url = "/thanks.jsp";   // the "thanks" page
        }
        
        // forward request and response objects to specified URL
        getServletContext()
            .getRequestDispatcher(url)
            .forward(request, response);
    }
    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    //los parametros los coloca dentro del url 
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    //la información de los parámetros no esta incluida dentro de la url 
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

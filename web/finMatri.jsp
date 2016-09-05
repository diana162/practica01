<%-- 
    Document   : finMatri
    Created on : 05/09/2016, 02:08:24 PM
    Author     : alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MATRICULADA REALIZADA EXITOSAMENTE</title>
    </head>
    <body>
        
    <h1>¡ QUE TENGA BUEN DIA !</h1>
        

    <p>Aqui esta la información que ingresaste:</p>

    <label>Codigo:</label>
    <!--jsp -> recuperar -->
    
    <span>${regist.codigo}</span><br>
    
    <label>Nombre:</label>
    <span>${regist.primerNombre}</span><br>
    
    <label>Apellidos:</label>
    <span>${regist.Apellidos}</span><br>
    <label>Email:</label>
    <span>${user.email}</span><br>

    <p>Para ingresar a registro de matricula, dale click en el
        boton regresar en el explorador o el boton Regresar 
        que se muestra debajo.</p>

    <form action="" method="get">
        
        <!-- join - regresar (index)-->
 
        <input type="hidden" name="action" value="join">
        <input type="submit" value="Regresar">
    </form>

        
        
    </body>
</html>
//

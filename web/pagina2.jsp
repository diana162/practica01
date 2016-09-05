<%@page contentType="text/html" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>REGISTRAR ALUMNO</title>
    <link rel="stylesheet" href="styles/main.css" type="text/css"/>    
</head>

<body>
    <h1>USUARIO: user</h1>

    <p>Aqui esta la información que ingresaste:</p>
   
    
    <label>Usuario:</label>
     <!--jsp -> recuperar -->
    <span>${user.Usuario}</span><br>
    
    <label>Contraseña:</label>
    <span>${user.contraseña}</span><br>
   

    <p>Para ingresar otra dirección email, dale click en el
        boton regresar en el explorador o el boton Regresar 
        que se muestra debajo.</p>

    <form action="" method="get">
        
        <!-- join - regresar (index)-->
 
        <input type="hidden" name="action" value="join">
        <input type="submit" value="Regresar">
    </form>

</body>
</html>
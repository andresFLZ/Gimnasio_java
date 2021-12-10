<%-- 
    Document   : index
    Created on : 25/11/2020, 06:01:52 PM
    Author     : lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link id="style" href="css/estilosGym.css" rel="stylesheet" type='text/css'>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gimnasio</title>
    </head>
    <body class="body">
        <form action="SevletGym" method="get" id="formulario" accept-charset="UTF-8">
            <div class="divi">
                <h3>Llena los siguientes campos para escoger la rutina que se adapte mejor a tus necesidades</h3>
            
                <label for="nombre"></label>
                <input type="text" id="nombre" name="nombre" placeholder="Nombre(s)" required>
                <br><br><br>
                <label for="genero">Genero:</label>
                <br><br>
                <select class="select" name="genero" id= "genero"  required>
                    <option>Masculino</option>
                    <option>Femenino</option>
                    <option>Indefinido</option>
                </select>
                <br><br><br>
                <label for="peso"></label>
                <input type="text" id="peso" name="peso" placeholder="Peso(Kg)" required>
                <br><br><br>
                <label for="altura"></label>
                <input type="text" id="altura" name="altura" placeholder="Altura(Cm)" required>
                <br><br><br>
                <label for="diasLibres">¿Cuantos días vas a entrenar a la semana?</label>
                <br><br>
                <select class="select" name="diasLibres" id= "diasLibres"  required>
                    <option>De 1 a 3</option>
                    <option>De 3 a 5</option>
                </select>
                <br><br><br>
                <label for="objetivo">¿Qué objetivo tienes?</label>
                <br><br>
                <select class="select" name="objetivo" id= "objetivo"  required>
                    <option>Subir de peso</option>
                    <option>Bajar de peso</option>
                    <option>Tonificar</option>
                </select>
                <br><br><br>
                <input class="boton" type="submit" name="enviar" value="Enviar">
                <br><br>
            </div>
        </form>
    </body>
</html>

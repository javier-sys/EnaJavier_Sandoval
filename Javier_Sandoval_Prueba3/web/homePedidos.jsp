<%--
<%@page import="dao.CiudadDAO"%>
<%@page import="modelos.Estadio"%>
<%@page import="dao.EstadioDAO"%>
<%@page import="modelos.Ciudad"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% if (session.getAttribute("usuario") == null) {
        response.sendRedirect("index.jsp?msj=No te pases");
    } else {
        Estadio a = new Estadio();
        if (request.getParameter("id") != null) {
            a = new EstadioDAO().obtenerEstadio(Integer.parseInt(request.getParameter("id")));
        }
%>  --%>
<html>
    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mis Pedidos</title>
    </head>
    <body>
    <center>
        <h1> Ingresar Pedidos</h1>
        <% if(request.getParameter("msj")!= null){%>
        <h3><%= request.getParameter("msj") %></h3>
        <%}%>
        <form action="ControladorPedidos" method="post">
            <input type ="hidden" name="accion" value="1">
            <table>
                
                
                <td>Ingrese Pedidos</td>
                    <td>
                        <select name="Producto">
                           <%-- <option value="0">Seleccione</option>
                            <% ArrayList<Producto> Productos = new ProductoDAO().obtenerProductos();
                                for (Producto  : Productos) {%>
                            <option value="<%= c.getId()%>" >
                                                      </option>

<%= c.getNombre()%>   

                            <% } %>
                        </select>
                    </td>
                </tr>
                            --%>
                
                <tr>
                    <td>Ingrese Cantidad</td>
                    <td><input type="number" name="Cantidad"/></td>
                </tr>
                <tr>
                    <td>Ingrese Correo</td>
                    <td><input type="text" name="Ingrese Correo"/></td>
                <tr>
                    
                        
                <tr>
                    <td><input type="submit" value="Registrar"/></td>
                    <td><input type="submit" value="Cancelar"/></td>

                </tr>
            </table>
        </form>
       <% if (request.getParameter("msj") != null) {%>
        <h4><%= request.getParameter("msj")%></h4>
          <%}%>

    </center>
</body>
</html>
<% }%>
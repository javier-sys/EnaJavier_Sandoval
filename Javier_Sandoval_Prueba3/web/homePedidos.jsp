
<%@page import="dao.ProductoDAO"%>
<%@page import="modelos.Producto"%>
<%@page import="dao.PedidoDAO"%>
<%@page import="modelos.Pedido"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
 
<html>
    <head>
        <% if (session.getAttribute("Pedido") == null) {
        response.sendRedirect("index.jsp?msj=No te pases");
    } else {
        Pedido a = new Pedido();
        if (request.getParameter("id") != null) {
            a = new PedidoDAO().obtenerPedido(Integer.parseInt(request.getParameter("id")));
        }
%>
        

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mis Pedidos</title>
    </head>
    <body>
    <center>
        <h1> Ingresar Pedidos</h1>
        <% if(request.getParameter("msj")!= null){%>
        <h3><%= request.getParameter("msj") %></h3>
        <%}%>
        <form action="ControladorPedido" method="post">
            <input type ="hidden" name="accion" value="1">
            <table>
                
                
                <td>Ingrese Pedidos</td>
                    <td>
                        <select name="producto">
                            <option value="0">Seleccione</option>
                            <% ArrayList<Producto> Productos = new ProductoDAO().obtenerProductos();
                                for (Producto p : Productos) {%>
                            <option value="<%= p.getCodigo()%>" >
                                                     

                                   <%= p.getNombre()%>   

                             </option>

                            <% } %>
                        </select>
                    </td>
                </tr>
                            
                
                <tr>
                    <td>Ingrese Cantidad</td>
                    <td><input type="number" name="cantidad"/></td>
                </tr>
                <tr>
                    <td>Ingrese Correo</td>
                    <td><input type="text" name="correo"/></td>
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
             <menu>
            <a href="homePedidos.jsp">
            <menuitem>Pedidos</menuitem>
            </a> 
         </menu>
</body>
</html>
<% }%>
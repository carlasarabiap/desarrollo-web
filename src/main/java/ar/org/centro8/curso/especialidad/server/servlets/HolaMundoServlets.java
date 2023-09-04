package ar.org.centro8.curso.especialidad.server.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "holaservlet", urlPatterns = "/servlet")
public class HolaMundoServlets extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //response.setContentType("text/plain");
        response.setContentType("text/html");
        try (PrintWriter out=response.getWriter()) {
            out.println("<h1>hola Mundo Servlet</h1>");  //Esto sale por HTTP
            System.out.println("Hola consola"); //Esto sale por consola
        
            //http://localhost:8082/servlet
            //http://localhost:8082/servlet?nombre=Carlos

            //Parametros de entrada
            String nombre=request.getParameter("nombre");
            if(nombre!=null && !nombre.isEmpty()){
                out.println("<p>Hola "+nombre+"</p>");
            }

            Map<String,String[]>mapa=request.getParameterMap();
            for(String st: mapa.keySet()) out.println(st);
            /*
             * print('Hola Mundo!')
             * System.out.println("Hola Mundo!");
             * response.out.println("Hola Mundo!");
             * FileWriter.out.printlt("Hola Mundo!");
             */
        
        } catch (Exception e) {
            System.out.println(e);
        }
    }
  
}

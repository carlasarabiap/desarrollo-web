package ar.org.centro8.curso.especialidad.server.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "login", urlPatterns = "/login")
public class LoginServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        try (PrintWriter out=response.getWriter()) {
            out.println("No se puede ingresar parámetros por GET");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        try (PrintWriter out=response.getWriter()) {
            String user=request.getParameter("user");
            String pass=request.getParameter("pass");
            if(user.equals("root") && pass.equals("123")){
                out.println("<h2>Bienvenido al sistema!</h2>");
            }else{
                out.println("<h2>Error de datos!</h2>");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    
    
    

}

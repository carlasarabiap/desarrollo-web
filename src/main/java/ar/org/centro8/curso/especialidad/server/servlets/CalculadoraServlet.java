package ar.org.centro8.curso.especialidad.server.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "calcular", urlPatterns = "/calcular")
public class CalculadoraServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        try (PrintWriter out=response.getWriter()) {
            float nro1=Integer.parseInt(request.getParameter("nro1"));
            float nro2=Integer.parseInt(request.getParameter("nro2"));
            float resultado;
            String operacion;
            operacion=request.getParameter("operador");
            
            switch (operacion) {
                case "sumar":
                    resultado=nro1+nro2;
                    out.println("<h2>resultado:</h2>");
                    out.println(resultado);
                    break;
                case "restar":
                    resultado=nro1-nro2;
                    out.println("<h2>resultado:</h2>");
                    out.println(resultado);
                    break;
                case "multiplicar":
                    resultado=nro1*nro2;
                    out.println("<h2>resultado:</h2>");
                    out.println(resultado);
                    break;
                case "dividir":
                    resultado=nro1/nro2;
                    out.println("<h2>resultado:</h2>");
                    out.println(resultado);
                    
                    break;
            } 
        } catch (Exception e) {
            System.out.println(e);
            }
    }
}

package PaqueteServlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Servlet1 extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            response.setContentType("text/html;charset=UTF-8");
            String valor1 = request.getParameter("parametro1");
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet servlet2</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Hola Mundo " + valor1 + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
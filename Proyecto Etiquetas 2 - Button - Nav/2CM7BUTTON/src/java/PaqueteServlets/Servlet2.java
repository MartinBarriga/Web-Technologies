
package PaqueteServlets;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Servlet2 extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            response.setContentType("text/html;charset=UTF-8");
            HttpSession session = request.getSession();
            String cantidadButtons = (String) session.getAttribute("cantidadButtons");
            int cantidadButtonsInt = Integer.parseInt(cantidadButtons);
           
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");          
            out.println("</head>");
            out.println("<body>");
            for(int i = 0; i < cantidadButtonsInt; i++)
            {
                out.println("<button type = 'button' onclick = \"alert('" + request.getParameter("mensajeEmergente" + i) + "')\" >");
                out.println(request.getParameter("mensajeContenido" + i));
                out.println("</button>");
                out.println("<br/> <br/> <br/> <br/>");
            }  
            
            out.println("</body>");
            out.println("</html>");
    }
}

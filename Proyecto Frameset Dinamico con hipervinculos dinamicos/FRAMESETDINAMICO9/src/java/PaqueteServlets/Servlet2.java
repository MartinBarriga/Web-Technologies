
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
            String numero = (String)session.getAttribute("numero");
            int numeroInt = Integer.parseInt(numero);
            String cadena = "";
            for(int i = 0; i<numeroInt; i++)
            {
                cadena += cadena + "texto"+i+"="+request.getParameter("texto" + i) + "&" + "href" + i + "=" + request.getParameter("href"+i) + "&";
            }
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet1</title>");            
            out.println("</head>");
            out.println("<frameset cols='80,*' frameborder='yes' border='1' framespacing='0' />");
            out.println("<frame src='Servlet3?" +cadena+ "' />");
            out.println("<frame src='index.html' name = 'derecho'/>");
            out.println("</ frameset>");
            out.println("<noframes>");
            out.println("<body>");
            
            out.println("</body>");
            out.println("</noframes>");
            out.println("</html>");
    }
}


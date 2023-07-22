package cl.awakelab.actividadm5java;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(name = "loginServlet", value = "/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h3>" + "Login" + "</h1>");
        out.println("<br>");
        out.println("<form>");
        out.println("<label>Rut de Usuario:</label><br>");
        out.println("<input type=\"text\" name=\"rutUsuario\"><br>");
        out.println("<label>Clave:</label><br>");
        out.println("<input type=\"password\" name=\"clave\"><br>");
        out.println("<br>");
        out.println("<button type=\"submit\">Ingresar</button>");
        out.println("</form>");
        out.println("</body></html>");
    }
}

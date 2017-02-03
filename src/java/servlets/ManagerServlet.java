package servlets;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Dmitry
 */
public abstract class ManagerServlet extends HttpServlet{
    
    protected void forward(String to, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher(to);
        requestDispatcher.forward(request, response);
    }
    
}

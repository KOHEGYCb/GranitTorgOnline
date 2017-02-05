package servlets;

import constants.Pages;
import constants.Parameters;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Dmitry
 */
@WebServlet("/menu")
public class MenuServlet extends ManagerServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if(req.getParameter(Parameters.MENU_LOGOUT) != null){
            HttpSession session = req.getSession();
            session.setAttribute(Parameters.USER_LOGIN, null);
            session.setAttribute(Parameters.USER_PRIVACY, null);
            forward(Pages.LOGIN, req, resp);
        }
        
        if(req.getParameter(Parameters.MENU_PLACE) != null){
            forward(Pages.PLACE, req, resp);
        }
        
        if(req.getParameter(Parameters.MENU_MAIN) != null){
            forward(Pages.MAIN_PAGE, req, resp);
        }
        
        if(req.getParameter(Parameters.MENU_TYPE) != null){
            forward(Pages.TYPE, req, resp);
        }
        
        if(req.getParameter(Parameters.MENU_PARAMETER) != null){
            forward(Pages.PARAMETER, req, resp);
        }
        
        if(req.getParameter(Parameters.MENU_ENTITY) != null){
            forward(Pages.ENITITY, req, resp);
        }
    }

}

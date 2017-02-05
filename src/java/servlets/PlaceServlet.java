package servlets;

import constants.Actions;
import constants.Messages;
import constants.Pages;
import constants.Parameters;
import dao.PlaceDAO;
import entities.Place;
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
@WebServlet("/PlaceServlet")
public class PlaceServlet extends ManagerServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if(req.getParameter("addPlace") != null){
            AddPlace(req, resp);
        }
    }
    
    private void AddPlace(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException{
        String name = req.getParameter(Parameters.ADD_PLACE_NAME);
        System.out.println("\n\n\n\n\n\n\n" + name);
        boolean isCorrectData = true;
        if ("".equals(name)) {
            isCorrectData = false;
            req.setAttribute(Parameters.WRONG_PLACE, Messages.WRITE_PLACE);
        }
        Place place = new Place(name);
        if (isCorrectData) {
            if (!PlaceDAO.getINSTANCE().isFound(place)) {
                PlaceDAO.getINSTANCE().create(place);
                HttpSession session = req.getSession();
                session.setAttribute(Parameters.ACTION, Actions.ADD_PLACE);
            } else {
                isCorrectData = false;
                req.setAttribute(Parameters.ADD_PLACE, place.getName());
                req.setAttribute(Parameters.WRONG_PLACE, Messages.PLACE_ALREDY_CREATE);
            }
        }else{
            isCorrectData = false;
            req.setAttribute(Parameters.WRONG_PLACE, Messages.WRITE_PLACE);
        }
            
        if (isCorrectData) {
            forward(Pages.MAIN_PAGE, req, resp);
        } else {
            forward(Pages.PLACE, req, resp);
        }
    }

}

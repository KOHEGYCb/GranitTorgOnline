package servlets;

import constants.Actions;
import constants.Messages;
import constants.Pages;
import constants.Parameters;
import dao.UserDAO;
import entities.User;
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
@WebServlet("/loginServlet")
public class LoginServlet extends ManagerServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute(Parameters.WRONG_PASSWORD, Messages.EMPTY);
        req.setAttribute(Parameters.LOGIN_NOT_FONUD, Messages.EMPTY);

        String login;
        String pasword;
        login = req.getParameter(Parameters.LOGIN);
        pasword = req.getParameter(Parameters.PASSWORD);
        boolean isCorrectData = true;
        if (isCorrectData & "".equals(login)) {
            req.setAttribute(Parameters.LOGIN_NOT_FONUD, Messages.WRITE_LOGIN);
            isCorrectData = false;
        }
        if (isCorrectData & "".equals(pasword)) {
            req.setAttribute(Parameters.LOGIN, login);
            req.setAttribute(Parameters.WRONG_PASSWORD, Messages.WRITE_PASSWORD);
            isCorrectData = false;
        }
        User user = new User(login, pasword);
        if (isCorrectData) {
            if (UserDAO.getINSTANCE().isUserFound(user)) {
                user = UserDAO.getINSTANCE().getUser(user);
                if (user.getId() == -1) {
                    isCorrectData = false;
                    req.setAttribute(Parameters.LOGIN, user.getLogin());
                    req.setAttribute(Parameters.WRONG_PASSWORD, Messages.WRONG_PASSWORD);
                } else {
                    HttpSession session = req.getSession();
                    session.setAttribute(Parameters.USER_LOGIN, user.getLogin());
                    session.setAttribute(Parameters.USER_PRIVACY, user.getPrivacy());
                    session.setAttribute(Parameters.ACTION, Actions.LOGIN);
                }
            } else {
                req.setAttribute(Parameters.LOGIN_NOT_FONUD, Messages.LOGIN_NOT_FOUND);
                req.setAttribute(Parameters.LOGIN, user.getLogin());
            }
        }
        if (!isCorrectData) {
            forward(Pages.LOGIN, req, resp);
        } else {
            forward(Pages.MAIN_PAGE, req, resp);
        }
    }

}

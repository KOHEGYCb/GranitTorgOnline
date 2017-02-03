package filters;

import constants.Pages;
import constants.Parameters;
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Dmitry
 */
@WebFilter(urlPatterns = {"/*"})
public class MyFilter implements Filter {

    private FilterConfig filterConfig;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpSession session = req.getSession();
        if (req.getParameter("login") != null) {
            chain.doFilter(request, response);
        } else {
            if (session.getAttribute(Parameters.USER_LOGIN) == null) {
                ServletContext ctx = filterConfig.getServletContext();
                RequestDispatcher dispatcher = ctx.getRequestDispatcher(Pages.LOGIN);
                dispatcher.forward(request, response);
            } else {
                chain.doFilter(request, response);
            }
        }
    }

    @Override
    public void destroy() {

    }

}

package lv.ctco.javaschool;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by yelena.krasnakova on 3/8/2017.
 */
@WebServlet(name = "HelloServlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        User user = new User(request);
        request.getSession().setAttribute("user", user);
        response.sendRedirect("/hello.jsp");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().print("HelloServlet");

    }
}

package controller;

import bean.HelloWorldBean;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author rifatul.islam
 * @since 6/29/14.
 */


@WebServlet(name = "HelloServlet", urlPatterns = "/helloworld")
public class HelloServlet extends HttpServlet {

    @EJB
    private HelloWorldBean helloWorldBean;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String hello = helloWorldBean.sayHello();
        request.setAttribute("hello", hello);
        request.getRequestDispatcher("hello.jsp").forward(request, response);
    }
}

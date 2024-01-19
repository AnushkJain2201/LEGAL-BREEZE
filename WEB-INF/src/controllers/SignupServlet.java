package controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletContext;

import utils.AppUtility;
import models.State;
import models.User;

@WebServlet("/signup.do")
public class SignupServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String nextURL = "signup.jsp";
        
        request.getRequestDispatcher(nextURL).forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession();

        String responseToken = request.getParameter("g-recaptcha-response");

        // #######################################
        ServletContext context = getServletContext();

        String recaptchaURL = context.getInitParameter("recaptcha_url");
        String secretKey = context.getInitParameter("secret_key");

        boolean flag = AppUtility.checkGoogleRecaptchaResponse(recaptchaURL, responseToken, secretKey);
        // #######################################

        // System.out.println(flag);
        String nextURL = "signup.jsp";

        if (flag) {
            String name = request.getParameter("username");
            String password = request.getParameter("password");
            String email = request.getParameter("email");
            String phone =request.getParameter("phone");
            int stateId = Integer.parseInt(request.getParameter("state"));

            User user = new User(name, email, password, phone, new State(stateId));
            if(user.signInUser()){
                // send email
                session.setAttribute("user", user);
                nextURL = "signin.jsp";
            }
        }
        request.getRequestDispatcher(nextURL).forward(request, response);
    }
}
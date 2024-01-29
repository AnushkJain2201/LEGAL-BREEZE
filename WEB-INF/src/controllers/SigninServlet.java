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
import utils.EmailSender;
import utils.OTPGenerator;

import models.State;
import models.User;
import models.UserType;


@WebServlet("/signin.do")
public class SigninServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String nextURL = "signin.jsp";

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
        String nextURL = "signin.jsp";

        if (flag) {
           
            String password = request.getParameter("password");
            String email = request.getParameter("email");

            // String otp = OTPGenerator.generateOTP();
            // System.out.println("Saving otp at the db for future email verification"+otp);
            User user = new User(password, email);
            flag = user.signInUser();
            if (flag) {
                nextURL = "dashboard.jsp";
            }
        }
        request.getRequestDispatcher(nextURL).forward(request, response);
    }
}
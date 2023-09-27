package com.ben.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

    private static final String myusername = "ndekezibenjamin2@gmail.com";
    private static final String mypassword = "auca@2023";

    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        String eusername = req.getParameter("username");
        String epassword = req.getParameter("password");

        if (myusername.equals(eusername) && mypassword.equals(epassword)) {

            res.sendRedirect("home.html");

        } else {

            res.sendRedirect("forget_password.html");

        }

    }

}
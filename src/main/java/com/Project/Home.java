package com.Project;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Home")
public class Home extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        try {
            request.getRequestDispatcher("index.jsp").forward(request,response);
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<h3>This is my servlet</h3>");

        } catch (IOException ioException) {
            System.out.println(ioException);
        }
        catch (ServletException e){
            e.printStackTrace();
        }

    }
}



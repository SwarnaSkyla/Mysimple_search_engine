package com.Project;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

@WebServlet("/History")
public class History extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response){
        try{

            Connection connection=DataBaseConnection.getConnection();
            ResultSet resultSet=connection.createStatement().executeQuery("Select * from history");
            ArrayList<Historyresult> results=new ArrayList<Historyresult>();
            while(resultSet.next()){
                Historyresult historyresult=new Historyresult();
                historyresult.setName(resultSet.getString("name"));
                historyresult.setLink(resultSet.getString("link"));
                results.add(historyresult);
            }
            for(Historyresult historyresult:results){
                System.out.println(historyresult.getName()+" "+historyresult.getLink()+"\n");
            }
            request.setAttribute("results",results);
            request.getRequestDispatcher("history.jsp").forward(request,response);

        }
        catch (SQLException e){
            e.printStackTrace();
        }
        catch (ServletException servletException){
            servletException.printStackTrace();
        }
        catch (IOException ioException){
            ioException.printStackTrace();
        }

    }
}

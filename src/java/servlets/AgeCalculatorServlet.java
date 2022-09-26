/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Komaldeep Kaur Virk
 */
public class AgeCalculatorServlet extends HttpServlet {

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp")
                .forward(request, response);
      
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String age = request.getParameter("age");
        
        if (age == null || age == "") 
        {
            request.setAttribute("age1", "You must give your current age");
            getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp")
                .forward(request, response);
            return;
        }
        
        int ageIntVal=0;
        
        try {
            ageIntVal = Integer. parseInt(age);
        } catch(Exception e) {
            request.setAttribute("age1", "Please enter an integer to calculate the age");
            getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp")
            .forward(request, response);
            return;
        }
                ageIntVal += 1;
        
        request.setAttribute("ageIntVal", "Your next birthday will be: " +ageIntVal);
        
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp")
        .forward(request, response);

    }

}

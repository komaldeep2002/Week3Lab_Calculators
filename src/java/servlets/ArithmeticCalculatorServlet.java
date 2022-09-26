/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Komaldeep Kaur Virk
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("result", "---");
        getServletContext().getRequestDispatcher("/WEB-INF/ArithmeticCalculator.jsp")
        .forward(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String first = request.getParameter("first");
        String second = request.getParameter("second");
        String calc = request.getParameter("calc");
        
        request.setAttribute("first", first);
        request.setAttribute("second", second);
        
        if (first == null || first.equals("") || second == null || second.equals(""))
        {
            request.setAttribute("result", "invalid");
            getServletContext().getRequestDispatcher("/WEB-INF/ArithmeticCalculator.jsp")
            .forward(request, response);
            return;
        }
        
        int fInt=0, lInt=0;  
        try {
            fInt = Integer.parseInt(first);
            lInt = Integer.parseInt(second);
        } catch(Exception e) {
            request.setAttribute("result", "Please enter an integer");
            getServletContext().getRequestDispatcher("/WEB-INF/ArithmeticCalculator.jsp")
            .forward(request, response);
            return;
        }
        
        int finalResult = 0;
        
        if (calc.equals("+"))
            finalResult = fInt + lInt;
        else if (calc.equals("-"))
            finalResult = fInt - lInt; 
        else if (calc.equals("*"))
            finalResult = fInt * lInt; 
        else if (calc.equals("%"))
            finalResult = fInt / lInt;
        
        request.setAttribute("result", finalResult);
        
        getServletContext().getRequestDispatcher("/WEB-INF/ArithmeticCalculator.jsp")
        .forward(request, response);
    }


}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author toshiba
 */
@WebServlet(name = "produit_ser", urlPatterns = {"/produit_ser"})
public class produit_ser extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String des=request.getParameter("designation");
        int prix= Integer.parseInt(request.getParameter("prix"));
        int qut=Integer.parseInt(request.getParameter("quantite"));
        int result=prix*qut;
        request.setAttribute("result", result);
        request.getRequestDispatcher("result.jsp").forward(request, response);
      
        }
    }

  



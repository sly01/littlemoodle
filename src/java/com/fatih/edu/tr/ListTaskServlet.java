/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fatih.edu.tr;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author erkoc
 */
public class ListTaskServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        TaskDao taskDao = new TaskDao();
        ArrayList<Task> array = taskDao.getAllTasks();
        //request.setAttribute("ListTaskServlet", array);
        for (Task a : array) {
            out.print("<style>\n"
                    + "table, th, td {\n"
                    + "    border: 1px solid black;\n"
                    + "    border-collapse: collapse;\n"
                    + "}\n"
                    + "th, td {\n"
                    + "    padding: 5px;\n"
                    + "}\n"
                    + "</style>");
            out.print("<table><hr>");
            out.print("<tr><th>Id</th>");
            out.print("<th>Title</th>");
            out.print("<th>Description</th></tr>");
            out.print("<tr><td><b>" + a.getId() + "</td></b>" + " ");
            out.print("<td><b>" + a.getTitle() + "</td></b>" + " ");
            out.print("<td><b>" + a.getDescription() + "</td></b>" + " ");
            out.print("<td><input type='submit' value='Submit'/></td></tr><br/>");
            out.print("</table>");

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

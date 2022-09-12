/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package api;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Fatec
 */
@WebServlet(name = "BrianMelinskiBianchiniApiXmlServlet", urlPatterns = {"/brianmelinskibianchini-dados.xml"})
public class BrianMelinskiBianchiniApiXmlServlet extends HttpServlet {

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
        response.setContentType("application/xml;charset=UTF-8");
        response.getWriter().println("<?xml version='1.0' encoding='UTF-8'?>");
        response.getWriter().println("<dados>");
        response.getWriter().println("<nome>Brian Melinski Biancihini</nome>");
        response.getWriter().println("<ra>1290482112028</ra>");
        response.getWriter().println("<disciplinas>"
                + "<disciplina>EDS004	Estágio Supervisionado em Análise e Desenvolvimento de Sistemas</disciplina>"
                + "<disciplina>IBD002	Banco de Dados</disciplina>"
                + "<disciplina>IES300	Engenharia de Software III</disciplina>"
                + "<disciplina>ILP007	Programação Orientada a Objetos</disciplina>"
                + "<disciplina>ILP512	Linguagem de Programação IV</disciplina>"
                + "<disciplina>ISO200	Sistemas Operacionais II</disciplina>"
                + "<disciplina>TTG001	Metodologia da Pesquisa Científico-Tecnológica</disciplina>"
                + "</disciplinas>");
        response.getWriter().println("</dados>");
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

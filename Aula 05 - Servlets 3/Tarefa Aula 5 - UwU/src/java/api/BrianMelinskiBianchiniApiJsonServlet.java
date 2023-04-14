/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package api;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.*;

/**
 *
 * @author Fatec
 */
@WebServlet(name = "BrianMelinskiBianchiniApiJsonServlet", urlPatterns = {"/brianmelinskibianchini-dados.json"})
public class BrianMelinskiBianchiniApiJsonServlet extends HttpServlet {
    private static ArrayList<String> list = new ArrayList();

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
        JSONObject file = new JSONObject();
        file.put("Nome", "Brian Melinski Bianchini");
        file.put("RA", "1290482112028");
        JSONArray arr = new JSONArray();
        file.put("Disciplinas", arr);
        arr.put("EDS004 Estágio Supervisionado em Análise e Desenvolvimento de Sistemas");
        arr.put("IBD002 Banco de Dados");
        arr.put("IES300 Engenharia de Software III");
        arr.put("ILP007 Programação Orientada a Objetos");
        arr.put("ILP512 Linguagem de Programação IV");
        arr.put("ISO200 Sistemas Operacionais II");
        arr.put("TTG001 Metodologia da Pesquisa Científico-Tecnológica");
        
        response.getWriter().println(file.toString());
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

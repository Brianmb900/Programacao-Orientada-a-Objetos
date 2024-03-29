/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package web;

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
@WebServlet(name = "MathServlet", urlPatterns = {"/math.html"})
public class MathServlet extends HttpServlet {

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
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Math - ADS POO</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h4><a href='index.html'>Voltar</a></h4>");
            out.println("<h1>Servlet MathServlet</h1>");
            int n1 = 1;
            int n2 = 1;
            String o =request.getParameter("operação");
            try{
                n1 = Integer.parseInt(request.getParameter("n1"));
                n2 = Integer.parseInt(request.getParameter("n2"));
            }catch(Exception ex){
                out.println("<div style='color: red;'>"
                        + "Paramêtros Inválidos"
                        + "</div>");
            }
            out.println("<form>");
            out.println("Valores:"
                    + "<input type='number' name='n1' value='"+n1+"'/>" 
                    +"<select name='operação'>" 
                    +"<option value='+'>+</option>" 
                    +"<option value='-'>-</option>" 
                    +"<option value='*'>*</option>" 
                    +"<option value='/'>/</option>" 
                    +"</select>" 
                    +"<input type='number' name='n2' value='"+n2+"'/>" 
                    +"<input type='submit' name='calculadora' value='Calcular'/>");
            out.println("</form>");
            switch (o){
                case "+" :
                    out.println("<h2>"+n1+" + "+n2+" = "+(n1+n2)+"</h2>");
                    break;
                case "-" :
                    out.println("<h2>"+n1+" - "+n2+" = "+(n1-n2)+"</h2>");
                    break;
                case "*" :
                    out.println("<h2>"+n1+" * "+n2+" = "+(n1*n2)+"</h2>");
                    break;
                case "/" :
                    out.println("<h2>"+n1+" / "+n2+" = "+(n1/n2)+"</h2>");
                    break;
                default:
                    out.println("<h3 style='color: red'>Selecionar uma opção VÁLIDA</h3>");
                    break;
            }
            out.println("</body>");
            out.println("</html>");
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

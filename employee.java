/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 21cse067
 */
public class NewServlet1 extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
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
        try {
            String str1=request.getParameter("uname");
             String str2=request.getParameter("ID");
              double str3=Integer.parseInt(request.getParameter("BPAY"));
               double str4=Integer.parseInt(request.getParameter("HRA"));
               double da=0.5*str3;
               double gp=str3+str4+da;
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NewServlet1</title>");            
            out.println("</head>");
            out.println("<body>");
            Random r=new Random();  
            String  QUOTES[] = {
            "Be yourself; everyone else is already taken.― Oscar Wilde",
            "A room without books is like a body without a soul. ― Marcus Tullius Cicero",
            "Be the change that you wish to see in the world. ― Mahatma Gandhi",
            "If you tell the truth, you don't have to remember anything. ― Mark Twain",
            "If you want to know what a man's like, take a good look at how he treats his inferiors, not his equals.― J.K. Rowling",
            "To live is the rarest thing in the world. Most people exist, that is all.― Oscar Wilde",
            "Without music, life would be a mistake. ― Friedrich Nietzsche",
            "Always forgive your enemies, nothing annoys them so much. ― Oscar Wilde",
            "Life isn't about getting and having, it's about giving and being. –Kevin Kruse",
            "Whatever the mind of man can conceive and believe, it can achieve. –Napoleon Hill",
            "Strive not to be a success, but rather to be of value. –Albert Einstein"};
            out.println("<h1> NAME:"+str1+"</h1>");
            out.println("<h1>EMP_ID:"+str2+"</h1>");
            out.println("<h1>BASIC_PAY:"+str3+"</h1>");
            out.println("<h1>HRA:"+str4+"</h1>");
            out.println("<h1>DA:"+da+"</h1>");
            out.println("<h1>GP:"+gp+"</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
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
     * Handles the HTTP
     * <code>POST</code> method.
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

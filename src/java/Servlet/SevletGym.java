/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Logica.Ejercicio;
import Logica.Rutina;
import Logica.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lenovo
 */
public class SevletGym extends HttpServlet {
    
    static Usuario u;
    static ArrayList<Ejercicio> ejercicios = new ArrayList<Ejercicio>();
    static ArrayList<Ejercicio> dia_1 = new ArrayList<Ejercicio>();
    static ArrayList<Ejercicio> dia_2 = new ArrayList<Ejercicio>();
    static ArrayList<Ejercicio> dia_3 = new ArrayList<Ejercicio>();
    static Rutina r = new Rutina();
    static Ejercicio e = new Ejercicio();
    
    public static void liskov(String objetivo, String diasLibres){
        ejercicios = r.generarRutina(objetivo);
        dia_1 = r.asignarDia1(ejercicios);
        dia_2 = r.asignarDia2(ejercicios);
        dia_3 = r.asignarDia3(ejercicios);
        e.asignarUsoEjercicios(diasLibres);
    }

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
        
        u = new Usuario();
        u.setNombre(request.getParameter("nombre"));
        u.setObjetivo(request.getParameter("objetivo"));
        u.setDiasLibres(request.getParameter("diasLibres"));
        liskov(u.getObjetivo(), u.getDiasLibres());
        
        for(Ejercicio i: ejercicios){
            i.asignarDatosEjercicio();
        }
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<link id=\"style\" href=\"css/estilosGym.css\" rel=\"stylesheet\" type='text/css'>");
            out.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">");
            out.println("<title>Rutina</title>");            
            out.println("</head>");
            out.println("<body class=\"body\">");
            out.println("<div class=\"divs\">");
            out.println("<p class=\"p\">Rutina</p>");
            out.println("<b>Nombre:</b>&nbsp;"+u.getNombre());
            out.println("<br><br>");
            out.println("<b>Objetivo:</b>&nbsp;"+u.getObjetivo());
            out.println("<br><br>");
            out.println("<h1>Ejercicios</h1>");
            if(u.getDiasLibres().equals("De 1 a 3")){
                out.println("<b class=\"azul\">Día 1</b>");
                out.println("<br><br>");
                for(int i=0;i<3;i++){
                    out.println("<b>"+(i+1)+". "+dia_1.get(i).getNombreEjercicio()+"</b>");
                    out.println("<br><br>");
                    out.println(dia_1.get(i).getDescripcion());
                    out.println("<br><br>");
                    out.println(dia_1.get(i).getEjemplo());
                    out.println("<br><br>");
                }
                out.println("<b class=\"azul\">Día 2</b>");
                out.println("<br><br>");
                for(int i=0;i<3;i++){
                    out.println("<b>"+(i+1)+". "+dia_2.get(i).getNombreEjercicio()+"</b>");
                    out.println("<br><br>");
                    out.println(dia_2.get(i).getDescripcion());
                    out.println("<br><br>");
                    out.println(dia_2.get(i).getEjemplo());
                    out.println("<br><br>");
                }
                out.println("<b class=\"azul\">Día 3</b>");
                out.println("<br><br>");
                for(int i=0;i<3;i++){
                    out.println("<b>"+(i+1)+". "+dia_3.get(i).getNombreEjercicio()+"</b>");
                    out.println("<br><br>");
                    out.println(dia_3.get(i).getDescripcion());
                    out.println("<br><br>");
                    out.println(dia_3.get(i).getEjemplo());
                    out.println("<br><br>");
                }
            }
            else{
                out.println("<b class=\"azul\">Día 1</b>");
                out.println("<br><br>");
                for(int i=0;i<3;i++){
                    out.println("<b>"+(i+1)+". "+dia_1.get(i).getNombreEjercicio()+"</b>");
                    out.println("<br><br>");
                    out.println(dia_1.get(i).getDescripcion());
                    out.println("<br><br>");
                    out.println(dia_1.get(i).getEjemplo());
                    out.println("<br><br>");
                }
                out.println("<b class=\"azul\">Día 2</b>");
                out.println("<br><br>");
                for(int i=0;i<3;i++){
                    out.println("<b>"+(i+1)+". "+dia_2.get(i).getNombreEjercicio()+"</b>");
                    out.println("<br><br>");
                    out.println(dia_2.get(i).getDescripcion());
                    out.println("<br><br>");
                    out.println(dia_2.get(i).getEjemplo());
                    out.println("<br><br>");
                }
                out.println("<b class=\"azul\">Día 3</b>");
                out.println("<br><br>");
                for(int i=0;i<3;i++){
                    out.println("<b>"+(i+1)+". "+dia_3.get(i).getNombreEjercicio()+"</b>");
                    out.println("<br><br>");
                    out.println(dia_3.get(i).getDescripcion());
                    out.println("<br><br>");
                    out.println(dia_3.get(i).getEjemplo());
                    out.println("<br><br>");
                }
                out.println("<b class=\"azul\">Día 4</b>");
                out.println("<br><br>");
                for(int i=0;i<3;i++){
                    out.println("<b>"+(i+1)+". "+dia_1.get(i).getNombreEjercicio()+"</b>");
                    out.println("<br><br>");
                    out.println(dia_1.get(i).getDescripcion());
                    out.println("<br><br>");
                    out.println(dia_1.get(i).getEjemplo());
                    out.println("<br><br>");
                }
                out.println("<b class=\"azul\">Día 5</b>");
                out.println("<br><br>");
                for(int i=0;i<3;i++){
                    out.println("<b>"+(i+1)+". "+dia_2.get(i).getNombreEjercicio()+"</b>");
                    out.println("<br><br>");
                    out.println(dia_2.get(i).getDescripcion());
                    out.println("<br><br>");
                    out.println(dia_2.get(i).getEjemplo());
                    out.println("<br><br>");
                }
            }
            out.println("<b>Repeticiones:</b>&nbsp;"+e.getRepeticiones());
            out.println("<br><br>");
            out.println("<b>Series:</b>&nbsp;"+e.getSeries());
            out.println("</div>");
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

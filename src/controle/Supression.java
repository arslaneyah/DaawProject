package controle;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modele.GestionVoiture;

/**
 * Servlet implementation class Supression
 */
@WebServlet("/Supression")
public class Supression extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Supression() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String mat=request.getParameter("mat");
		RequestDispatcher disp ;
		if(request.getSession().getAttribute("user").equals(null)){
			disp=request.getRequestDispatcher("Authentification.html");
			disp.forward(request, response);
			
		}else{
		if(mat.equals("")){
			PrintWriter out=response.getWriter() ;
			out.println("<script type=\"text/javascript\")>");
			out.println("alert('matricule erroné ou inexistant !');"+"window.location.href='/LocationVoiture/Supression.jsp';");
			out.println("</script>");
	}else{
		PrintWriter out=response.getWriter() ;
		out.println("<script type=\"text/javascript\")>");
		out.println("alert('voiture supprimer !');"+"window.location.href='/LocationVoiture/MenuGestionnaire.jsp';");
		out.println("</script>");
	}
	
		
	}	

}}

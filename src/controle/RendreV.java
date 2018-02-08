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
 * Servlet implementation class RendreV
 */
@WebServlet("/RendreV")
public class RendreV extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RendreV() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher disp ; int mat ;
		if(request.getSession().getAttribute("user").equals("")){
			disp=request.getRequestDispatcher("/Authentification.html");
			
		}else{
			mat=Integer.parseInt(request.getParameter("mat"));
			if(GestionVoiture.rendreV(mat)){
				PrintWriter out=response.getWriter() ;
				out.println("<script type=\"text/javascript\")>");
				out.println("alert('Voiture Rendu avec succés !');"+"window.location.href='/LocationVoiture/MenuGestionnaire.jsp';");
				out.println("</script>");
			}
			else 	{			PrintWriter out=response.getWriter() ;
			out.println("<script type=\"text/javascript\")>");
			out.println("alert('Voiture non trouvé !');"+"window.location.href='/LocationVoiture/RechercherVoiture.jsp';");
			out.println("</script>");}
		}
	}

}

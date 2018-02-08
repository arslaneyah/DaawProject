package controle;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import modele.GestionVoiture;
import modele.Voiture;

/**
 * Servlet implementation class RechVoiture
 */
@WebServlet("/RechVoiture")
public class RechVoiture extends HttpServlet {
	public static Voiture x ;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RechVoiture() {
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
		// TODO Auto-generated method stub
		int matr ;
		RequestDispatcher disp ;
		if(request.getSession().getAttribute("user").equals(null)){
			disp=request.getRequestDispatcher("/AuthClient");
			disp.forward(request, response);	
		}else{
		matr=Integer.parseInt(request.getParameter("matrech"));
		ArrayList<Voiture> v=GestionVoiture.rechercher(matr);
		x=v.get(0);
		if(x.getmarque().equals(null)){
			PrintWriter out=response.getWriter() ;
			out.println("<script type=\"text/javascript\")>");
			out.println("alert('Voiture Introuvable !');"+"window.location.href='/LocationVoiture/RechercherVoiture.jsp';");
			out.println("</script>");}
		else {
			request.getSession().setAttribute("rst", x);
			disp=request.getRequestDispatcher("/AfficheV.jsp");
			disp.forward(request, response);
		}
		}
		
	
		
		
	}


}

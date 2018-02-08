package controle;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modele.GestionVoiture;
import modele.Voiture;

/**
 * Servlet implementation class AfficherListe
 */
@WebServlet("/AfficherListe")
public class AfficherListe extends HttpServlet {
	 
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AfficherListe() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher disp ;
		
	/*	ArrayList<Voiture> v = new ArrayList<Voiture>();
		for(int i=0;i<GestionVoiture.Affichertt().size();i++){
			v.add(GestionVoiture.Affichertt().get(i));
		}*/
		
		Voiture x=GestionVoiture.Affichertt().get(0);
		if (request.getSession().getAttribute("user").equals(null)){

			disp=request.getRequestDispatcher("AuthClient.html");
			disp.forward(request, response);
		}else {
		if(x.getmarque().equals(null)){
			
			PrintWriter out=response.getWriter() ;
			out.println("<script type=\"text/javascript\")>");
			out.println("alert('Aucune Voiture , Liste Vide "+"');"+"window.location.href='/LocationVoiture/EspaceClient.jsp';");
			out.println("</script>");
			}
		else{
			disp=request.getRequestDispatcher("/AfficheL.jsp");
	//	request.getSession().setAttribute("lst", v);
			
		disp.forward(request, response);}
		// TODO Auto-generated method stub
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		
}}
	
		
		
	




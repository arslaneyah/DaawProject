package controle;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modele.Client;
import modele.GestionClient;
import modele.GestionVoiture;
import modele.Voiture;

/**
 * Servlet implementation class InscriptionServlet
 */
@WebServlet("/InscriptionServlet")
public class InscriptionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InscriptionServlet() {
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
		
		String id= request.getParameter("id");
		String nom=request.getParameter("nom");
		String prenom=request.getParameter("prenom");
		String tel=request.getParameter("num");
		String mdp=request.getParameter("mdp");
		
		RequestDispatcher disp ;
		
		
		if(id.equals("")|| nom.equals("")||prenom.equals("")||tel.equals("")|| mdp.equals("")){
		
			PrintWriter out=response.getWriter() ;
			out.println("<script type=\"text/javascript\")>");
			out.println("alert('Champs Vides "+"');"+"window.location.href='/LocationVoiture/inscriptionclient.html';");
			out.println("</script>");
	}
		else {
			int telf= Integer.parseInt(tel);
			
			Client c =new Client(id,nom,prenom,telf,mdp); 
			if(GestionClient.insclient(c)==0){
				PrintWriter out=response.getWriter() ;
				out.println("<script type=\"text/javascript\")>");
				out.println("alert('Nom D'utilisateur non Disponibles "+"');"+"window.location.href='/LocationVoiture/inscriptionclient.html';");
				out.println("</script>");
			}
			else {request.getSession().setAttribute("user", id);
				disp= request.getRequestDispatcher("EspaceClient.jsp");
		
		
		disp.include(request, response);}}
		 }} 



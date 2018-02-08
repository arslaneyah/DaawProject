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
import modele.Voiture;

/**
 * Servlet implementation class InsertionServlet
 */
@WebServlet("/InsertionServlet")
public class InsertionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertionServlet() {
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
		
		String model= request.getParameter("model");
		String mat=request.getParameter("mat");
		String marque=request.getParameter("marque");
		String tarif=request.getParameter("tarif");
		String etat=request.getParameter("etat");
		
		RequestDispatcher disp ;
		if (request.getSession().getAttribute("user")!=null){
		
		if(model.equals("")|| mat.equals("")||marque.equals("")||tarif.equals("")|| etat.equals("")){
		
			PrintWriter out=response.getWriter() ;
			out.println("<script type=\"text/javascript\")>");
			out.println("alert('Champs Vides "+"');"+"window.location.href='/LocationVoiture/insertion.jsp';");
			out.println("</script>");
	}
		else {
			int matr= Integer.parseInt(mat);
			float trf=Float.parseFloat(tarif);
			Voiture v =new Voiture(matr,marque,model,trf,etat); 
			if(GestionVoiture.insvoiture(v)==0){
				PrintWriter out=response.getWriter() ;
				out.println("<script type=\"text/javascript\")>");
				out.println("alert('Voiture existe déja ! "+"');"+"window.location.href='/LocationVoiture/insertion.jsp';");
				out.println("</script>");
			}else{
			
				PrintWriter out=response.getWriter() ;
				out.println("<script type=\"text/javascript\")>");
				out.println("alert('Insertion Réussi ! "+"');"+"window.location.href='/LocationVoiture/MenuGestionnaire.jsp';");
				out.println("</script>");
		}}
		}else{ disp=request.getRequestDispatcher("Authentification.html");disp.include(request, response);}
		
	}

}

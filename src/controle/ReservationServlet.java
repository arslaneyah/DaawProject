package controle;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.LocalDate;
import modele.GestionVoiture;

/**
 * Servlet implementation class ReservationServlet
 */
@WebServlet("/ReservationServlet")
public class ReservationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReservationServlet() {
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
		String mat,r,re;int matr ;LocalDate res , ret ; String idc ; 
		idc=request.getSession().getAttribute("user").toString(); 
		mat=request.getParameter("mat");
		r=request.getParameter("dres");
		re=request.getParameter("dret");
		if(mat.equals("")||r.equals("")||re.equals("")){
			
			PrintWriter out=response.getWriter() ;
			out.println("<script type=\"text/javascript\")>");
			out.println("alert('Champs Vides "+"');"+"window.location.href='/LocationVoiture/Reservation.jsp';");
			out.println("</script>");
	}
		else {
		
	
		matr=Integer.parseInt(request.getParameter("mat"));
		res=LocalDate.parse(request.getParameter("dres"));
		ret=LocalDate.parse(request.getParameter("dret"));
		RequestDispatcher disp ;
		if(idc.equals(null)){
			disp=request.getRequestDispatcher("AuthClient.html");
			disp.forward(request, response);
			
		}else{
			
			if(GestionVoiture.reserver(matr, res, ret, idc)){
				PrintWriter out=response.getWriter() ;
				out.println("<script type=\"text/javascript\")>");
				out.println("alert('Voiture Resérvé avec succés !');"+"window.location.href='/LocationVoiture/EspaceClient.jsp';");
				out.println("</script>");
				}
			else 		{		PrintWriter out=response.getWriter() ;
			out.println("<script type=\"text/javascript\")>");
			out.println("alert('Voiture deja Resérvé ou inexistante veuillez recommencer !');"+"window.location.href='/LocationVoiture/Reservation.jsp';");
			out.println("</script>");}
				
		}
		
		
		}
	}}


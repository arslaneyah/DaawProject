package controle;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String user= request.getParameter("user");
		String pass= request.getParameter("pass")	;
		RequestDispatcher disp ;
		boolean create ;
		
		if(user.equals("gestionnaire")& pass.equals("1234")){
			create= true ;
		HttpSession session= request.getSession(create);
		session.setAttribute("user", "gestionnaire");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter() ;
		out.println("<script type=\"text/javascript\")>");
		out.println("alert('Bienvenue "+user+"');"+"window.location.href='/LocationVoiture/MenuGestionnaire.jsp';");
		out.println("</script>");	
		}
		
		else {
			response.setContentType("text/html");
			PrintWriter out=response.getWriter() ;
			out.println("<script type=\"text/javascript\")>");
			out.println("alert('champs vides ou erronés !');"+"window.location.href='/LocationVoiture/Authentification.html';");
			out.println("</script>");
			
		}
		
	}

}

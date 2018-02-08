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

import modele.GestionClient;

/**
 * Servlet implementation class LoginClient
 */
@WebServlet("/LoginClient")
public class LoginClient extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginClient() {
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
		String n=GestionClient.rechercher(user).getid();
		String m=GestionClient.rechercher(user).getmdp();
		
		
		if(user.equals(n)& pass.equals(m)){
			create= true ;
		HttpSession session= request.getSession(create);
		session.setAttribute("user", user);
			disp= request.getRequestDispatcher("EspaceClient.jsp");	
			disp.forward(request, response);
		}
		
		else {
			response.setContentType("text/html");
			PrintWriter out=response.getWriter() ;
			out.println("<script type=\"text/javascript\")>");
			out.println("alert('id ou mot de passe erroné !');"+"window.location.href='/LocationVoiture/AuthClient.html';");
			out.println("</script>");
			
		}
		
	}
	}



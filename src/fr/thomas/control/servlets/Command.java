package fr.thomas.control.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.thomas.control.utils.MatchUtils;
import fr.thomas.control.utils.PlayerUtils;

/**
 * Servlet implementation class Command
 */
@WebServlet("/command")
public class Command extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Command() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("testDestination.html");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = PlayerUtils.reuse(request);
		if("-1".compareTo(id)==0){
			return ;
		}
		if(!MatchUtils.isInMatch(id)){
			return ;
		}
		if(!PlayerUtils.playerMustPlay(id)){
			return ;
		}
		String responseText=MatchUtils.newOrder(id,request.getParameter("DESTINATION"));
		response.getOutputStream().println(responseText)	;
		
	}

}

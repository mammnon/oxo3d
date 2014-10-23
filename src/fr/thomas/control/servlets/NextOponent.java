package fr.thomas.control.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.thomas.control.bo.Player;
import fr.thomas.control.utils.OponentChoiceUtils;
import fr.thomas.control.utils.PlayerUtils;

/**
 * Servlet implementation class NextOponent
 */
@WebServlet("/NextOponent")
public class NextOponent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NextOponent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = PlayerUtils.reuseOrCreateCookie(request, response);
		Player lOponent=OponentChoiceUtils.nextOponent(id,(String)request.getParameter("oponentID"));
		if(lOponent!=null){
			response.getOutputStream().print(lOponent.getId()+"|");
			response.getOutputStream().print(lOponent.getName()+"|");
			response.getOutputStream().print(lOponent.getLevel()+"|");
			response.getOutputStream().print(lOponent.getNb_win()+"|");
			response.getOutputStream().print(lOponent.getUrl_avatar()+"|");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = PlayerUtils.reuseOrCreateCookie(request, response);
		Player lOponent=OponentChoiceUtils.nextOponent(id,(String)request.getParameter("oponentID"));
		System.err.println("Attente next oponent");
		if(lOponent!=null){
			response.getOutputStream().print(lOponent.getId()+"|");
			response.getOutputStream().print(lOponent.getName()+"|");
			response.getOutputStream().print(lOponent.getLevel()+"|");
			response.getOutputStream().print(lOponent.getNb_win()+"|");
			response.getOutputStream().print(lOponent.getUrl_avatar()+"|");
		}
		
	}

}

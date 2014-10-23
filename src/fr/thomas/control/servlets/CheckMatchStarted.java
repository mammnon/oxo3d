package fr.thomas.control.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.thomas.control.bo.Player;
import fr.thomas.control.utils.MatchUtils;
import fr.thomas.control.utils.PlayerUtils;

/**
 * Servlet implementation class CheckMatchStarted
 */
@WebServlet("/CheckMatchStarted")
public class CheckMatchStarted extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckMatchStarted() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = PlayerUtils.reuseOrCreateCookie(request, response);
		String id_Opononent=MatchUtils.getOponent(id);
		if("".compareTo(id_Opononent)!=0){
			Player lOponent=PlayerUtils.getPlayer(id_Opononent);
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
		String id_Opononent=MatchUtils.getOponent(id);
		if("".compareTo(id_Opononent)!=0){
			System.err.println("Un match est deja demarre!!!");
			Player lOponent=PlayerUtils.getPlayer(id_Opononent);
			response.getOutputStream().print(lOponent.getId()+"|");
			response.getOutputStream().print(lOponent.getName()+"|");
			response.getOutputStream().print(lOponent.getLevel()+"|");
			response.getOutputStream().print(lOponent.getNb_win()+"|");
			response.getOutputStream().print(lOponent.getUrl_avatar()+"|");

		}
		
		
	}

}

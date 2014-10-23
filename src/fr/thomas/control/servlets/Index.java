package fr.thomas.control.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.thomas.control.utils.MatchUtils;
import fr.thomas.control.utils.PlayerUtils;

/**
 * Servlet implementation class Index
 */
@WebServlet("/retrieve")
public class Index extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void init() {
	

	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Index() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public void updateResponse(HttpServletRequest request,
			HttpServletResponse response) throws IOException {

		String id = PlayerUtils.reuseOrCreateCookie(request, response);
	//	PlayerUtils.connectToMatch(id);
		if(!MatchUtils.isInMatch(id)){    //Player waiting oponents
			response.getOutputStream().print("0");
		}else if(PlayerUtils.playerWon(id)) { //Match over, player won
		response.getOutputStream().print("1");
		}else if(PlayerUtils.playerLost(id)) { //Match over, player lost
		response.getOutputStream().print("2");
		}else if(!PlayerUtils.playerMustPlay(id)){ //Player waiting opponent to play
			response.getOutputStream().print("3");
		}
		else{  //player must play  + lastMove to display
			response.getOutputStream().print("4|");
			response.getOutputStream().print(MatchUtils.getLastOrder(id));
		}
		response.getOutputStream().println("|");
		//response.getOutputStream().println(playerMustPlay(id)+"|");
		//response.getOutputStream().println("2|plot4DCylinder");

	}

	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		updateResponse(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		updateResponse(request, response);

	}

}

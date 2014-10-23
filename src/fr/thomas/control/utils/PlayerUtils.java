package fr.thomas.control.utils;

import java.util.Calendar;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.thomas.control.bo.Match;
import fr.thomas.control.bo.Player;

public class PlayerUtils {

	
	
	private static String createID() {
		String id = "";
		String tryID="";
		while (id.compareTo("") == 0) {
			tryID = "" + Calendar.getInstance().getTimeInMillis();
			if(CacheUtils.getPlayer(tryID)==null){
				id=tryID;
			}

		}
		return id;
	}

	public static String reuse(HttpServletRequest request) {
		Cookie[] cookies = request.getCookies();
		String id = "-1";
		try {
			for (int i = 0; i < cookies.length; i++) {
				Cookie _cookie = cookies[i];

				if (_cookie.getName().equals("id")) {
					id = _cookie.getValue();
					// System.err.println("Already Exising ==>" + id);
				}
			}
		} catch (Exception e) {
			System.err.println("Cooky retrival error");
		}

		return id;

	}

	public static String reuseOrCreateCookie(HttpServletRequest request,
			HttpServletResponse response) {
		String id = reuse(request);
		
		if ("-1".compareTo(id) == 0) {
			id = createID();
			Cookie C = new Cookie("id", id);
			C.setMaxAge(24 * 3600);
			response.addCookie(C);

		}

		CacheUtils.addPlayer(id);
			
	

		return id;

	}

	

	public static boolean playerMustPlay(String id) {
		return id.compareTo(MatchUtils.getMatch(id).getPlayerToPlay()) == 0;
	}
	public static boolean playerWon(String id) {
		Match m=MatchUtils.getMatch(id);
		if(m==null)
			return false;
		return m.isMatchOver() && m.isWinner(id);
	}

	public static boolean playerLost(String id) {
		Match m=MatchUtils.getMatch(id);
		if(m==null)
			return false;
		return m.isMatchOver() && !m.isWinner(id);
	}
	public static Player getPlayer(String idPlayer) {
		return CacheUtils.getPlayer(idPlayer);
	}

	

	

	
}

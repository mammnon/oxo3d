package fr.thomas.control.utils;

import fr.thomas.control.bo.Match;

public class MatchUtils {
	
	
	public static void createMatch(String id1, String id2) {
		Match m = new Match(id1, id2);
		 CacheUtils.addMatch(m);

		System.err.println("CreateMatch--> " + id1 + "    vs   " + id2);
	}


	public static boolean isInMatch(String id) {
		Match m = getMatch(id);
		if (m == null)
			return false;
		if (!m.isStillAlive()) {
			CacheUtils.removeMatch(m);
			
			return false;
		}

		return true;
	}
	public static String getOponent(String id){
		String result="";
		if(isInMatch(id)){
			Match m=CacheUtils.getMatch(id);
			result=m.getId1();
			if(result.compareTo(id)==0)
				result=m.getId2();
		}
		return result;
	}
	public static Match getMatch(String id) {
	
		return (Match) CacheUtils.getMatch(id);
	}
	
	public static String newOrder(String id, String destination) {
		Match m = getMatch(id);
		if (m == null)
			return "-1";
		String lResult=m.setLastMove(id, destination);
		CacheUtils.updateMatch(m);
		return lResult;

	}
	
	


	public static String getLastOrder(String id) {
		return getMatch(id).getLastMove();
	}
}

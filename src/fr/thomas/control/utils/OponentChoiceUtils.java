package fr.thomas.control.utils;

import java.util.GregorianCalendar;
import java.util.List;

import fr.thomas.control.bo.MyTuple;
import fr.thomas.control.bo.Player;

public class OponentChoiceUtils {


	public static void createInvitationEntry(String id, String id2) {
		MyTuple lTupleFound = null;
		// looking in the invitation map the first tuple(oldest)
		lTupleFound=CacheUtils.getInvitation(id,id2);
		
		if (lTupleFound != null) {
			CacheUtils.removeInvitation(lTupleFound);
			MatchUtils.createMatch(id, id2);
			System.err.println("Creation de match");

		} else if (null != id && null != id2) {
			System.err.println("Creation de tuple"+id+"/"+id2);
			CacheUtils.addInvitation(new MyTuple(id, id2));
		}

	}

	public static void blacklist(String id, String id2) {
		MyTuple lTupleFound = null;
		do{ //supprimer toutes les invitations concernant les 2
		lTupleFound = CacheUtils.getInvitation(id,id2);
		CacheUtils.removeInvitation(lTupleFound);
		}while(lTupleFound!=null);
		
	
		CacheUtils.addBlacklist(new MyTuple(id, id2));
	}



	public static Player nextOponent(String id, String parameter) {
		long now = GregorianCalendar.getInstance().getTimeInMillis();
		//add yourself in the waiting list/Update your "now"
		CacheUtils.addWaitingPlayer(id, now);
		
		//First remove all old users
		List<String> lAllKeys = CacheUtils.getAllPlayerWaiting();
		for (int i = 0; i < lAllKeys.size(); i++) {
			String lIdCurrent = lAllKeys.get(i);
			long lastUpdate= CacheUtils.getTimePlayerWait(lIdCurrent);
			if (now - lastUpdate > 60000) { //Joueur en attente trop vieux
				System.err.println("Joueur trop vieux" + lIdCurrent + "Last"+lastUpdate + "  ///"+now);
				CacheUtils.removeWaitingPlayer(lIdCurrent); //on le supprime de la liste
				//List<MyTuple> lListOfTupleToRemove=new ArrayList<>();
				CacheUtils.removeInvitation(lIdCurrent);//on supprime toutes les invits le concernant
				
			}
		}
		
		
		
		String found_id = "";
		// first looking in the invitation map the first tuple(oldest)
		MyTuple lInvitationReceived = CacheUtils.getInvitation(id);
		if (lInvitationReceived != null) { // if found sent it
			CacheUtils.removeWaitingPlayer(id);
			CacheUtils.removeWaitingPlayer(lInvitationReceived.origin);
			CacheUtils.removeInvitation(lInvitationReceived); //
			found_id = lInvitationReceived.origin;

		} else {
			// looking in the waiting list (not yourself)
			lAllKeys =CacheUtils.getAllPlayerWaiting();
			for (int i = 0; i < lAllKeys.size() && "".compareTo(found_id) == 0; i++) {
				String lIdCurrent = lAllKeys.get(i);
				if (lIdCurrent.compareTo(id) != 0) {
					found_id = lIdCurrent;
					System.err.println("trouve"+found_id);
					// Check not blacklisted
					List<MyTuple> lAllBlacklistTuple=CacheUtils.getBlacklistList();
					for (int j = 0; j < lAllBlacklistTuple.size()
							&& "".compareTo(found_id) != 0; j++) {
						MyTuple lTuple = lAllBlacklistTuple.get(j);
						if (lTuple.match(id, found_id)) {
							found_id = "";
							System.err.println("deja blackliste");
						}
					}
					
					// Check not already invited
					boolean lAlreadyIvited=CacheUtils.hasAlreadyInvited(id,found_id);
					if(lAlreadyIvited){
							found_id = "";
							System.err.println("deja invite");
				
					}
						
					
					
				}
			}
		}

		return PlayerUtils.getPlayer(found_id);

	}

}

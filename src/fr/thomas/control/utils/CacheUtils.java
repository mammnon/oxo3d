package fr.thomas.control.utils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.ibm.json.java.JSONObject;
import com.ibm.websphere.objectgrid.ObjectGrid;
import com.ibm.websphere.objectgrid.ObjectGridException;
import com.ibm.websphere.objectgrid.ObjectMap;
import com.ibm.websphere.objectgrid.Session;
import com.ibm.websphere.objectgrid.UndefinedMapException;

import fr.thomas.control.bo.Match;
import fr.thomas.control.bo.MyTuple;
import fr.thomas.control.bo.Player;

public class CacheUtils {

	// define session instance of ObjectGrid 
	private static Session ogSession;
	private static InitialContext ic;
	private static final String WAITING = "waiting.NONE.P";
	private static final String WAITING_IDS = "waiting_id.NONE.P";
	private static final String MATCH = "match.NONE.P";
	private static final String INVITATION = "invitation.NONE.P";
	// private static final String INVITATIONS_MAX="waiting_id.NONE.P";
	private static final String BLACKLIST = "blacklist.NONE.P";
	private static final String PLAYER = "player.NONE.P";
	private static final String MAX_VALUES = "max_values.NONE.P";
	private static final String MAX_WAITING = "MAX_WAITING";

	public static void init() {

		// There are two ways of obtaining the connection information for some
		// services in Java

		// Method 1: Auto-configuration and JNDI
		// The Liberty buildpack automatically generates server.xml
		// configuration
		// stanzas for the DataCache service which contain the credentials
		// needed to
		// connect to the service. The buildpack generates a JNDI name following
		// the convention of "wxs/<service_name>" where the <service_name> is
		// the
		// name of the bound service. Then a JNDI lookup is all that is needed
		// to
		// obtain an ObjectGrid instance as shown below. Note that the service
		// name
		// for this boilerplate also contains the application name but in
		// general
		// that is not required.
		try {
				if (ic == null) {
					
				ic = new InitialContext();
				}
				// Default service instance name is "<appname>:DataCache"
				ObjectGrid og = (ObjectGrid) ic.lookup("wxs/" + getAppName()
						+ ":DataCache");
				ogSession = og.getSession();
			/*	ogSession.getMap(WAITING).clear();
				ogSession.getMap(WAITING_IDS).clear();
				ogSession.getMap(MATCH).clear();
				ogSession.getMap(INVITATION).clear();
				ogSession.getMap(PLAYER).clear();
				ogSession.getMap(BLACKLIST).clear();
				ogSession.getMap(MAX_VALUES).clear();
				ogSession.getMap(MAX_VALUES).upsert(MAX_WAITING,new Long(0));*/
				/*
				 * ObjectMap map =ogSession.getMap(WAITING); map.put(-1,new
				 * Long(0)); map.remove(-1);
				 * 
				 * 
				 * map =ogSession.getMap(WAITING_IDS); map.put(-1,new Long(0));
				 * map.remove(-1); map=ogSession.getMap(MATCH);
				 * map.upsert(-1,new Match("-1","-2")); map.remove(-1);
				 * map=ogSession.getMap(PLAYER); map.upsert(-1,new
				 * Player("-1")); map.remove(-1); map =
				 * ogSession.getMap(INVITATION); map.upsert("-1", new
				 * MyTuple("-1","-2")); map.remove("-1"); map =
				 * ogSession.getMap(BLACKLIST); map.upsert("-1", new
				 * MyTuple("-1","-2")); map.remove("-1");
				 * 
				 * 
				 * 
				 * map =ogSession.getMap(MAX_VALUES);
				 * //map.upsert(MAX_WAITING,new Long(0));
				 */

			

		} catch (NamingException e) {
			System.out
					.println("Failed to find cache configuration in server.xml!");
			e.printStackTrace();
		} catch (ObjectGridException e) {
			System.out.println("Failed to connect to grid!");
			e.printStackTrace();
		}
	}

	private static String getAppName() {

		String app = System.getenv("VCAP_APPLICATION");
		if (app == null) {
			System.out.println("No VCAP_APPLICATION found");
		} else {
			try {
				JSONObject obj = JSONObject.parse(app);
				String name = (String) obj.get("application_name");
				if (name == null) {
					System.out
							.println("VCAP_APPLICATION application_name not set");
				} else {
					return name;
				}
			} catch (IOException e) {
				System.out
						.println("Failed to parse VCAP_APPLICATION for application_name");
			}
		}
		return null;
	}

	public static void addMatch(Match match) {
		init();
		try {
			ObjectMap map = ogSession.getMap(MATCH);
			map.upsert(match.getId1(), match);
			map.upsert(match.getId2(), match);

		} catch (ObjectGridException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public static void updateMatch(Match match) {
		init();
		try {
			ObjectMap map = ogSession.getMap(MATCH);
			map.upsert(match.getId1(), match);
			map.upsert(match.getId2(), match);

		} catch (ObjectGridException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

	public static void removeMatch(Match match) {
		init();
		try {
			ObjectMap map = ogSession.getMap(MATCH);
			map.remove(match.getId1());
			map.remove(match.getId2());

		} catch (ObjectGridException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static Match getMatch(String id) {
		init();
		Match lResult = null;
		try {
			ObjectMap map = ogSession.getMap(MATCH);
			lResult = (Match) map.get(id);

		} catch (ObjectGridException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lResult;
	}

	public static void addPlayer(String id) {
		init();
		try {
			ObjectMap map = ogSession.getMap(PLAYER);
			if (map.get(id) == null || !(map.get(id) instanceof Player))
				map.upsert(id, new Player(id));

		} catch (ObjectGridException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static Player getPlayer(String id) {
		init();
		Player lResult = null;
		try {
			ObjectMap map = ogSession.getMap(PLAYER);
			lResult = (Player) map.get(id);

		} catch (ObjectGridException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lResult;
	}

	public static int getInvitationListSize() {
		init();
		int lResult = 0;
		try {
			ObjectMap map = ogSession.getMap(INVITATION);
			lResult = map.getJavaMap().size();

		} catch (ObjectGridException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lResult;

	}

	/*
	 * @SuppressWarnings("unchecked") public static List<MyTuple>
	 * getInvitationList() { init(); List<MyTuple> lResult=new
	 * ArrayList<MyTuple>(); try { ObjectMap map=ogSession.getMap(INVITATION);
	 * Set<?> lList=map.getJavaMap(). getJavaMap().keySet();
	 * 
	 * for(Object o:lList){ Object v=map.get(o); if(v instanceof MyTuple){
	 * lResult.add(new MyTuple((MyTuple) o)); } }
	 * 
	 * 
	 * } catch (ObjectGridException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); }
	 * 
	 * 
	 * return lResult; }
	 */
	public static MyTuple getInvitation(String id) {
		MyTuple lResult = null;
		init();
		try {
			ObjectMap map = ogSession.getMap(INVITATION);
			int i = 0;
			do {

				map.get(id + "_" + i);
				i++;
			} while (lResult == null && i < 5);
		} catch (ObjectGridException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lResult;
	}

	public static MyTuple getInvitation(String id, String id2) {
		MyTuple lResult = null;
		try {
			ObjectMap map = ogSession.getMap(INVITATION);
			Object lTempResult = map.get(id + "/" + id2);
			if (lTempResult == null) {
				lTempResult = map.get(id2 + "/" + id);
			}
			if (lTempResult != null && lTempResult instanceof MyTuple) {
				lResult = (MyTuple) lTempResult;
			}

		} catch (ObjectGridException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lResult;
	}

	public static void removeInvitation(MyTuple myTuple) {
		init();
		try {
			ObjectMap map = ogSession.getMap(INVITATION);
			map.remove(myTuple.origin + "/" + myTuple.dest);
			int i = 0;
			while (getInvitation(myTuple.dest + "_" + i) != null
					&& getInvitation(myTuple.dest + "_" + i) != myTuple) {
				i++;
				System.err.println("remove Invitation MyTuple" + i);
			}
			map.remove(myTuple.dest + "_" + i);
		} catch (ObjectGridException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void removeInvitation(String id) {
		init();
		try {
			ObjectMap map = ogSession.getMap(INVITATION);
			for(int i = 0;i<50;i++){
				Object lObject=getInvitation(id + "_" + i);
				if(lObject!=null && lObject instanceof MyTuple){
					map.remove(((MyTuple)lObject).origin + "/"
							+ ((MyTuple)lObject).dest);
					map.remove(((MyTuple)lObject).dest);
					
				}
			}

		} catch (ObjectGridException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void addInvitation(MyTuple myTuple) {
			init();
			ObjectMap map;
			try {
				map = ogSession.getMap(INVITATION);
				if(myTuple.origin.compareTo(myTuple.dest)!=0){
					map.upsert(myTuple.origin+"/"+myTuple.dest, myTuple);
					int i=0;
		
					while(getInvitation(myTuple.dest+"_"+i)!=null ){
						i++;
					}
					map.upsert(myTuple.dest+"_"+ i, myTuple);
				}
				
			} catch (UndefinedMapException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ObjectGridException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	public static boolean hasAlreadyInvited(String id, String found_id) {
		init();
		boolean lResult = false;
		
		try {
			ObjectMap map = ogSession.getMap(INVITATION);
			Object lFound = map.get(id + "/" + found_id);
			lResult = lFound != null && lFound instanceof MyTuple;
		} catch (UndefinedMapException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ObjectGridException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return lResult;
	}

	public static void addBlacklist(MyTuple myTuple) {
		init();
		ObjectMap map;
		try {
			map = ogSession.getMap(BLACKLIST);
			map.upsert(myTuple.origin + "/" + myTuple.dest, myTuple);
		} catch (UndefinedMapException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ObjectGridException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static List<MyTuple> getBlacklistList() {

		init();
		List<MyTuple> lResult = new ArrayList<MyTuple>();
		try {
			ObjectMap map = ogSession.getMap(BLACKLIST);
			Object lObject = map.getNextKey(100);
			while (lObject != null && lObject instanceof String) {
				lResult.add((MyTuple) map.get(lObject));
				lObject = map.getNextKey(100);
				System.err.println("Nouvelle key blacklist lu" + lObject);
			}
		} catch (ObjectGridException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lResult;

	}

	public static void addWaitingPlayer(String id, long now) {
		init();
		ObjectMap map;
		try {
			map = ogSession.getMap(MAX_VALUES);
			long max=-1;
			if(map.get(MAX_WAITING) !=null)
				max = ((Long) map.get(MAX_WAITING)).longValue();

			map = ogSession.getMap(WAITING);
			int i = 0;
			if (map.containsKey(id) )
				i = -1;

			map.upsert(id, new Long(now));

			map = ogSession.getMap(WAITING_IDS);
			while (i >= 0) {
				i++;
				if (!map.containsKey(i)) {
					map.upsert(i, id);
					if (i > max) {
						map = ogSession.getMap(MAX_VALUES);
						map.upsert(MAX_WAITING, new Long(i));
					}
					i = -1;
				}

			}
		} catch (UndefinedMapException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ObjectGridException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void removeWaitingPlayer(String id) {
		init();
		ObjectMap map;
		try {
			map = ogSession.getMap(MAX_VALUES);
			long max = ((Long) map.get(MAX_WAITING)).longValue();
			map = ogSession.getMap(WAITING);
			map.remove(id);
			map = ogSession.getMap(WAITING_IDS);

			for (int i = 0; i < max + 1; i++) {
				if (map.get(i) != null
						&& id.compareTo((String) map.get(i)) == 0) {
					map.remove(i);
					i = (int) (max + 2);
				}

			}
		} catch (UndefinedMapException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ObjectGridException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static List<String> getAllPlayerWaiting() {
		init();
		List<String> lResult = new ArrayList<String>();
		try {
			ObjectMap map = ogSession.getMap(MAX_VALUES);
			long max = ((Long) map.get(MAX_WAITING)).longValue();

			map = ogSession.getMap(WAITING_IDS);

			for (int i = 0; i <= max; i++) {
				Object lCurrent = map.get(i);
				if (lCurrent != null && lCurrent instanceof String) {
					lResult.add((String) lCurrent);
					System.err.println("waitin?" + lCurrent);
				}
			}
		} catch (ObjectGridException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lResult;

	}

	public static long getTimePlayerWait(String id) {
		init();
		long lResult = 0;
		try {
			ObjectMap map = ogSession.getMap(WAITING);
			Object temp = map.get(id);
			if (temp != null && temp instanceof Long)
				lResult = ((Long) temp).longValue();
		} catch (ObjectGridException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lResult;

	}

}

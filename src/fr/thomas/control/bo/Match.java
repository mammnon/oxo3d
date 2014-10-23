package fr.thomas.control.bo;

import java.util.GregorianCalendar;

public class Match {
	private String id1;
	private String id2;
	private String playerToPlay;
	private String lastMove = null;
	private World world;
	private String winner;
	private int numPlayer1=1;
	private int numPlayer2=1;
	public long lastActionTime;
	
	
	public Match(String id1, String id2) {
		setId1(id1);
		setId2(id2);
		playerToPlay = id1;
		winner = "";
		world = new World();
		 resetLastActionTime();
	}

	private void resetLastActionTime(){
		lastActionTime=GregorianCalendar.getInstance().getTimeInMillis();
	}
	public boolean isStillAlive(){
		long now=GregorianCalendar.getInstance().getTimeInMillis();
		if(now-lastActionTime>60000){//1 minute
			System.err.println("Match trop vieux");
			return false;
			
		}
		return true;
	}
	public String getId1() {
		return id1;
	}

	public boolean isMatchOver() {
		return "".compareTo(winner) != 0;
	}

	public boolean isWinner(String id) {
		return winner.compareTo(id) == 0;

	}

	public void setId1(String id1) {
		this.id1 = id1;
	}

	public String getId2() {
		return id2;
	}

	public void setId2(String id2) {
		this.id2 = id2;
	}

	public String getPlayerToPlay() {
		return playerToPlay;
	}

	public void setPlayerToPlay(String playerToPlay) {
		this.playerToPlay = playerToPlay;
	}

	public String getLastMove() {
		return lastMove;
	}

	public void checkEnd() {
		// TODO

	}

	public String setLastMove(String id, String lastMove) {
		resetLastActionTime();
		String high = world.addTorus(id, lastMove);
		if ("-1".compareTo(high) != 0) {
			
			if (id1.compareTo(id) == 0) {
				setPlayerToPlay(id2);
				this.lastMove=""+numPlayer1++;
			} else {
				setPlayerToPlay(id1);
				this.lastMove=""+numPlayer2++;
			}
			this.lastMove += "|"+lastMove + "|" + high;
			checkEnd();
			
		}
		return high;
	}

}

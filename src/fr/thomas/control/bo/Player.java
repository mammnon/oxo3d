package fr.thomas.control.bo;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private String id;
	private String name;
	private float level=9f;
	private int nb_win=45;
	private String url_avatar="";
	private List<String> blacklist;
	private final static String DEFAULT_AVATAR="default-avatar.png";
	private String[] randomName = { "Backlash", "Bad Samaritan",
			"Bag O'Bones ", "Ballistic", "Balloon Buster", "Bane",
			"The Banner", "Baron Bedlam", "Baron Blitzkrieg", "Baron Tyrano ",
			"Baron Winter", "Baroness Paula Von Gunther", "Barracuda",
			"Barrage", "Bart Allen", "Batgirl", "Bat-Knight", "Bat Lash",
			"Batman", "Bat-Mite", "Battalion", "Batwoman ", "Batzarro ",
			"Baud", "Baytor", "Beast Boy", "Beefeater", "Beezlebub", "Bekka",
			"Belial", "Belphegor", "Benadict Asp,Beppo", "Bernadeth",
			"Bette Noir ", "Betty Clawman", "Bevarlene", "Bibbo Bibbowski ",
			"Big Barda ", "Big Breeda ", "Big Bear ", "Big Caesar", "Big Shot",
			"Big Sir", "Billie the Millie", "Billy Numerous", "Bird " };

	public Player(String id_cookie) {
		this.id = id_cookie;
		blacklist = new ArrayList<>();
		int lower = 0;
		int higher = randomName.length - 1;
		url_avatar=DEFAULT_AVATAR;
		int random = (int) (Math.random() * (higher - lower)) + lower;
		name=randomName[random];
		System.err.println("Welcome to "+name + "id: "+id_cookie);

	}

	public boolean isIDBlacklisted(String id) {
		return blacklist.contains(id);
	}

	public void blacklistID(String id) {
		blacklist.add(id);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getLevel() {
		return level;
	}

	public void setLevel(float level) {
		this.level = level;
	}

	public int getNb_win() {
		return nb_win;
	}

	public void setNb_win(int nb_win) {
		this.nb_win = nb_win;
	}

	public String getUrl_avatar() {
		return DEFAULT_AVATAR;
	}

	public void setUrl_avatar(String url_avatar) {
		this.url_avatar = url_avatar;
	}

}

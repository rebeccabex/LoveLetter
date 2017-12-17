package rebeccabex.love_letter;

public Card {

	private String role;
	private int rank;

	public class Card(String role, int rank) {
		
		this.role = role;
		this.rank = rank;
		
	}
	
	public int effect(int player) {
		return effect(player, 0);
	}
	
	public int effect(int player, int target) {
		
		int discard = 0;
		
		switch (role) {
			case: "princess":
				princessEffect(player);
			
		}
		
		return discard;
		
	}
	
	public int princessEffect(player) {
		return player;
	}

}




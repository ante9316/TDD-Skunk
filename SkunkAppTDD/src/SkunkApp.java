
public class SkunkApp {
	
	private static int numberOfPlayers=2;
	private String[] playerName = new String[2];
	public static void main(String[] args) {
	

	}

	protected void getPlayerInfo() {
		numberOfPlayers =2;
		playerName[0] ="Player 1";
		playerName[1] ="Player 2";
		
	}

	public int getNumberOfPlayers() {
		// TODO Auto-generated method stub
		return numberOfPlayers;
	}

	public String getPlayerName(int i) {
		// TODO Auto-generated method stub
		return playerName[i-1];
	}

}

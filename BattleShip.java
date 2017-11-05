
public class BattleShip {

	String player1Name = "Player1";
	String player2Name = "Player2";

    
    public static void main(String[] args) {
    	String player1Name = "Player1";
    	String player2Name = "Player2";

    	
    	PlayerData player1Data = new PlayerData(player1Name);
    	PlayerData player2Data = new PlayerData(player2Name);
    	
        PlayerScreen player1 = new PlayerScreen(player1Name, true, player1Data, player2Data);
        PlayerScreen player2 = new PlayerScreen(player2Name, true, player2Data, player1Data);
    }
}
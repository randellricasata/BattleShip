
public class PlayerData{
	private int aGrid[][] = new int [10][10];
	private int sGrid[][] = new int [10][10];
	
	private String name;
	private int numShips = 0;
	private int numSelfSinkShips = 0;
	private int numEnemySinkShips = 0;
	
	public PlayerData(String name) {
		this.name = name;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				aGrid[i][j] = 0;
			}
		}
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				sGrid[i][j] = 0;
			}
		}
	}
	
	public void setNumShips(int x) {
		this.numShips = x;
	}
	
	public void setSelfSinkShips(int x) {
		this.numSelfSinkShips = x;
	}
	
	public void setNumEnemySinkShips(int x) {
		this.numEnemySinkShips = x;
	}
	
	public int getNumShips() {
		return this.numShips;
	}
	
	public int getSelfSinkShips() {
		return this.numSelfSinkShips;
	}
	
	public int getNumEnemySinkShips() {
		return this.numEnemySinkShips;
	}
}
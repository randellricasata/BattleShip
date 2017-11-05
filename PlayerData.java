public class PlayerData{
	private int aGrid[][] = new int [10][10];
	private int sGrid[][] = new int [10][10];
	
	private String name;
	
	int numShips;
	int numSelfSinkShips;
	int numEnemySinkShips;
	
	
	
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
		
		numShips = 0;
		numSelfSinkShips = 0;
		numEnemySinkShips = 0;
		
	}
	
	public int[][] getAGrid(){
		return this.aGrid;
	}
	
	public int[][] getSGrid(){
		return this.sGrid;
	}
	
	public int SGridContent(int i, int j) {
		return sGrid[i][j];
	}
	public void setAGrid (int row, int column, int value) {
		aGrid[row][column] = value;
	}
	
	public void setSGrid (int row, int column, int value) {
		sGrid[row][column] = value;
	}
	
	public void setNumShips(int x) {
		this.numShips = x;
	}
	
	
	public String getName() {
		return this.name;
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
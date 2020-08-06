package Model;

public class Model {
	private static final int initialValue = 0;
	private static final String initialSign = "X";
	private static final String secondSign = "O";
	private int player1;
	private int player2;
	private String winnersSign;
	private String sign;
	private boolean isFinished;
	private String startingSign;
	private String[][]board;
	
	public Model() {
		resetFinishedGame();
		resetPlayersPoints();
		setStartingSign();
		resetSign();
		createEmptyBorad();
		resetWinnersSign();
	}

	public void createEmptyBorad() {
		board=new String[3][3];
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				board[i][j]="";
			}
		}
	}
	public void givePoint() {
		if(winnersSign.equals("X")) {
			player1++;
		}else if(winnersSign.equals("O")) {
			player2++;
		}else {
			
		}
	}
	public boolean isRoundFinished() {
		String s=initialSign;
		for(int x=0; x<2; x++) {
			for(int i=0; i<3; i++) {
				if(board[0][i].equals(s) && board[1][i].equals(s) && board[2][i].equals(s)) {
					this.setWinnersSign(s);
					return true;
				}
				if(board[i][0].equals(s) && board[i][1].equals(s) && board[i][2].equals(s)) {
					this.setWinnersSign(s);
					return true;
				}
			}
			if(board[0][0].equals(s) && board[1][1].equals(s) && board[2][2].equals(s)) {
				this.setWinnersSign(s);
				return true;
			}
			if(board[0][2].equals(s) && board[1][1].equals(s) && board[2][0].equals(s)) {
				this.setWinnersSign(s);
				return true;
			}
			s=secondSign;
		}
		return false;
	}
	
	//resetters
	public void resetWinnersSign() {
		winnersSign="";
	}
	public void resetPlayersPoints() {
		player1=initialValue;
		player2=initialValue;
	}
	public void resetBorad() {
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				board[i][j]="";
			}
		}
	}
	public void resetIsFinished() {
		isFinished=false;
	}
	public void resetSign() {
		sign=startingSign;
	}
	public void resetFinishedGame() {
		isFinished=false;
	}
	
	//setters
	public void setStartingSign() {
		if(startingSign==null || startingSign=="O") {
			startingSign="X";
		}else if(startingSign=="X"){
			startingSign="O";
		}
	}
	public void setFinishedGame() {
		isFinished=true;
	}
	public void setWinnersSign(String s) {
		winnersSign=s;
	}
	public void setBoard(int x, int y) {
		board[x][y]=sign;
	}
	public void setSign() {
		if(sign.equals(initialSign)) {
			sign=secondSign;
		}else {
			sign=initialSign;
		}
	}
	
	//getters
	public String getWinnersSign() {
		return winnersSign;
	}
	public boolean getIsFinished() {
		return isFinished;
	}
	public String getField(int i, int j) {
		return board[i][j];
	}
	public String getSign() {
		return sign;
	}
	public String getPlayer1Points() {
		return Integer.toString(player1);
	}
	public String getPlayer2Points() {
		return Integer.toString(player2);
	}
	public String getInitialSign() {
		return initialSign;
	}
	public String getSecondSign() {
		return secondSign;
	}
}

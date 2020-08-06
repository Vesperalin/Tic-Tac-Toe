package Controller;
import View.*;
import Model.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Controller {
	private Model model;
	private View view; 
	public Controller(Model m, View v) {
		model=m;
		view=v;
		view.add00Listener(new B00Listener());
		view.add01Listener(new B01Listener());
		view.add02Listener(new B02Listener());
		view.add10Listener(new B10Listener());
		view.add11Listener(new B11Listener());
		view.add12Listener(new B12Listener());
		view.add20Listener(new B20Listener());
		view.add21Listener(new B21Listener());
		view.add22Listener(new B22Listener());
		view.addResetRoundListener(new ResetRoundListener());
		view.addNextRoundListener(new NextRoundListener());
		view.addResetGameListener(new ResetGameListener());
	}
	class ResetRoundListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			view.resetBoard();
			model.resetSign();
			model.resetBorad();
		}
	}
	class NextRoundListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			model.givePoint();
			model.resetWinnersSign();
			model.resetBorad();
			model.resetIsFinished();
			model.setStartingSign();
			model.resetSign();
			model.resetFinishedGame();
			view.resetBoard();
			view.setPointsPlayer1(model.getPlayer1Points());
			view.setPointsPlayer2(model.getPlayer2Points());
			if(view.getPlayer1CheckButton()) {
				view.setPlayer1CheckButton(false);
				view.setPlayer2CheckButton(true);
			}else {
				view.setPlayer1CheckButton(true);
				view.setPlayer2CheckButton(false);
			}
		}
	}
	class ResetGameListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			model.resetPlayersPoints();
			model.resetWinnersSign();
			model.resetFinishedGame();
			model.setStartingSign();
			model.resetSign();
			view.resetBoard();
			view.resetPlayersPoints();
			view.setPlayer1CheckButton(true);
			view.setPlayer2CheckButton(false);
		}
	}
	class B00Listener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(model.getField(0,0).equals("") && model.getIsFinished()==false) {
				model.setBoard(0,0);
				view.setBoard(0, 0, model.getSign());
				if(model.isRoundFinished()) {
					model.setWinnersSign(model.getSign());
					model.setFinishedGame();
				}
				model.setSign();
			}
		}
	}
	class B01Listener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(model.getField(0,1).equals("") && model.getIsFinished()==false) {
				model.setBoard(0,1);
				view.setBoard(0, 1, model.getSign());
				if(model.isRoundFinished()) {
					model.setWinnersSign(model.getSign());
					model.setFinishedGame();
				}
				model.setSign();
			}
		}
	}
	class B02Listener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(model.getField(0,2).equals("") && model.getIsFinished()==false) {
				model.setBoard(0,2);
				view.setBoard(0, 2, model.getSign());
				if(model.isRoundFinished()) {
					model.setWinnersSign(model.getSign());
					model.setFinishedGame();
				}
				model.setSign();
			}
		}
	}
	class B10Listener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(model.getField(1,0).equals("") && model.getIsFinished()==false) {
				model.setBoard(1,0);
				view.setBoard(1, 0, model.getSign());
				if(model.isRoundFinished()) {
					model.setWinnersSign(model.getSign());
					model.setFinishedGame();
				}
				model.setSign();
			}
		}
	}
	class B11Listener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(model.getField(1,1).equals("") && model.getIsFinished()==false) {
				model.setBoard(1,1);
				view.setBoard(1, 1, model.getSign());
				if(model.isRoundFinished()) {
					model.setWinnersSign(model.getSign());
					model.setFinishedGame();
				}
				model.setSign();
			}
		}
	}
	class B12Listener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(model.getField(1,2).equals("") && model.getIsFinished()==false) {
				model.setBoard(1,2);
				view.setBoard(1,2, model.getSign());
				if(model.isRoundFinished()) {
					model.setWinnersSign(model.getSign());
					model.setFinishedGame();
				}
				model.setSign();
			}
		}
	}
	class B20Listener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(model.getField(2,0).equals("") && model.getIsFinished()==false) {
				model.setBoard(2,0);
				view.setBoard(2, 0, model.getSign());
				if(model.isRoundFinished()) {
					model.setWinnersSign(model.getSign());
					model.setFinishedGame();
				}
				model.setSign();
			}
		}
	}
	class B21Listener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(model.getField(2,1).equals("") && model.getIsFinished()==false) {
				model.setBoard(2,1);
				view.setBoard(2,1, model.getSign());
				if(model.isRoundFinished()) {
					model.setWinnersSign(model.getSign());
					model.setFinishedGame();
				}
				model.setSign();
			}
		}
	}
	class B22Listener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(model.getField(2,2).equals("") && model.getIsFinished()==false) {
				model.setBoard(2,2);
				view.setBoard(2,2, model.getSign());
				if(model.isRoundFinished()) {
					model.setWinnersSign(model.getSign());
					model.setFinishedGame();
				}
				model.setSign();
			}
		}
	}
	
	
}

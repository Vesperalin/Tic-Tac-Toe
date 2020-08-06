package View;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
public class View {
	private JFrame frame;
	private JPanel centerPanel;
	private JPanel northPanel;
	private JPanel southPanel;
	private JPanel northSubPanelNorth;
	private JPanel northSubPanelSouth;
	private JButton resetRoundButton;
	private JButton nextRoundButton;
	private JButton resetGameButton;
	private JCheckBox player1Starts;
	private JCheckBox player2Starts;
	private JButton[][] boardButtons = new JButton[3][3];
	private JLabel player1Label;
	private JLabel player2Label;
	private JTextField player1TextField;
	private JTextField player2TextField;
	private static final String wartoscPoczatkowa="0"; 
	
	public View() {
		//frame
		frame = new JFrame("Tic-Tac-Toe");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(330, 463);
		frame.setResizable(false);
		//mainPanels
		centerPanel = new JPanel();
		northPanel = new JPanel(new BorderLayout());
		southPanel = new JPanel();
		centerPanel.setBackground(Color.black);
		centerPanel.setSize(330, 240);
		northPanel.setSize(330, 100);
		southPanel.setSize(330, 100);
		frame.getContentPane().add(BorderLayout.CENTER, centerPanel);
		frame.getContentPane().add(BorderLayout.NORTH, northPanel);
		frame.getContentPane().add(BorderLayout.SOUTH, southPanel);
		//northSubPanels
		northSubPanelNorth = new JPanel();
		northSubPanelSouth = new JPanel();
		northSubPanelNorth.setSize(330, 50);
		northSubPanelSouth.setSize(330, 50);
		//northSubPanelNorth
		northPanel.add(BorderLayout.NORTH, northSubPanelNorth);
		northPanel.add(BorderLayout.SOUTH, northSubPanelSouth);
		//northComponents
		player1Label = new JLabel("(X)Player's 1 points: ");
		player2Label = new JLabel("(O)Player's 2 points: ");
		player1Starts = new JCheckBox("You start", true);
		player2Starts = new JCheckBox("You start");
		player1TextField = new JTextField(wartoscPoczatkowa);
		player2TextField = new JTextField(wartoscPoczatkowa);
		player1Starts.setEnabled(false);
		player2Starts.setEnabled(false);
		player1TextField.setEditable(false);
		player2TextField.setEditable(false);
		player1TextField.setColumns(3);
		player2TextField.setColumns(3);
		northSubPanelNorth.add(player1Label);
		northSubPanelNorth.add(player1TextField);
		northSubPanelNorth.add(player1Starts);
		northSubPanelSouth.add(player2Label);
		northSubPanelSouth.add(player2TextField);
		northSubPanelSouth.add(player2Starts);
		//centerComponents
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				boardButtons[i][j] = new JButton();
				boardButtons[i][j].setPreferredSize(new Dimension(97, 97));
				boardButtons[i][j].setFont(new Font("System", Font.BOLD, 70));
				centerPanel.add(boardButtons[i][j]);
			}
		}
		//southComponents
		resetRoundButton = new JButton("Reset Round");
		resetGameButton = new JButton("Reset Game");
		nextRoundButton = new JButton("Next Round");
		resetRoundButton.setPreferredSize(new Dimension(100, 27));
		resetRoundButton.setFont(new Font("System", Font.BOLD, 9));
		resetGameButton.setPreferredSize(new Dimension(100, 27));
		resetGameButton.setFont(new Font("System", Font.BOLD, 9));
		nextRoundButton.setPreferredSize(new Dimension(100, 27));
		nextRoundButton.setFont(new Font("System", Font.BOLD, 9));
		southPanel.add(resetRoundButton);
		southPanel.add(nextRoundButton);
		southPanel.add(resetGameButton);
		
		frame.setVisible(true);
	}
	public void setPlayer1CheckButton(boolean b) {
		player1Starts.setSelected(b);
	}
	public void setPlayer2CheckButton(boolean b) {
		player2Starts.setSelected(b);
	}
	public boolean getPlayer1CheckButton() {
		return player1Starts.isSelected();
	}
	public void resetBoard() {
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				boardButtons[i][j].setText(null);
			}
		}
	}
	public void resetPlayersPoints() {
		player1TextField.setText(wartoscPoczatkowa);
		player2TextField.setText(wartoscPoczatkowa);
	}
	public void setPointsPlayer1(String p){
		player1TextField.setText(p);
	}
	public void setPointsPlayer2(String p){
		player2TextField.setText(p);
	}
	public void setBoard(int x, int y, String s) {
		boardButtons[x][y].setText(s);
	}
	public void add00Listener(ActionListener al) {
		boardButtons[0][0].addActionListener(al);
	}
	public void add01Listener(ActionListener al) {
		boardButtons[0][1].addActionListener(al);
	}
	public void add02Listener(ActionListener al) {
		boardButtons[0][2].addActionListener(al);
	}
	public void add10Listener(ActionListener al) {
		boardButtons[1][0].addActionListener(al);
	}
	public void add11Listener(ActionListener al) {
		boardButtons[1][1].addActionListener(al);
	}
	public void add12Listener(ActionListener al) {
		boardButtons[1][2].addActionListener(al);
	}
	public void add20Listener(ActionListener al) {
		boardButtons[2][0].addActionListener(al);
	}
	public void add21Listener(ActionListener al) {
		boardButtons[2][1].addActionListener(al);
	}
	public void add22Listener(ActionListener al) {
		boardButtons[2][2].addActionListener(al);
	}
	public void addResetRoundListener(ActionListener al) {
		resetRoundButton.addActionListener(al);
	}
	public void addNextRoundListener(ActionListener al) {
		nextRoundButton.addActionListener(al);
	}
	public void addResetGameListener(ActionListener al) {
		resetGameButton.addActionListener(al);
	}
	
}

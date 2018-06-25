import javax.swing.JOptionPane;

public class Test {
	
	public static void main(String[] args) {
		
		Game game = new Game();
		game.startGame();
		
		boolean gano = true;
		int playCount = 0;
		
		while(gano) {
			game.moveDisc();
			
			playCount++;
			
			if (game.getSizePila3()==10)
				gano = false;
			
		}
		
		
		JOptionPane.showMessageDialog(null, "GANASTEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\nRealizaste " + playCount + " jugadas!");
		
	}
	
	
	
}

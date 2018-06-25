import java.util.Stack;

import javax.swing.JOptionPane;

public class Game {
	
	private Stack<Disco> pila1 = new Stack<Disco>();
	private Stack<Disco> pila2 = new Stack<Disco>();
	private Stack<Disco> pila3 = new Stack<Disco>();
	private String[] opciones = {"Pila 1","Pila 2","Pila 3"};
 	
	public void startGame() {
		for (int i = 0; i < 10; i++) {
			
			int tempNum = 10 - (i);
			
			pila1.push(new Disco(tempNum));
		
		}
		
	}
	
	public String showGameState() {
		
		String gameState = "pila 1          pila 2          pila3";
		
		for(int i = 0; i<10; i++) {
			gameState += "\n";
			
			if (pila1.size() > i) {
				gameState += pila1.get(i).getNumero() + "                   ";
			}else {
				gameState += "                   " ;
			}
			
			if (pila2.size() > i) {
				gameState += pila2.get(i).getNumero() + "                 ";
			}else { 
				gameState += "                     ";
			}
			
			if (pila3.size() > i) { 
				gameState += pila3.get(i).getNumero();
			}else {
				gameState += "                     ";
			}
		
			
		}
		return gameState;
		
		
			
	
	}
	
	public int getSizePila3() {
		return pila3.size();
		
	}
		
	public void moveDisc() {
		
		int opcion = JOptionPane.showOptionDialog(null, "elija de que pila desea mover un disco\n" + showGameState(), "game", 1, 1, null, opciones, 0);
		
		Disco discoTemp;
			
		switch (opcion) {
		
		case 0:
			
			if(pila1.empty()) {
				JOptionPane.showMessageDialog(null, "opcion invlida, pila vacia");
				
			} else {
				
			discoTemp = pila1.pop();
			
			int opcion2 = JOptionPane.showOptionDialog(null, "elija a que pila desea mover un disco\n" + showGameState(), "game", 1, 1, null, opciones, 1);
			
			switch (opcion2) {
			
			case 0:
			
					
					pila1.push(discoTemp);
				
			break;
			
			case 1:
				if(pila2.empty() || (discoTemp.getNumero()<pila2.peek().getNumero())) {
					
					pila2.push(discoTemp);
					
					
					
				}else {
					JOptionPane.showMessageDialog(null, "movimiento invalido, no podes mover un disco sobre uno mas chico");
					pila1.push(discoTemp);
					}
			break;
			
			case 2:
				if(pila3.empty() || (discoTemp.getNumero()<pila3.peek().getNumero())) {
					
					pila3.push(discoTemp);
					
					
										
				}else {
					JOptionPane.showMessageDialog(null, "movimiento invalido, no podes mover un disco sobre uno mas chico");
					pila1.push(discoTemp);
					}
			}
			
			break;
		
			}
		
			break;
		
		case 1: 
			
			if(pila2.empty()) {
				
				JOptionPane.showMessageDialog(null, "opcion invlida, pila vacia");
			
			}
			else {
				
			discoTemp = pila2.pop();
			
			int opcion2 = JOptionPane.showOptionDialog(null, "elija a que pila desea mover un disco\n" + showGameState(), "game", 1, 1, null, opciones, 1);
			
			switch (opcion2) {
			
			case 0:
				if(pila1.empty() || (discoTemp.getNumero()<pila1.peek().getNumero())) {
					
					pila1.push(discoTemp);
					
					
					
				}else {
					JOptionPane.showMessageDialog(null, "movimiento invalido, no podes mover un disco sobre uno mas chico");
					pila2.push(discoTemp);
					}
			break;
			
			case 1:
				
				
				pila2.push(discoTemp);
				
			break;
			
			case 2:
				if(pila3.empty() || (discoTemp.getNumero()<pila3.peek().getNumero())) {
					
					pila3.push(discoTemp);
					
					
					
				}else {
					JOptionPane.showMessageDialog(null, "movimiento invalido, no podes mover un disco sobre uno mas chico");
					pila2.push(discoTemp);
					}
			}
			
		    break;
		    
			}
			
			break;
			
		case 2:
			
			if(pila3.empty()) {
				JOptionPane.showMessageDialog(null, "opcion invlida, pila vacia");
			}
			
			else {
			discoTemp = pila3.pop();
			
			int opcion2 = JOptionPane.showOptionDialog(null, "elija a que pila desea mover un disco\n" + showGameState(), "game", 1, 1, null, opciones, 1);
			
			switch (opcion2) {
			
			case 0:
				if(pila1.empty() || (discoTemp.getNumero()<pila1.peek().getNumero())) {
					
					pila1.push(discoTemp);
					
				
					
				}else {
					JOptionPane.showMessageDialog(null, "movimiento invalido, no podes mover un disco sobre uno mas chico");	
					pila3.push(discoTemp);
					}
			break;
			
			case 1:
				if(pila2.empty() || (discoTemp.getNumero()<pila2.peek().getNumero())) {
					
					pila2.push(discoTemp);
					
					
					
				}else {
					JOptionPane.showMessageDialog(null, "movimiento invalido, no podes mover un disco sobre uno mas chico");
					pila3.push(discoTemp);
					}
			break;
			
			case 2:
				
				pila3.push(discoTemp);
			}
			
		break;
		}
		
		break;
		
		default: 
			System.exit(0);
		}
	}
	}
	



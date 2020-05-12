package Secao4_InstrucoesDeControle;
//Utilizando DrawLine para conectar os cantos de um painel
import java.awt.Graphics;
import javax.swing.JPanel;
public class DrawPanel extends JPanel{
	//desenha um x a partir dos cantos do painel
	public void paintComponent (Graphics g){
		//chama paintComponent para asssegurar que o painel é exibido corretamente.
		super.paintComponent(g);
		
		int width = 0; 
		int height = getHeight();
		
		int width2 = getWidth();
		int height2 = getHeight();
		
		while(width <= getWidth()) {
			g.drawLine(0, 0, width, height);
			g.drawLine(getWidth(), getHeight(), width, height);
			width +=15;
			height -= 15;			
		}
		
		while(width2 >= 0) {
			g.drawLine(getWidth(), 0, width2, height2);
			g.drawLine(0, getHeight(), width2, height2);
			width2 -=15;
			height2 -= 15;			
		}
		
	}
}//fim da classe DrawPanel

package Secao4_InstrucoesDeControle;

import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class DrawPanel2 extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		int inicioPrimeiraLinhax = 0;
		int inicioPrimeiraLinhay = 0;
		int inicioPrimeiraLinhay2 = getHeight();
		int umPassoADireita = 15;
		int umPassoAEsquerda = getWidth();
		
		while(inicioPrimeiraLinhay <= getHeight()) {
			g.drawLine(inicioPrimeiraLinhax, inicioPrimeiraLinhay, umPassoADireita, getHeight());
			g.drawLine(getWidth(), inicioPrimeiraLinhay, umPassoAEsquerda, getHeight());
			
			g.drawLine(getWidth(), inicioPrimeiraLinhay2, umPassoAEsquerda, 0);
			g.drawLine(inicioPrimeiraLinhax, inicioPrimeiraLinhay2, umPassoADireita, 0);
			
			umPassoADireita +=15;
			umPassoAEsquerda -=15;
			inicioPrimeiraLinhay +=15;
			inicioPrimeiraLinhay2 -=15;
		}
		
	}
}

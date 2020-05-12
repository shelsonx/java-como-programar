package Secao4_InstrucoesDeControle;

import javax.swing.JFrame;

public class DrawPanel2Test2 {
	public static void main(String[] args) {
		DrawPanel2 panel = new DrawPanel2();
		
		JFrame application = new JFrame();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(250,250);
		application.setVisible(true);
	}
	
}

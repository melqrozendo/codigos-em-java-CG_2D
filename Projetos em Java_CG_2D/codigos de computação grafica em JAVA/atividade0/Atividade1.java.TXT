

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class EixosSegmento extends JPanel {//importante implemetar extends JPanel
		
	
	 // exibe várias linhas, retângulos e elipses
	   public void paintComponent( Graphics g )
	   {
	      super.paintComponent( g ); // chama o método paint da superclasse

	      this.setBackground( Color.WHITE );//cor de fundo branco
	      
	      g.setColor( Color.BLACK );//cor dos eixos preta
	      g.drawLine( 0, 240, 680, 240 );//eixo x
	      g.drawLine( 320, 0, 320, 480 );//eixo y
	      
	      g.setColor(Color.RED);//cor do segmento vermelha
	      g.drawLine(420, 140, 520, 40);// vetor do segmento
	      
	      g.setColor( Color.BLACK );// cor dos traços das unidades dos intervalos no eixo x
	      g.drawLine( 20, 235, 20, 245 );//-3
	      g.drawLine( 120, 235, 120, 245 );//-2
	      g.drawLine( 220, 235, 220, 245 );//-1
	      g.drawLine( 420, 235, 420, 245 );//+1
	      g.drawLine( 520, 235, 520, 245 );//+2
	      g.drawLine( 620, 235, 620, 245 );//+3
	      
	      g.setColor( Color.BLACK );// cor dos traços das unidades dos intervalos no eixo y
	      g.drawLine( 315, 40, 325, 40 );//+2
	      g.drawLine( 315, 140, 325, 140 );//+1
	      g.drawLine( 315, 340, 325, 340 );//-1
	      g.drawLine( 315, 440, 325, 440 );//-2
	      
	      g.setColor( Color.BLUE );// cor das legendas das unidades dos intervalos no eixo x
	      g.drawString( "-3", 15, 260 );
	      g.drawString( "-2", 115, 260 );
	      g.drawString( "-1", 215, 260 );
	      g.drawString( "1", 415, 260 );
	      g.drawString( "2", 515, 260 );
	      g.drawString( "3", 615, 260 );
	      
	      g.setColor( Color.BLUE );// cor das legendas das unidades dos intervalos no eixo y
	      g.drawString( "2", 305, 45 );
	      g.drawString( "1", 305, 145 );
	      g.drawString( "0", 305, 260 );
	      g.drawString( "1", 305, 345 );
	      g.drawString( "2", 305, 445 );
	      
	      
	      
	      
	      
	      
	  
		
	}
}

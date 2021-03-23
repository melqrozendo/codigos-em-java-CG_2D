package atividadesQuest3;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JFrame;

public class Graficos2DShow {

	
	// executa o aplicativo
	   public static void main( String args[] )
	   {
	      // criar frame para Graficos2DShow
	      JFrame frame = new JFrame( "Drawing lines, rectangles and ovals" );
	      frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	   
	      Object Graficos2D = new Graficos2D(); 
	      ((Component) Graficos2D).setBackground( Color.WHITE ); 
	      frame.add( (Component) Graficos2D ); // adiciona painel ao frame
	      frame.setSize( 640, 480 ); // configura o tamanho do frame
	      frame.setVisible( true ); // exibe o frame
	   } // fim de main
	} // fim da classe Graficos2D

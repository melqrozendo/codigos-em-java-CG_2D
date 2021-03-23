package atividadesQuest2;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JFrame;

public class TransfGeom2DShow {

	
	// executa o aplicativo
	   public static void main( String args[] )
	   {
	      // criar frame para TransfGeom2DShow
	      JFrame frame = new JFrame( "Drawing lines, rectangles and ovals" );
	      frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	   
	      Object TransfGeom2D = new TransfGeom2D(); 
	      ((Component) TransfGeom2D).setBackground( Color.WHITE ); 
	      frame.add( (Component) TransfGeom2D ); // adiciona painel ao frame
	      frame.setSize( 800, 600 ); // configura o tamanho do frame
	      frame.setVisible( true ); // exibe o frame
	   } // fim de main
	} // fim da classe TransfGeom2D
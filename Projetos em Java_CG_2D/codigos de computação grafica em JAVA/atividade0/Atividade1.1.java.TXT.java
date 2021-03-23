

import java.awt.Color;
import java.awt.Component;

import javax.swing.JFrame;

public class EixosSegmentos1 {

	
	// executa o aplicativo
	   public static void main( String args[] )
	   {
	      // criar frame para EixosSegmento
	      JFrame frame = 
	         new JFrame( "Drawing lines, rectangles and ovals" );
	      frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	   
	      Object EixosSegmento = 
	         new EixosSegmento(); 
	      ((Component) EixosSegmento).setBackground( Color.WHITE ); 
	      frame.add( (Component) EixosSegmento ); // adiciona painel ao frame
	      frame.setSize( 680, 520 ); // configura o tamanho do frame
	      frame.setVisible( true ); // exibe o frame
	   } // fim de main
	} // fim da classe EixosSegmentos1


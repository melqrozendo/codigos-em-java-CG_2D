package atividadesQuest1;


import java.awt.Color;
import java.awt.Component;

import javax.swing.JFrame;

public class Imagem2DShow {

	
	// executa o aplicativo
	   public static void main( String args[] )
	   {
	      // criar frame para Imagem2DShow
	      JFrame frame = new JFrame( "Drawing lines, rectangles and ovals" );
	      frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	   
	      Object Imagem2D = new Imagem2D(); 
	      ((Component) Imagem2D).setBackground( Color.WHITE ); 
	      frame.add( (Component) Imagem2D ); // adiciona painel ao frame
	      frame.setSize( 640, 480 ); // configura o tamanho do frame
	      frame.setVisible( true ); // exibe o frame
	   } // fim de main
	} // fim da classe Imagem2D
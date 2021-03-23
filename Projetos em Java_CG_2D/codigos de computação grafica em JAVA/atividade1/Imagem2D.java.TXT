package atividadesQuest1;

import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Imagem2D extends JPanel
{
  private int xOrigem=320, yOrigem=240;//valores iniciais, privados.
    private double escala =100; // a escala pode ser modificada no valor de pixels determinado.
    //double a= -10; passo= 1;
 
    public int getXint(double x)
    {
        return (int) (xOrigem + ( x * escala ));
    }
    
    public int getYint(double y)
    {
        return (int) (yOrigem - ( y * escala ));
    }
    
   // desenha o Gráfico


public void paintComponent( Graphics g )
   {
      super.paintComponent( g ); // chama o paintComponent da superclasse
      this.setBackground( Color.WHITE );//quadro branco
     
     // Plota os Eixos
     xOrigem = this.getWidth() / 2;
     yOrigem = this.getHeight() / 2;
     
//      xOrigem = 320;
//      yOrigem = 240;
         
      g.setColor( Color.BLACK );//eixo x e y foi setado na cor preta.
      g.drawLine( 0, yOrigem, this.getWidth(), yOrigem);//faz eixo y.
      g.drawLine( xOrigem, 0, xOrigem , this.getHeight());//faz eixo x.
  
      
    //o uso do get_int já converter o valor
      g.setColor( Color.RED );//o segmento foi setado na cor vermelha.
      g.drawLine( getXint(1), getYint(1), getXint(2 ), getYint(2));//segmento no x positivo.
     
      g.setColor( Color.BLACK );//o intervalo foi setado na cor preta.
      //eixo y
      g.drawLine( getXint(-0.05), getYint(1), getXint(0.05), getYint(1));
      g.drawLine( getXint(-0.05), getYint(2), getXint(0.05), getYint(2));
      g.drawLine( getXint(-0.05), getYint(-1), getXint(0.05), getYint(-1));
      g.drawLine( getXint(-0.05), getYint(-2), getXint(0.05), getYint(-2));
      //eixo x
      g.drawLine( getXint(-3), getYint(-0.05), getXint(-3), getYint(0.05));
      g.drawLine( getXint(-2), getYint(-0.05), getXint(-2), getYint(0.05));
      g.drawLine( getXint(-1), getYint(-0.05), getXint(-1), getYint(0.05));
      g.drawLine( getXint(0), getYint(-0.05), getXint(0), getYint(0.05));
      g.drawLine( getXint(3), getYint(-0.05), getXint(3), getYint(0.05));
      g.drawLine( getXint(2), getYint(-0.05), getXint(2), getYint(0.05));
      g.drawLine( getXint(1), getYint(-0.05), getXint(1), getYint(0.05));
    
      //desenhar intervalo no eixo x e y.
      g.setColor( Color.BLUE );//a legenda dos intervalos na cor azul
      //eixo y
      g.drawString(" 1 ",getXint(-0.20), getYint(1));
      g.drawString(" 2 ",getXint(-0.20), getYint(2));
      g.drawString(" -1 ",getXint(-0.20), getYint(-1));
      g.drawString(" -2 ",getXint(-0.20), getYint(-2));
      //eixo x
      g.drawString(" -1 ",getXint(-1.15), getYint(-0.20));
      g.drawString(" -2 ",getXint(-2.15), getYint(-0.20));
      g.drawString(" -3 ",getXint(-3.15), getYint(-0.20));
      g.drawString(" 0 ",getXint(-0.15), getYint(-0.20));
      g.drawString(" 1 ",getXint(0.85), getYint(-0.20));
      g.drawString(" 2 ",getXint(1.85), getYint(-0.20));
      g.drawString(" 3 ",getXint(2.85), getYint(-0.20));
      
      
      

}
}

package atividadesQuest3;

import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;



public class Graficos2D extends JPanel
{
  private int xOrigem=320, yOrigem=240;//valores iniciais, privados.
    private double escala =50; // a escala pode ser modificada no valor de pixels determinado.
    //double a= -100, passo= 1;
 
    public int getXint(double x)
    {
        return (int) (xOrigem + ( x * escala ));
    }
    
    public int getYint(double y)
    {
        return (int) (yOrigem - ( y * escala ));
    }
    //faz calculo de seno e cosseno
    
    
    
   // desenha o Gráfico


public void paintComponent( Graphics g )
   {
      super.paintComponent( g ); // chama o paintComponent da superclasse
      this.setBackground( Color.WHITE );//quadro branco
     
     // Plota os Eixos
     xOrigem = this.getWidth() / 2;
     yOrigem = this.getHeight() / 2;
     //determina o encontro dos eixos x e y.
     xOrigem = 157;
     yOrigem = 217;
     
     //faz eixo x e y    
      g.setColor( Color.BLACK );//eixo x e y foi setado na cor preta.
      g.drawLine( 0, yOrigem, this.getWidth(), yOrigem);//faz eixo y.
      g.drawLine( xOrigem, 0, xOrigem , this.getHeight());//faz eixo x.
      //faz intervalo x e y
      g.setColor( Color.BLACK );//o intervalo foi setado na cor preta.
      //eixo y
      g.drawLine( getXint(-0.05), getYint(1), getXint(0.05), getYint(1));
      g.drawLine( getXint(-0.05), getYint(2), getXint(0.05), getYint(2));
      g.drawLine( getXint(-0.05), getYint(3), getXint(0.05), getYint(3));
      g.drawLine( getXint(-0.05), getYint(4), getXint(0.05), getYint(4));
      g.drawLine( getXint(-0.05), getYint(-1), getXint(0.05), getYint(-1));
      g.drawLine( getXint(-0.05), getYint(-2), getXint(0.05), getYint(-2));
      g.drawLine( getXint(-0.05), getYint(-3), getXint(0.05), getYint(-3));
      g.drawLine( getXint(-0.05), getYint(-4), getXint(0.05), getYint(-4));
     
      //eixo x
      g.drawLine( getXint(0), getYint(-0.05), getXint(0), getYint(0.05));
      g.drawLine( getXint(1), getYint(-0.05), getXint(1), getYint(0.05));
      g.drawLine( getXint(2), getYint(-0.05), getXint(2), getYint(0.05));
      g.drawLine( getXint(3), getYint(-0.05), getXint(3), getYint(0.05));
      g.drawLine( getXint(4), getYint(-0.05), getXint(4), getYint(0.05));
      g.drawLine( getXint(5), getYint(-0.05), getXint(5), getYint(0.05));
      g.drawLine( getXint(6), getYint(-0.05), getXint(6), getYint(0.05));
      g.drawLine( getXint(7), getYint(-0.05), getXint(7), getYint(0.05));
      g.drawLine( getXint(8), getYint(-0.05), getXint(8), getYint(0.05));
      g.drawLine( getXint(9), getYint(-0.05), getXint(9), getYint(0.05));
      g.drawLine( getXint(10), getYint(-0.05), getXint(10), getYint(0.05));
      g.drawLine( getXint(11), getYint(-0.05), getXint(11), getYint(0.05));
      
      //faz legenda
      g.setColor( Color.BLUE );//a legenda dos intervalos na cor azul
      //eixo y
      g.drawString(" 4 ",getXint(-0.35), getYint(4));
      g.drawString(" 3 ",getXint(-0.35), getYint(3));
      g.drawString(" 1 ",getXint(-0.35), getYint(1));
      g.drawString(" 2 ",getXint(-0.35), getYint(2));
      g.drawString(" -1 ",getXint(-0.35), getYint(-1));
      g.drawString(" -2 ",getXint(-0.35), getYint(-2));
      g.drawString(" -3 ",getXint(-0.35), getYint(-3));
      g.drawString(" -4 ",getXint(-0.35), getYint(-4));
      //eixo x
      g.drawString(" 0 ",getXint(-0.35), getYint(-0.35));
      g.drawString(" 1 ",getXint(0.85), getYint(-0.35));
      g.drawString(" 2 ",getXint(1.85), getYint(-0.35));
      g.drawString(" 3 ",getXint(2.85), getYint(-0.35));
      g.drawString(" 4 ",getXint(3.85), getYint(-0.35));
      g.drawString(" 5 ",getXint(4.85), getYint(-0.35));
      g.drawString(" 6 ",getXint(5.85), getYint(-0.35));
      g.drawString(" 7 ",getXint(6.85), getYint(-0.35));
      g.drawString(" 8 ",getXint(7.85), getYint(-0.35));
      g.drawString(" 9 ",getXint(8.85), getYint(-0.35));
      g.drawString(" 10 ",getXint(9.85), getYint(-0.35));
      g.drawString(" 11 ",getXint(10.85), getYint(-0.35));
      g.drawString(" 12 ",getXint(11.85), getYint(-0.35));
      
      
      
     
      //desenho da função cosseno>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
      int antigoX1=0;
      int antigoY1=0;
      int x1=0;
      int y1=0;
      
      
      int frequencia1 = this.getWidth()/2;
          int amplitude1 = this.getHeight()/1;
          g.setColor(Color.GREEN);

          for(double ang=0; ang<=1440; ang+=10)
          {
             x1 = (int) (frequencia1*ang/360);
              //tenta mudar aqui
             y1 = (int) (Math.cos( (Math.PI*ang/180 )) * amplitude1/8 ) ;
             
             g.drawLine( antigoX1, antigoY1+ amplitude1/2, x1, y1+ amplitude1/2);
             antigoX1 = x1;
             antigoY1 = y1;
          }
          antigoX1=0;
          antigoY1=0;
    
  
      
      //desenho da função seno>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
      int antigoX=0;
      int antigoY=0;
      int x=0;
      int y=0;
      
      
      int frequencia = this.getWidth()/2;
          int amplitude = this.getHeight()/1;
          g.setColor(Color.RED);

          for(double ang=0; ang<=1440; ang+=10)
          {
             x = (int) (frequencia*ang/360);
              //tenta mudar aqui
             y = (int) (Math.sin( (Math.PI*ang/180 )) * amplitude/8 ) ;
             
             g.drawLine( antigoX, antigoY+ amplitude/2, x, y+ amplitude/2);
             antigoX = x;
             antigoY = y;
          }
          antigoX=0;
          antigoY=0;
    
    

}
}

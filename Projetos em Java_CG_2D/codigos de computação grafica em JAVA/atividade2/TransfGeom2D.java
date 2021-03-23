package atividadesQuest2;

import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class TransfGeom2D extends JPanel
{
  private int xOrigem=400, yOrigem=300;//valores iniciais, privados.
    private double escala =50; // a escala pode ser modificada no valor de pixels determinado.
    //double a= -10, passo= 1;
 
    public int getXint(double x)
    {
        return (int) (xOrigem + ( x * escala ));
    }
    
    public int getYint(double y)
    {
        return (int) (yOrigem - ( y * escala ));
    }
    
    
    //aplicar operações de TRANSLAÇÃO, ESCALA E ROTAÇÃO.
    
    public static Poligono2D translacao( Poligono2D a, double tx, double ty) {
		Poligono2D res = new Poligono2D(a.x+tx , a.y+ty);
		return res;
	}
	public static Poligono2D escala( Poligono2D a, double ex, double ey) {
		Poligono2D res = new Poligono2D(a.x*ex , a.y*ey);
		return res;
	}
	public static Poligono2D rotacao( Poligono2D a, double angulo) {
		angulo = (Math.PI/180)*angulo;
		Poligono2D res = new Poligono2D(a.x*Math.cos(angulo) - a.y*Math.sin(angulo),
										a.y*Math.cos(angulo) - a.x*Math.sin(angulo));
		return res;
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
      //g.setColor( Color.RED );//o segmento foi setado na cor vermelha.
      //g.drawLine( getXint(1), getYint(1), getXint(2 ), getYint(2));//segmento no x positivo.
     
      g.setColor( Color.BLACK );//o intervalo foi setado na cor preta.
      //eixo y
      g.drawLine( getXint(-0.05), getYint(1), getXint(0.05), getYint(1));
      g.drawLine( getXint(-0.05), getYint(2), getXint(0.05), getYint(2));
      g.drawLine( getXint(-0.05), getYint(3), getXint(0.05), getYint(3));
      g.drawLine( getXint(-0.05), getYint(4), getXint(0.05), getYint(4));
      g.drawLine( getXint(-0.05), getYint(5), getXint(0.05), getYint(5));
      g.drawLine( getXint(-0.05), getYint(6), getXint(0.05), getYint(6));
      g.drawLine( getXint(-0.05), getYint(-1), getXint(0.05), getYint(-1));
      g.drawLine( getXint(-0.05), getYint(-2), getXint(0.05), getYint(-2));
      g.drawLine( getXint(-0.05), getYint(-3), getXint(0.05), getYint(-3));
      g.drawLine( getXint(-0.05), getYint(-4), getXint(0.05), getYint(-4));
      g.drawLine( getXint(-0.05), getYint(-5), getXint(0.05), getYint(-5));
      g.drawLine( getXint(-0.05), getYint(-6), getXint(0.05), getYint(-6));
      //eixo x
      g.drawLine( getXint(-8), getYint(-0.05), getXint(-8), getYint(0.05));
      g.drawLine( getXint(-7), getYint(-0.05), getXint(-7), getYint(0.05));
      g.drawLine( getXint(-6), getYint(-0.05), getXint(-6), getYint(0.05));
      g.drawLine( getXint(-5), getYint(-0.05), getXint(-5), getYint(0.05));
      g.drawLine( getXint(-4), getYint(-0.05), getXint(-4), getYint(0.05));
      g.drawLine( getXint(-3), getYint(-0.05), getXint(-3), getYint(0.05));
      g.drawLine( getXint(-2), getYint(-0.05), getXint(-2), getYint(0.05));
      g.drawLine( getXint(-1), getYint(-0.05), getXint(-1), getYint(0.05));
      g.drawLine( getXint(0), getYint(-0.05), getXint(0), getYint(0.05));
      g.drawLine( getXint(1), getYint(-0.05), getXint(1), getYint(0.05));
      g.drawLine( getXint(2), getYint(-0.05), getXint(2), getYint(0.05));
      g.drawLine( getXint(3), getYint(-0.05), getXint(3), getYint(0.05));
      g.drawLine( getXint(4), getYint(-0.05), getXint(4), getYint(0.05));
      g.drawLine( getXint(5), getYint(-0.05), getXint(5), getYint(0.05));
      g.drawLine( getXint(6), getYint(-0.05), getXint(6), getYint(0.05));
      g.drawLine( getXint(7), getYint(-0.05), getXint(7), getYint(0.05));
      g.drawLine( getXint(8), getYint(-0.05), getXint(8), getYint(0.05));
    
      //desenhar intervalo no eixo x e y.
      g.setColor( Color.BLUE );//a legenda dos intervalos na cor azul
      //eixo y
      g.drawString(" 6 ",getXint(-0.35), getYint(6));
      g.drawString(" 5 ",getXint(-0.35), getYint(5));
      g.drawString(" 4 ",getXint(-0.35), getYint(4));
      g.drawString(" 3 ",getXint(-0.35), getYint(3));
      g.drawString(" 1 ",getXint(-0.35), getYint(1));
      g.drawString(" 2 ",getXint(-0.35), getYint(2));
      g.drawString(" -1 ",getXint(-0.35), getYint(-1));
      g.drawString(" -2 ",getXint(-0.35), getYint(-2));
      g.drawString(" -3 ",getXint(-0.35), getYint(-3));
      g.drawString(" -6 ",getXint(-0.35), getYint(-6));
      g.drawString(" -5 ",getXint(-0.35), getYint(-5));
      g.drawString(" -4 ",getXint(-0.35), getYint(-4));
      //eixo x
      g.drawString(" -1 ",getXint(-1.15), getYint(-0.35));
      g.drawString(" -2 ",getXint(-2.15), getYint(-0.35));
      g.drawString(" -3 ",getXint(-3.15), getYint(-0.35));
      g.drawString(" -4 ",getXint(-4.15), getYint(-0.35));
      g.drawString(" -5 ",getXint(-5.15), getYint(-0.35));
      g.drawString(" -6 ",getXint(-6.15), getYint(-0.35));
      g.drawString(" -7 ",getXint(-7.15), getYint(-0.35));
      g.drawString(" -8 ",getXint(-8.15), getYint(-0.35));
      g.drawString(" 0 ",getXint(-0.35), getYint(-0.35));
      g.drawString(" 1 ",getXint(0.85), getYint(-0.35));
      g.drawString(" 2 ",getXint(1.85), getYint(-0.35));
      g.drawString(" 3 ",getXint(2.85), getYint(-0.35));
      g.drawString(" 4 ",getXint(3.85), getYint(-0.35));
      g.drawString(" 5 ",getXint(4.85), getYint(-0.35));
      g.drawString(" 6 ",getXint(5.85), getYint(-0.35));
      g.drawString(" 7 ",getXint(6.85), getYint(-0.35));
      g.drawString(" 8 ",getXint(7.85), getYint(-0.35));
      
      //desenho do poligono2D ORIGINAL
      
      //aplicar 2 vetores reais
      //double [] xR = {1, 0, 0, 1, 3, 4, 4, 3};
      //double [] yR = {0, 1, 2, 3, 3, 2, 1, 0};
      
      double [] xR = {0.5, 0.5, 2, 2, 1.5, 1.5, 1, 1};
      double [] yR = {0, 1, 1, 0, 0, 0.5, 0.5, 0};
      
      //double [] xR = {0, -1, -1, 0, 2, 3, 3, 2};
      //double [] yR = {0, 1, 2, 3, 3, 2, 1, 0};
      //aplicar 2 vetores inteiros
      int [] xI, yI;//
      xI = new int[xR.length];
      yI = new int[yR.length];
      
      for(int i = 0; i < xR.length; i++) {//converte do vetor xR para o vetor xI
    	  xI[i] = getXint( xR[i] );
    	  yI[i] = getYint( yR[i] );
      }
      g.setColor( Color.GREEN );
      g.drawPolygon(xI, yI, xR.length);
      
      //PARA LETRA A>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
      
      //desenho do poligono2D ORIGINAL em ROTAÇÃO
      
      //aplicar vetor
      double [] xRr, yRr;
      xRr = new double[xR.length];
      yRr = new double[yR.length];
      
      //chamando o poligono2D de rotação
      Poligono2D r1;
      for(int i = 0; i < xR.length; i++) {
    	  r1 = new Poligono2D(xR[i], yR[i]);
    	  xRr[i] = rotacao(r1, 60).x;
    	  yRr[i] = rotacao(r1, 60).y;
      }
      
      for(int i = 0; i < xR.length; i++) {
    	  xI[i] = getXint( xRr[i] );
    	  yI[i] = getYint( yRr[i] );
      }
      g.setColor( Color.RED );
      g.drawPolygon(xI, yI, xRr.length);
      
      
      //desenho do poligono2D ORIGINAL em TRANSLAÇÃO
      
      //aplicar vetor
      double [] xRt, yRt;
      xRt = new double[xRr.length];
      yRt = new double[yRr.length];
      
      //chamando o poligono2D de translação
      Poligono2D t1;
      for(int i=0; i<xRr.length; i++) {
    	  t1 = new Poligono2D(xRr[i], yRr[i]);
    	  xRt[i] = translacao(t1, 3, 2).x;
    	  yRt[i] = translacao(t1, 3, 2).y;
      }
      
      for(int i=0; i<xRr.length; i++) {
    	  xI[i] = getXint( xRt[i] );
    	  yI[i] = getYint( yRt[i] );
      }
      g.setColor( Color.BLUE );
      g.drawPolygon(xI, yI, xRt.length);
      
//desenho do poligono2D ORIGINAL em ESCALA
      
      //aplicar vetor
      double [] xRe, yRe;
      xRe = new double[xRt.length];
      yRe = new double[yRt.length];
      
      //chamando o poligono2D de escala
      Poligono2D e1;
      for(int i=0; i<xRt.length; i++) {
    	  e1 = new Poligono2D(xRt[i], yRt[i]);
    	  xRe[i] = escala(e1, 2, 2).x;
    	  yRe[i] = escala(e1, 2, 2).y;
      }
      
      for(int i=0; i<xRt.length; i++) {
    	  xI[i] = getXint( xRe[i] );
    	  yI[i] = getYint( yRe[i] );
      }
      g.setColor( Color.YELLOW );
      g.drawPolygon(xI, yI, xRe.length);
      
      //PARA LETRA B>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
      
//desenho do poligono2D ORIGINAL em ESCALA 1
      
      //aplicar vetor
      double [] xRe1, yRe1;
      xRe1 = new double[xR.length];
      yRe1 = new double[yR.length];
      
      //chamando o poligono2D de escala
      Poligono2D E1;
      for(int i=0; i<xR.length; i++) {
    	  E1 = new Poligono2D(xR[i], yR[i]);
    	  xRe1[i] = escala(E1, 2, 2).x;
    	  yRe1[i] = escala(E1, 2, 2).y;
      }
      
      for(int i=0; i < xR.length; i++) {
    	  xI[i] = getXint( xR[i] );
    	  yI[i] = getYint( yR[i] );
      }
      g.setColor( Color.PINK );
      g.drawPolygon(xI, yI, xRe1.length);
      
//desenho do poligono2D ORIGINAL em ROTAÇÃO 1
      
      //aplicar vetor
      double [] xRr1, yRr1;
      xRr1 = new double[xRe1.length];
      yRr1 = new double[yRe1.length];
      
      //chamando o poligono2D de rotação
      Poligono2D R1;
      for(int i = 0; i < xR.length; i++) {
    	  R1 = new Poligono2D(xRe1[i], yRe1[i]);
    	  xRr1[i] = rotacao(R1, 60).x;
    	  yRr1[i] = rotacao(R1, 60).y;
      }
      
      for(int i = 0; i < xR.length; i++) {
    	  xI[i] = getXint( xRr1[i] );
    	  yI[i] = getYint( yRr1[i] );
      }
      g.setColor( Color.ORANGE );
      g.drawPolygon(xI, yI, xRr1.length);
      
//desenho do poligono2D ORIGINAL em TRANSLAÇÃO 1
      
      //aplicar vetor
      double [] xRt1, yRt1;
      xRt1 = new double[xRr1.length];
      yRt1 = new double[yRr1.length];
      
      //chamando o poligono2D de translação
      Poligono2D T1;
      for(int i=0; i<xR.length; i++) {
    	  T1 = new Poligono2D(xRr1[i], yRr1[i]);
    	  xRt1[i] = translacao(T1, 3, 2).x;
    	  yRt1[i] = translacao(T1, 3, 2).y;
      }
      
      for(int i=0; i<xR.length; i++) {
    	  xI[i] = getXint( xRt1[i] );
    	  yI[i] = getYint( yRt1[i] );
      }
      g.setColor( Color.GRAY );
      g.drawPolygon(xI, yI, xRt1.length);
      
      
      
      
      
      
      
      
      
      
      
      //g.setColor(Color.BLACK);
      //for (double i=0; i<((this.getWidth()/2)/escala); i++)
    	//  g.drawLine(getXint(i), getYint(0.05), getXint(i), getYint(-0.05));
      //for (double i=0; i<((this.getWidth()/2)/escala); i--)
    	//  g.drawLine(getXint(i), getYint(0.05), getXint(i), getYint(-0.05));
      

}
}


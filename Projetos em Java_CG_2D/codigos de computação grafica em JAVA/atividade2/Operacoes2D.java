package atividadesQuest2;
public class Operacoes2D {

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
	
	public static void main(String[] args) {
		Poligono2D p1= new Poligono2D(0,0);//ponto x e y origem
		
		System.out.println(translacao(p1,3,2));
		System.out.println(escala(p1,2,2));
		System.out.println(rotacao(p1,60));
		
		Poligono2D a, b, c;
		//a = translacao(p1,3,3);
		//b = escala(a,2,2);
		//c = rotacao(b,45);
		a = rotacao(p1,60);
		b = translacao(a,3,2);
		c = escala(b,2,2);
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
		
	}



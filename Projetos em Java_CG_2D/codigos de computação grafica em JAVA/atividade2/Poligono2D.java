package atividadesQuest2;


public class Poligono2D {
	
	double x,y;//construtor

	public Poligono2D(double xv, double yv) {
		//atributos
		x = xv;
		y = yv;
		
	}
	public String toString() {//para mostrar a forma desse objeto em String
		
		//retorna as coordenadas (x;y)
		return "(" + String.format("%.2f", x) + ";" +String.format("%.2f", y)+" )" ;}

}

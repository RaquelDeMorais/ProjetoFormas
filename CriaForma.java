package formas;
import java.util.ArrayList;

public class CriaForma{

	public static void main(String[] args) {
		
		ArrayList<Figura> figuras = new ArrayList<Figura>();
			
		Retangulo retangulo = new Retangulo(3,5);
		figuras.add(retangulo);
		
		Circulo circulo = new Circulo(3);
		figuras.add(circulo);
		
		Quadrado quadrado = new Quadrado(3);
		figuras.add(quadrado);
			
		for (Figura figura : figuras){
		
			if(figura instanceof Retangulo){
			System.out.println("Retangulo Area: " + figura.calcularArea() + "Perimetro: " + figura.calcularPerimetro());
			}
			
			if(figura instanceof Circulo){
			System.out.println("Circulo Area: " + figura.calcularArea() + "Perimetro: " + figura.calcularPerimetro());
			}
			
			if(figura instanceof Quadrado){
			System.out.println("Quadrado Area: " + figura.calcularArea() + "Perimetro: " + figura.calcularPerimetro());
			}
		}
			
	}

}

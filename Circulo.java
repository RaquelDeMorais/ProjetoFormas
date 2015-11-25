package formas;

public class Circulo extends Figura{
	
	private float raio;
	private double pi = Math.PI;
		
	public Circulo(float raio){
		this.raio = raio;
	}

	public float calcularArea(){
		double retorno = pi * (raio * raio);
		return (float)retorno;
	}

	public float calcularPerimetro(){
		double retorno = 2*pi * raio;
		return  (float)retorno;
	}

}

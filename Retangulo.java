package formas;

public class Retangulo extends Figura{

	private float lado;
	private float altura;
		
	public Retangulo(float lado, float altura){
		this.lado = lado;
		this.altura = altura;
	}

	public float calcularArea(){
		return  lado * altura;
	}

	public float calcularPerimetro(){
		return (lado * 2) + (altura * 2);
	}

}

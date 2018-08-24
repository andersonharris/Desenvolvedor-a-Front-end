package Exercicio6;

public class ModelarRetangulo {

	double comprimento;
	double largura;
	double area;
	double perimetro;

	double calcularArea() {

		area = comprimento * largura;

		return area;
	}

	double calcularPerimetro() {

		perimetro = (comprimento * 2) + (largura * 2);

		return perimetro;
	}

	void imprimir() {

		System.out.println("O retangulo de largura: " + largura + "\nComprimento: " + comprimento + "\nÁrea: "
				+ calcularArea() + "\nPerimetro: " + calcularPerimetro());
	}
	
	
       
	   

}

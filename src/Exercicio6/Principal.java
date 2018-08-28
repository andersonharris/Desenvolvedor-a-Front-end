package Exercicio6;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		ModelarRetangulo r = new ModelarRetangulo();

		Scanner input = new Scanner(System.in);

		System.out.println("Informe do valor do comprimento do retângulo");
		r.comprimento = input.nextDouble();
		System.out.println("Informe do valor da largura do retângulo");
		r.largura = input.nextDouble();
		r.calcularPerimetro();
		r.calcularArea();
		
		
		
		System.out.println("O valor do perimetro é "+r.perimetro);
		System.out.println("O valor da area do Retangulo é: "+r.area);
		
		
		
	  
	}
}

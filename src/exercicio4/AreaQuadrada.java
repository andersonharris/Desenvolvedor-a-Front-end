package exercicio4;

import java.util.Scanner;

public class AreaQuadrada {
	
	public static void main (String [] args) {
		
		double area;
		double litros;
		double latas;
		
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o valor em metros quadrado a ser pintado?");
		area = input.nextDouble();
		
		litros = area/3;
		
		if(area%3 > 0) {
			
			
			litros = litros +1;
			
		}
		
		latas = litros/18;
		
		
		if(litros%18 > 0) {
			
			
			latas = latas+1;
			
		}
		if(latas > 1) {
			
			
			System.out.println("Você precisara de "+latas+" latas de tinhtas");
			System.out.println("Voce pode compra-las por "+latas * 80+" ,raeis");
			
			
		}else {
			
			
			System.out.println("Voce precisa de "+latas+" latas de tinta");
			System.out.println("Voce pode compra-las por 80 reais");
			
			
		}
	}

}

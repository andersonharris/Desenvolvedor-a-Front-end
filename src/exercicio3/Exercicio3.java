package exercicio3;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
		
	

		double salarioMinimo;
		double horasTrabalhadas;
		double valorHora;
		double salarioBruto;
		double salarioReceber = 0;
		
	
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o salario minimo");
		salarioMinimo = input.nextInt();
		System.out.println("Digite o valor das horas");
		horasTrabalhadas = input.nextDouble();
		
		
		  valorHora = salarioMinimo / horasTrabalhadas;
		  
		  System.out.println("O valor hora é "+valorHora);
		  
		  salarioBruto = horasTrabalhadas * valorHora;
		  
		  System.out.println("O salario bruto é "+salarioBruto);	
		  
		  salarioBruto = salarioBruto - (salarioBruto /30); 
		  
		  System.out.println("O salario a receber é "+salarioBruto);
	
		  
	
		  
		}
	

		
		 
		
		
		
	}



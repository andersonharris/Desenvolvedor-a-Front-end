package Exercicio5;

import java.util.Scanner;

public class ContaPrincipal {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		ContaCorrente conta = new ContaCorrente(null, 0, 0.0);

		System.out.println("Digite seu nome");
		conta.setNomeDoCorrentista(input.nextLine());
		System.out.println("Numero da conta");
		conta.setNumeroDaConta(input.nextInt());
		System.out.println("Digite o valor do saldo");
		conta.setSaldo(input.nextDouble());

		while(true) {
			
			System.out.println("Digite: \n 1= Para Sacar\n 2=Para Depositar\n 3=Outro numero para sair\n");
			
			
			
			switch (input.nextInt()) {
			case 1:
				System.out.println("Qual o valor deseja sacar, senhor(a): "+conta.getNomeDoCorrentista());
				if (conta.sacar(input.nextDouble())) {
					System.out.println("\nSaque realizado com suceso\n");
				} else {
					System.out.println("\nLimite insuficiente\n");
				}
				break;
				
				
			case 2:
				System.out.println("Qual o valor deseja sacar, senhor(a): "+conta.getNomeDoCorrentista());
				if (conta.depositar(input.nextDouble())) {
					System.out.println("Saque realizado com suceso\n "+conta.getNomeDoCorrentista());
				} else {
					System.out.println("Valor invlido\n");
				}
				break;
			case 3:
				
				System.out.println("Deseja fazer mais alguma alteração senhor(a) "+conta.getNomeDoCorrentista());
				if(conta.getSaldo().equals(0)) {
					
					System.out.println("Conta finalizada com sucesso");
					break;
				}
				
				break;
				
			
				
			}
			System.out.println("Senhor(a) "+conta.getNomeDoCorrentista()+"Saldo atual: " + conta.getSaldo());
		}
	}

}

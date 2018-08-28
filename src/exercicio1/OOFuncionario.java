package exercicio1;

public class OOFuncionario {
	
	double aumento = 1.5;
	double salario = 1000;
	double ano = 2005; //criação das variáveis
	
	
	
	public void  CalcularSalarioAtual() {
		
		for(int i = 2005; i<=2007;i++) {
			
			
			salario = salario + (salario * aumento / 100); // 1000 + 1.5%
            aumento = aumento * 2; // 1.5% * 2
            ano++;
            
		}
		
		
		
	}


}

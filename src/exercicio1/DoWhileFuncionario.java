
import java.text.DecimalFormat;
import java.util.Scanner;

public class DoWhileFuncionario {

    public static void main(String[] args){
       
    	

        
        
        double aumento = 1.5;
        double salario = 1000; 
        double ano = 2005; //criação das variáveis
        
       
        
        
        
        do{
            salario = salario + (salario * aumento / 100); // 1000 + 1.5%
            aumento = aumento * 2; // 1.5% * 2
            ano++; // ano + 1
        }while(ano <= 2007); // enquanto for menor ou igual a 2007, faça
        
       System.out.println("O salario atual é: " +salario); // imprime o salário
    }
}

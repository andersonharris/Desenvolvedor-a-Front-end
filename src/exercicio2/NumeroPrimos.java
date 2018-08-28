package exercicio2;


import java.util.Scanner;

public class NumeroPrimos {

	

	public static void main(String[] args) {

		  int numeros[] = null;
		
		
		    Scanner leitor = new Scanner(System.in);
	        System.out.println("Digite um numero: ");
	        int num = leitor.nextInt();
	        int primo = 0;
	        
	        for(int i = 2; i < num;i++){
	            if(num%i==0){
	                primo = 1;
	            }
	        }
	        
	        
	        
	        if(primo==0){
	            System.out.println("primo");
	        }
	        else{
	            System.out.println("Nao primo");
	        }
	    }

	
		
	   }
	 
	

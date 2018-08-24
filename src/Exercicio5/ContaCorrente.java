package Exercicio5;

public class ContaCorrente {

	private int numeroDaConta;
	private String nomeDoCorrentista;
	private Double saldo;

	public ContaCorrente(String nome, Integer numero, Double saldo) {
		super();
		this.nomeDoCorrentista = nome;
		this.numeroDaConta = numero;
		this.saldo = saldo;
	}

	public int getNumeroDaConta() {
		return numeroDaConta;
	}

	public void setNumeroDaConta(int numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}

	public String getNomeDoCorrentista() {
		return nomeDoCorrentista;
	}

	public void setNomeDoCorrentista(String nomeDoCorrentista) {
		this.nomeDoCorrentista = nomeDoCorrentista;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public boolean AlterarNome(String nomeDoCorrentista) {
		if(true) {
			
			this.nomeDoCorrentista = nomeDoCorrentista;
			return true;
			
		}
		return false;
	}

	public Boolean depositar(Double valor) {

		if (valor > 0) {
			saldo = saldo + valor;
			return true;
		}
		return false;

	}

	public Boolean sacar(Double valor) {
		if (saldo - valor >= 0 && valor >= 0) {
			saldo = saldo - valor;
			return true;
		}
		return false;
	}

}

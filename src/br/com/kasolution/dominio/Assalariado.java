package br.com.kasolution.dominio;

public class Assalariado extends Funcionario {
	//classe especialista herda tudo da superclasse exceto constudores
	
	private double salarioSemanal;

	public Assalariado() {
	
	}

	
	public Assalariado(String nome, String sobrenome, String cpf, double salarioSemanal) {
		super(nome, sobrenome, cpf);
		this.salarioSemanal = salarioSemanal;
	}


	public double getSalarioSemanal() {
		return salarioSemanal;
	}


	public void setSalarioSemanal(double salarioSemanal) {
		this.salarioSemanal = salarioSemanal;
	}


	@Override
	public String toString() {
		String info = "Assalariado \n";
		info += super.toString();
		return info;
	}	
	
	@Override
	public double calculaValorPagamento() {
		return 0;
	}
	

}

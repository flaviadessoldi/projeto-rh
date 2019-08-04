package br.com.kasolution.dominio;

public class Horista extends Funcionario {
		
	private double salarioHora;
	private int horas;

	public Horista() {
	
	}

	
	public Horista(String nome, String sobrenome, String cpf, double salarioHora, int horas) {
		super(nome, sobrenome, cpf);
		this.salarioHora = salarioHora;
		this.horas = horas;
	}


	public double getSalarioSemanal() {
		return salarioHora;
	}


	public void setSalarioSemanal(double salarioSemanal) {
		this.salarioHora = salarioHora;
	}	
	
	@Override
	public String toString() {
		String info = "Horista\n";
		info += super.toString();
		return info;
	}	
	
	@Override
	public double calculaValorPagamento() {
		return horas * salarioHora;
	}
	
}

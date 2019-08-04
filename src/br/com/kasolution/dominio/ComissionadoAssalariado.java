package br.com.kasolution.dominio;

import br.com.kasolution.dominio.Comissionado;
import br.com.kasolution.dominio.Funcionario;

public class ComissionadoAssalariado extends Comissionado{
	
	private double salarioMensal;
	
	public ComissionadoAssalariado() {
		// TODO Auto-generated constructor stub
	}

	public ComissionadoAssalariado(String nome, String sobrenome, String cpf, double vendaBruta,
			int porcentagemComissao, double salarioMensal) {
		super(nome, sobrenome, cpf, vendaBruta, porcentagemComissao);
		this.salarioMensal = salarioMensal;
	}

	public double getSalarioMensal() {
		return salarioMensal;
	}

	public void setSalarioMensal(double salarioMensal) {
		this.salarioMensal = salarioMensal;
	}
	

	@Override
	public String toString() {
		String info = "Assalariado" + super.toString();
		return info;
	}	
	
	@Override
	public double calculaValorPagamento() {
			return 4.5 * getSalarioSemanal();
	}
}

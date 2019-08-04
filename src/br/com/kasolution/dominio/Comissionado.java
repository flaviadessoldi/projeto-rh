package br.com.kasolution.dominio;

import br.com.kasolution.dominio.Funcionario;

public class Comissionado extends Funcionario {
		
		private double vendaBruta;
		private int porcentagemComissao;

		public Comissionado() {
		
		}

		
		public Comissionado(String nome, String sobrenome, String cpf, double vendaBruta, int porcentagemComissao) {
			super(nome, sobrenome, cpf);
			this.vendaBruta = vendaBruta;
			this.porcentagemComissao = porcentagemComissao;
		}


		public double getSalarioSemanal() {
			return vendaBruta;
		}


		public void setSalarioSemanal(double salarioSemanal) {
			this.vendaBruta = vendaBruta;
		}	
		
		@Override
		public String toString() {
			String info = "Comissionado\n";
			info += super.toString();
			return info;
		}	
		
		@Override
		public double calculaValorPagamento() {
			return vendaBruta * porcentagemComissao;
		}
	}
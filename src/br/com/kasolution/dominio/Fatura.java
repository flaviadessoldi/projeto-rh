package br.com.kasolution.dominio;

public class Fatura implements Pagavel{
	
	private String descricao;
	private int quantidade;
	private int valorUnitario;

	public Fatura(String descricao, int quantidade, int valorUnitario) {
		super();
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.valorUnitario = valorUnitario;
	}

	
	
	public Fatura() {
		
	}

	@Override
	public double calculaValorPagamento() {
		// TODO Auto-generated method stub
		return 0;
	}
}

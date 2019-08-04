package br.com.kasolution.dominio;

import java.text.NumberFormat;

public abstract class Funcionario implements Pagavel {
	private String nome;
	private String sobrenome;
	private String cpf;
	
	public Funcionario() {
		
	}

	public Funcionario(String nome, String sobrenome, String cpf) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override //anotations devem ser usados na linguagem Java
	public String toString() {
		String info = "Nome: " + nome;
		info += "\nSobrenome: " + sobrenome;
		info += "\nCPF: " + cpf;
		info += "\nSalário: " + NumberFormat.getCurrencyInstance().format(calculaValorPagamento());
		return info;
	}

	public abstract double calculaValorPagamento();
}

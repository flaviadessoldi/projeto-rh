package br.com.kasolution.teste;

import java.util.ArrayList;
import br.com.kasolution.dominio.Funcionario;
import br.com.kasolution.dados.BDFuncionario;


public class TesteBDFuncionario {

	public static void main (String[] args) {
	ArrayList<Funcionario> funcs = BDFuncionario.getFuncionarios();
	for (Funcionario f : funcs) {
			System.out.println("Funcionario: " + f.toString());
		}
	}
}

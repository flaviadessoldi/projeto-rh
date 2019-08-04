package br.com.kasolution.dados;

import java.util.ArrayList;

import br.com.kasolution.dominio.Assalariado;
import br.com.kasolution.dominio.Comissionado;
import br.com.kasolution.dominio.ComissionadoAssalariado;
import br.com.kasolution.dominio.Funcionario;
import br.com.kasolution.dominio.Horista;

public class BDFuncionario {

	public static ArrayList<Funcionario> getFuncionarios(){
		ArrayList<Funcionario> funcionarios = new ArrayList<>();
		funcionarios.add(new Assalariado("Victor", "Souza", "154.141.910-34", 7500.00));
		
		funcionarios.add(new Comissionado("Marcelo", "Oliveira", "519.529.130-13", 4500.00, 10));
		
		funcionarios.add(new Horista("Cintia", "Castro", "822.170.190-40", 100, 120));
		
		funcionarios.add(new ComissionadoAssalariado("Jaqueline", "Costa", "055.831.830-47", 60_000.00, 10, 3500));
		
		return funcionarios;
		
	}//fim main
	
}//fim classe
		 
		 
		




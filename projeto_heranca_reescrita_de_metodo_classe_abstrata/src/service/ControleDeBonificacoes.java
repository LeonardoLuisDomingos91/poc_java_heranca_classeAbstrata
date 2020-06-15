package service;

import model.Funcionario;

public class ControleDeBonificacoes {
	
	private double totalDeBonificacoes;
	
	public double getTotalDeBonificacoes() {
		return totalDeBonificacoes;
	}
	
	//Esse método faz a soma de bonificação de todos os funcionarios da empresa ele recebe um funcionario aqui fazemos uso
	//do polimorfismo ja que todo funcionario é filho ou neto dessa classe e implementa o metodo getBonificação
	public void somaBonificacoes(Funcionario f) {
		
		this.totalDeBonificacoes += f.getBoificacoes();
	}

}

package model;

public class Gerente extends Funcionario{
	
	private int senha;

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	@Override
	public double getBoificacoes() {
		return  this.salario  * 0.15;
		
	}
}

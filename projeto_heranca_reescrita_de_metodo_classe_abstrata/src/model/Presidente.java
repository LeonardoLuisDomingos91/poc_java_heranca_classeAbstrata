package model;

public class Presidente extends Funcionario{

	@Override
	public double getBoificacoes() {
		return this.salario * 0.20;
	}
}

package model;

//essa classe extende de Secretaria que é uma classe abstrata 
public class SecretariaAgencia extends Secretaria{
	
	@Override
	public double getBoificacoes() {
		return  this.salario  * 0.05;
		
	}
}

package model;

//essa classe extende de Secretaria que é uma classe abstrata 
public class SecretariaAdministrativa extends Secretaria{
	
	@Override
	public double getBoificacoes() {
		return  this.salario  * 0.12;
		
	}
}

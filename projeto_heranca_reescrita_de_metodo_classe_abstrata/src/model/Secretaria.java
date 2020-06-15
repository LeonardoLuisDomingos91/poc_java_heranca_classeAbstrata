package model;

//Essa classe Secretaria extende de Gerente q possui o método getBonificações por isso não temos a necessidade
// de reescrever o método nela basta colocar ela como abstract que suas filhas implementando o método 
//getBonificacoes() o polimorfismo funcionara
// nesse caso, não precisamos nem ao menos escrever o método abstrato getBonificacao na classe Secretaria.
public abstract class Secretaria extends Gerente{
	

}

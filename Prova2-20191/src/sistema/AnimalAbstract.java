package sistema;

import Interface.AnimalInterface;

public abstract class AnimalAbstract implements AnimalInterface{
	protected int idade;
	protected double peso;
	protected String tamanho;
	private int id;
	
	public AnimalAbstract(String tamanho, double peso, int id) {
		this.idade = 0;
		this.peso = peso;
		this.tamanho = tamanho;
		this.id = id;
	}
	
	public String exibirAnimal() {
		return this.id + " - " + this.peso + " - " + this.idade + " - " + this.tamanho;
	}
	
	public void crescer() {
		this.idade += 1;
	}
	
	public int getId() {
		return this.id;
	}



}

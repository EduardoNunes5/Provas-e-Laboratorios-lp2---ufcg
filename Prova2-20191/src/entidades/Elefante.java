package entidades;

import sistema.AnimalAbstract;

public class Elefante extends AnimalAbstract{

	
	public Elefante(int id) {
		super("G", 120.0, id);
	}
	
	public String toString() {
		return "FANTE " + super.exibirAnimal();
	}
	
	public void crescer() {
		super.crescer();
		alteraPeso();		
	}
	private void alteraPeso() {
		if(this.idade <= 20) 
			this.peso += 250.0;
	}
}

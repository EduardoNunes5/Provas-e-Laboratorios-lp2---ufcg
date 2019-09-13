package entidades;

import sistema.AnimalAbstract;

public class Morcego extends AnimalAbstract {
	
	
	public Morcego(int id) {
		super("P", 0.002, id);
	}
	
	public String toString() {
		return "BAT " + super.exibirAnimal();
	}
	
	public void crescer() {
		super.crescer();
		alteraPeso();
	}
	
	private void alteraPeso() {
		this.peso += 0.002;
	}

}

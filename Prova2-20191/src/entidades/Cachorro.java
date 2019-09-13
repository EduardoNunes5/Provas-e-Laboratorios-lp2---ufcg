package entidades;

import sistema.AnimalAbstract;

public class Cachorro extends AnimalAbstract {

	
	public Cachorro(int id) {
		super("P", 0.4, id);
	}
	
	public String toString() {
		return "CAO " + super.exibirAnimal();
	}
	
	public void crescer() {
		super.crescer();
		alteraPeso();
	}
	
	private void alteraPeso() {
		this.peso += 0.7;
		setTamanho();
	}
	
	private void setTamanho() {
		if (this.peso > 10.0) {
			this.tamanho = "M";
		}
		
	}

}

package sistema;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import Interface.Estrategia;
import entidades.Cachorro;
import entidades.Elefante;
import entidades.Morcego;

public class SimulalController {
	private Map<Integer, AnimalAbstract> animais;
	private int id;
	private Estrategia estrategiaRemocao;
	
	
	public SimulalController() {
		this.animais = new HashMap<>();
		this.id = 1;
		
	}
	
	public int cadastrarCachorroFilhote() {
		this.animais.put(this.id, new Cachorro(this.id));
		this.id += 1;
		return this.id;
		
	}
	
	public int cadastrarElefanteFilhote() {
		this.animais.put(this.id, new Elefante(this.id));
		this.id += 1;
		return this.id;
	}
	
	public int cadastrarMorcegoFilhote() {
		this.animais.put(this.id, new Morcego(this.id));
		this.id += 1;
		return this.id;
	}
	
	public String exibirAnimal(int id) {
		if(id <= 0)
			throw new IllegalArgumentException ("ID para exibicao invalido");
		return this.animais.get(id).toString();
	}
	
	public void crescer(int id) {
		this.animais.get(id).crescer();
	}
	
	public void configurarRemocao(String estrategia) {
		if (estrategia.equals("PESO")) {
			this.estrategiaRemocao = new EstrategiaPeso();
		}
		else {
			if (estrategia.equals("IDADE")){
			this.estrategiaRemocao = new EstrategiaIdade();
			}
		}
	}
	

	public int remover() {
		Set<AnimalAbstract> animaisC = new HashSet<>();
		animaisC.addAll(this.animais.values());
		AnimalAbstract animalRemovido = Collections.max(animaisC, this.estrategiaRemocao);
		int idAnimal = this.animais.get(animalRemovido.getId()).getId();
		this.animais.remove(idAnimal);
		return idAnimal;
		
		
		
	}

}

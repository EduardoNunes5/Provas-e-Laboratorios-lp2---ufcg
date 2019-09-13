package testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import sistema.SimulalController;

class TestaSimulal {
	
	private SimulalController sc;
	@BeforeEach
	void criaSimulal() {
		this.sc = new SimulalController(); 
		this.sc.cadastrarCachorroFilhote();//1
		this.sc.cadastrarMorcegoFilhote();//2
		this.sc.cadastrarElefanteFilhote();//3
		this.sc.cadastrarCachorroFilhote();//4
		this.sc.cadastrarCachorroFilhote();//5
		
	}
	@Test
	void testaRepresentacaoCachorro() {
		assertEquals("CAO 1 - 0.4 - 0 - P", this.sc.exibirAnimal(1).toString());
		
	}
	
	@Test
	void testaRepBat() {
		assertEquals("BAT 2 - 0.002 - 0 - P", this.sc.exibirAnimal(2).toString());
		
	}
	
	@Test
	void testaRepFANTE() {
		assertEquals("FANTE 3 - 120.0 - 0 - G", this.sc.exibirAnimal(3).toString());
		
	}
	
	@Test
	void testaRemocao() {
		this.sc.crescer(5);
		System.out.println(this.sc.remover());
		assertEquals(5, this.sc.remover());
	}

}

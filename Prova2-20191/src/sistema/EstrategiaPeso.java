package sistema;

import Interface.Estrategia;

public class EstrategiaPeso implements Estrategia{


	@Override
	public int compare(AnimalAbstract o1, AnimalAbstract o2) {
		if (o1.peso <= o2.peso) {
			return -1;
		}
		else {
			return 1;
		}
	}

}

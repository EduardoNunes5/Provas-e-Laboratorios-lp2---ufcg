package sistema;

import Interface.Estrategia;

public class EstrategiaIdade implements Estrategia{

	@Override
		public int compare(AnimalAbstract o1, AnimalAbstract o2) {
			if (o1.idade <= o2.idade) {
				return -1;
			}
			else {
				return 1;
			}
		}
}

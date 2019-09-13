package Interface;

import java.util.Comparator;

import sistema.AnimalAbstract;

public interface Estrategia extends Comparator<AnimalAbstract> {
	
	public int compare(AnimalAbstract o1, AnimalAbstract o2);

}

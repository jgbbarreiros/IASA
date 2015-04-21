package pee;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MemoriaPrioridade<E extends Estado> extends MemoriaProcura<E> {

	public MemoriaPrioridade(Comparator<No<E>> comparator) {
		super(new PriorityQueue<No<E>>(1, comparator));
	}
	
}

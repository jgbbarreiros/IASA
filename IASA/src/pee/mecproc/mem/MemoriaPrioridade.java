package pee.mecproc.mem;

import java.util.Comparator;
import java.util.PriorityQueue;

import pee.mecproc.No;
import pee.modprob.Estado;

public class MemoriaPrioridade<E extends Estado> extends MemoriaProcura<E> {

	public MemoriaPrioridade(Comparator<No<E>> comparator) {
		super(new PriorityQueue<No<E>>(1, comparator));
	}
	
}

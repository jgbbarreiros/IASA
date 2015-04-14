package pee;

import java.util.LinkedList;

public class MemoriaFIFO<E extends Estado> extends MemoriaProcura<E> {

	public MemoriaFIFO() {
		super(new LinkedList<No<E>>());
	}

}

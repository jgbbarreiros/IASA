package pee;

import java.util.Collections;
import java.util.LinkedList;

public class MemoriaLIFO<E extends Estado> extends MemoriaProcura<E> {

	public MemoriaLIFO() {
		super(Collections.asLifoQueue(new LinkedList<No<E>>()));
	}

}

package pee.mecproc.mem;

import java.util.Collections;
import java.util.LinkedList;

import pee.mecproc.No;
import pee.modprob.Estado;

public class MemoriaLIFO<E extends Estado> extends MemoriaProcura<E> {

	public MemoriaLIFO() {
		super(Collections.asLifoQueue(new LinkedList<No<E>>()));
	}

}

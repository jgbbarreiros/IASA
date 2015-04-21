package pee.mecproc.mem;

import java.util.LinkedList;

import pee.mecproc.No;
import pee.modprob.Estado;

public class MemoriaFIFO<E extends Estado> extends MemoriaProcura<E> {

	public MemoriaFIFO() {
		super(new LinkedList<No<E>>());
	}

}

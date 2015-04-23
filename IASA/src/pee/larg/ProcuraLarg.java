package pee.larg;

import pee.mecproc.MecanismoProcura;
import pee.mecproc.mem.MemoriaFIFO;
import pee.mecproc.mem.MemoriaProcura;
import pee.modprob.Estado;
import pee.modprob.Problema;

public class ProcuraLarg<E extends Estado> extends MecanismoProcura<E, Problema<E>> {

	@Override
	protected MemoriaProcura<E> iniciarMemoria() {
		return new MemoriaFIFO<E>();
	}

}

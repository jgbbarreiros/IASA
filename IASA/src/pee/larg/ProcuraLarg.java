package pee.larg;

import pee.mecproc.MecanismoProcura;
import pee.mecproc.mem.MemoriaFIFO;
import pee.mecproc.mem.MemoriaProcura;
import pee.modprob.Estado;
import pee.modprob.Problema;

public class ProcuraLarg<E extends Estado, P extends Problema<E>> extends MecanismoProcura<E, P> {

	@Override
	protected MemoriaProcura<E> iniciarMemoria() {
		return new MemoriaFIFO<E>();
	}

}

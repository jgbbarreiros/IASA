package pee.prof;

import pee.mecproc.MecanismoProcura;
import pee.mecproc.mem.MemoriaLIFO;
import pee.mecproc.mem.MemoriaProcura;
import pee.modprob.Estado;
import pee.modprob.Problema;

public class ProcuraProf<E extends Estado> extends MecanismoProcura<E, Problema<E>> {
	
	@Override
	protected MemoriaProcura<E> iniciarMemoria() {
		return new MemoriaLIFO<E>();
	}

}

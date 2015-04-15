package pee;

public class ProcuraProf<E extends Estado> extends MecanismoProcura<E> {
	
	@Override
	protected MemoriaProcura<E> iniciarMemoria() {
		return new MemoriaLIFO<E>();
	}

}

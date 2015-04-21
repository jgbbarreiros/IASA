package pee;

public class ProcuraLarg<E extends Estado> extends MecanismoProcura<E> {

	@Override
	protected MemoriaProcura<E> iniciarMemoria() {
		return new MemoriaFIFO<E>();
	}

}

package pee;

import java.util.Comparator;

public abstract class ProcuraMelhorPrim<E extends Estado> extends MecanismoProcura<E> implements Comparator<No<E>> {

	@Override
	protected MemoriaProcura<E> iniciarMemoria() {
		return new MemoriaPrioridade<E>(this);
	}

	@Override
	public int compare(No<E> no1, No<E> no2) {
		return Double.compare(F(no1), F(no2));
	}
	
	protected abstract double F(No<E> no);

}

package pee;

import java.util.Comparator;

public class ProcuraMelhorPrim<E extends Estado> extends MecanismoProcura<E> implements Comparator<No<E>> {

	@Override
	protected MemoriaProcura<E> iniciarMemoria() {
		return new MemoriaPrioridade<E>(this);
	}

	@Override
	public int compare(No<E> no1, No<E> no2) {
		// TODO Auto-generated method stub
		return 0;
	}

}

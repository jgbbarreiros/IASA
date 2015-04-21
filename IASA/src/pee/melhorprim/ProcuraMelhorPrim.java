package pee.melhorprim;

import java.util.Comparator;

import pee.mecproc.MecanismoProcura;
import pee.mecproc.No;
import pee.mecproc.mem.MemoriaPrioridade;
import pee.mecproc.mem.MemoriaProcura;
import pee.modprob.Estado;
import pee.modprob.Problema;

public abstract class ProcuraMelhorPrim<E extends Estado, P extends Problema<E>> extends MecanismoProcura<E, P> implements Comparator<No<E>> {

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

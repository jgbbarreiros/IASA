package pee.melhorprim;

import pee.mecproc.No;
import pee.modprob.Estado;
import pee.modprob.ProblemaHeur;

public class ProcuraSofrega<E extends Estado> extends ProcuraMelhorPrim<E, ProblemaHeur<E>> {

	@Override
	protected double F(No<E> no) {
		return problema.heuristica(no.getEstado());
	}
	
}

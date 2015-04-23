package pee.melhorprim;

import pee.mecproc.No;
import pee.modprob.Estado;
import pee.modprob.ProblemaHeur;

public class ProcuraAA<E extends Estado, P extends ProblemaHeur<E>> extends ProcuraMelhorPrim<E, ProblemaHeur<E>> {

	@Override
	protected double F(No<E> no) {
		return no.getCusto() + problema.heuristica(no.getEstado());
	}
}

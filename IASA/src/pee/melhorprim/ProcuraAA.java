package pee.melhorprim;

import pee.mecproc.No;
import pee.modprob.Estado;
import pee.modprob.ProblemaHeur;

public class ProcuraAA<E extends Estado> extends ProcuraMelhorPrim<E, ProblemaHeur<E>> {

	@Override
	protected double F(No<E> no) {
		return no.getCusto() + problema.heuristica(no.getEstado());
	}
}

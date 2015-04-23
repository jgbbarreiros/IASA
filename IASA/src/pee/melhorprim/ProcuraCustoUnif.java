package pee.melhorprim;

import pee.mecproc.No;
import pee.modprob.Estado;
import pee.modprob.Problema;

public class ProcuraCustoUnif<E extends Estado> extends ProcuraMelhorPrim<E, Problema<E>> {

	@Override
	protected double F(No<E> no) {
		return no.getCusto();
	}
	
}

package pee.melhorprim;

import pee.mecproc.No;
import pee.modprob.Estado;
import pee.modprob.Problema;

public class ProcuraCustoUnif<E extends Estado, P extends Problema<E>> extends ProcuraMelhorPrim<E, P> {

	@Override
	protected double F(No<E> no) {
		return no.getCusto();
	}
	
}

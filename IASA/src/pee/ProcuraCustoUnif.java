package pee;

public class ProcuraCustoUnif<E extends Estado> extends ProcuraMelhorPrim<E> {

	@Override
	protected double F(No<E> no) {
		return no.getCusto();
	}
	
	

}

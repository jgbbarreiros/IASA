package pee.prof;

import pee.mecproc.Solucao;
import pee.modprob.Estado;
import pee.modprob.Problema;

public class ProcuraProfIter<E extends Estado> extends ProcuraProf<E> {
	
	@Override
	public Solucao<E> procurar(Problema<E> problema, int profMax) {
		return procurar(problema, profMax, 1);
	}
	
	public Solucao<E> procurar(Problema<E> problema, int profMax, int incProf) {
		for(int profMaxIter = incProf; profMaxIter <= profMax; profMaxIter += incProf) {
			Solucao<E> solucao = super.procurar(problema, profMaxIter);
			if (solucao != null)
				return solucao;
		}
		return null;
	}
}

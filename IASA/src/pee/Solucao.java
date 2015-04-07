package pee;

import java.util.Iterator;
import java.util.LinkedList;

public class Solucao<E extends Estado> implements Iterable<No<E>> {
	
	private LinkedList<No<E>> percurso;
	
	public Solucao() {
		this.percurso = new LinkedList<No<E>>();
	}
	
	@Override
	public Iterator<No<E>> iterator() {
		return percurso.iterator();
	}

	public void juntarInicio(No<E> no) {
		percurso.addFirst(no);
	}
	
}

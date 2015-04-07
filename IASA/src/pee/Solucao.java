package pee;

import java.util.Iterator;
import java.util.LinkedList;

public class Solucao implements Iterable<No> {
	
	private LinkedList<No> percurso;
	
	public Solucao() {
		this.percurso = new LinkedList<No>();
	}
	
	@Override
	public Iterator<No> iterator() {
		return percurso.iterator();
	}

	public void juntarInicio(No no) {
		percurso.addFirst(no);
	}
	
}

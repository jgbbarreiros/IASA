package pee;

import java.util.LinkedList;

public class MemoriaProcura<E extends Estado> {
	
	private LinkedList<No<E>> fronteira;
	
	public MemoriaProcura() {
		this.fronteira = new LinkedList<No<E>>();
	}

	public void limpar() {
		fronteira.clear();
	}
	
	public void inserir(No<E> no) {
		fronteira.add(0, no);
	}
	
	public No<E> remover() {
		return fronteira.removeFirst();
	}
	
	public boolean fronteiraVazia() {
		return fronteira.isEmpty();
	}
}

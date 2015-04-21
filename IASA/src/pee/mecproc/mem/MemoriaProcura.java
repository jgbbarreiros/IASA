package pee;

import java.util.Queue;

public class MemoriaProcura<E extends Estado> {
	
	private Queue<No<E>> fronteira;
	
	public MemoriaProcura(Queue<No<E>> fronteira) {
		this.fronteira = fronteira;
	}

	public void limpar() {
		fronteira.clear();
	}
	
	public void inserir(No<E> no) {
		fronteira.add(no);
	}
	
	public No<E> remover() {
		return fronteira.poll();
	}
	
	public boolean fronteiraVazia() {
		return fronteira.isEmpty();
	}
}

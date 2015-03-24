package pee;

import java.util.LinkedList;

public class MemoriaProcura {
	
	private LinkedList<No> fronteira;
	
	public void limpar() {
		fronteira.clear();
	}
	
	public void inserir(No no) {
		fronteira.add(0, no);
	}
	
	public No remover() {
		return fronteira.removeFirst();
	}
	
	public boolean fronteiraVazia() {
		return fronteira.isEmpty();
	}
}

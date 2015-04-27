package pee.mecproc.mem;

import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

import pee.mecproc.No;
import pee.modprob.Estado;

public class MemoriaProcura<E extends Estado> {
	
	private Queue<No<E>> fronteira;
	private Map<E, No<E>> explorados = new HashMap<E, No<E>>();
	private int numMaxNos = 0;
	private int numNosExp = 0;
	
	public MemoriaProcura(Queue<No<E>> fronteira) {
		this.fronteira = fronteira;
	}

	public void limpar() {
		fronteira.clear();
		explorados.clear();
	}
	
	public void inserir(No<E> no) {
		E estado = no.getEstado();
		No<E> noMem = explorados.get(estado);
		if (noMem == null ? true : no.getCusto() < noMem.getCusto()) {
			fronteira.add(no);
			explorados.put(estado, no);
			if (fronteira.size() > numMaxNos)
				numMaxNos = fronteira.size();
		}
		numNosExp++;
	}
	
	public No<E> remover() {
		return fronteira.poll();
	}
	
	public boolean fronteiraVazia() {
		return fronteira.isEmpty();
	}
	
	public int getNumMaxNos() {
		return numMaxNos;
	}
	
	public int getNumNosExp() {
		return numNosExp;
	}
}

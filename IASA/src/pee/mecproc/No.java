package pee.mecproc;

import pee.modprob.Estado;
import pee.modprob.Operador;

public class No<E extends Estado> {
	
	private E estado;
	private Operador<E> operador;
	private No<E> antecessor;
	private int profundidade;
	private Double custo;
	
	public No(E estado) {
		this.estado = estado;
		this.operador = null;
		this.antecessor = null;
		profundidade = 0;
		custo = 0.0;
	}
	
	public No(E estado, Operador<E> operador, No<E> antecessor) {
		this(estado);
		this.operador = operador;
		this.antecessor = antecessor;
		profundidade = antecessor.getProfundidade() + 1;
//		custo = antecessor.getCusto() + operador.custo(antecessor.getEstado(), estado);
	}

	public E getEstado() {
		return estado;
	}
	
	public Operador<E> getOperador() {
		return operador;
	}
	
	public No<E> getAntecessor() {
		return antecessor;
	}
	
	public int getProfundidade() {
		return profundidade;
	}
	
	public Double getCusto() {
		return custo;
	}
	
}

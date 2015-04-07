package pee;

public class No<E extends Estado> {
	
	private E estado;
	private Operador<E> operador;
	private No<E> antecessor;
	
	public No(E estado) {
		this.estado = estado;
		this.operador = null;
		this.antecessor = null;
	}
	
	public No(E estado, Operador<E> operador, No<E> antecessor) {
		this(estado);
		this.operador = operador;
		this.antecessor = antecessor;
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
	
}

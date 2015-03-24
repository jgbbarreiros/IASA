package pee;

public class No {
	
	private Estado estado;
	private Operador operador;
	private No antecessor;
	
	public No(Estado estado) {
		this.estado = estado;
	}
	
	public No(Estado estado, Operador operador, No antecessor) {
		this.estado = estado;
		this.operador = operador;
		this.antecessor = antecessor;
	}

	public Estado getEstado() {
		return estado;
	}
	
	public Operador getOperador() {
		return operador;
	}
	
	public No getAntecessor() {
		return antecessor;
	}
	
}

package pee.modprob;

public abstract class Problema<E extends Estado> {
	
	private E estadoInicial;
	private Operador<E>[] operadores;
	
	public Problema(E estadoInicial, Operador<E>[] operadores) {
		this.estadoInicial = estadoInicial;
		this.operadores = operadores;
	}
	
	public abstract boolean objectivo(E estado);

	public E getEstadoInicial() {
		return estadoInicial;
	}
	
	public Operador<E>[] getOperadores() {
		return operadores;
	}
	
	
}

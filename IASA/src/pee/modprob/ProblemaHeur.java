package pee.modprob;

public abstract class ProblemaHeur<E extends Estado> extends Problema<E> {

	public ProblemaHeur(E estadoInicial, Operador<E>[] operadores) {
		super(estadoInicial, operadores);
	}

	public abstract double heuristica(E estado);
	
}

package pee;

public abstract class Problema {
	
	private Estado estadoInicial;
	private Operador[] operadores;
	
	public Problema(Estado estadoInicial, Operador[] operadores) {
		this.estadoInicial = estadoInicial;
		this.operadores = operadores;
	}
	
	public abstract boolean objectivo(Estado estado);

	public Estado getEstadoInicial() {
		return estadoInicial;
	}
	
	public Operador[] getOperadores() {
		return operadores;
	}
	
	
}

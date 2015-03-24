package pee;

public class Problema {
	
	private Estado estadoInicial;
	private Operador[] operadores;
	
	public Problema(Estado estadoInicial, Operador[] operadores) {
		this.estadoInicial = estadoInicial;
		this.operadores = operadores;
	}
	
	public boolean objectivo(Estado estado) {
		return false;
	}

	public Estado getEstadoInicial() {
		return estadoInicial;
	}
	
	public Operador[] getOperadores() {
		return operadores;
	}
	
	
}

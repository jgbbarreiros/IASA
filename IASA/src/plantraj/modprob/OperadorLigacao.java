package plantraj.modprob;

import pee.Estado;
import pee.Operador;

public class OperadorLigacao implements Operador {
	
	private Estado estadoOrigem;
	private Estado estadoDestino;
	private float custo;

	public OperadorLigacao(String locOrigem, String locDestino, float custo) {
		estadoOrigem = new EstadoLocalidade(locOrigem);
		estadoDestino = new EstadoLocalidade(locDestino);
		this.custo = custo;
	}
	
	@Override
	public Estado aplicar(Estado estado) {
		if (estado.equals(estadoOrigem))
			return estadoDestino;
		return null;
	}

}

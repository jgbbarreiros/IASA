package plantraj.modprob;

import pee.Estado;
import pee.Operador;

public class OperadorLigacao implements Operador {
	
	private Estado estadoOrigem;
	private Estado estadoDestino;
	private Float custo;

	public OperadorLigacao(String locOrigem, String locDestino, Float custo) {
		estadoOrigem = new EstadoLocalidade(locOrigem);
		estadoDestino = new EstadoLocalidade(locDestino);
		this.custo = custo;
	}
	
	@Override
	public Estado aplicar(Estado estado) {
		if (estado.equals(estadoOrigem));
			
		return null;
	}

}

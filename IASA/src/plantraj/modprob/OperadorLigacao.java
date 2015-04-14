package plantraj.modprob;

import pee.Operador;

public class OperadorLigacao implements Operador<EstadoLocalidade> {
	
	private EstadoLocalidade estadoOrigem;
	private EstadoLocalidade estadoDestino;
	private Double custo;

	public OperadorLigacao(String locOrigem, String locDestino, Double custo) {
		estadoOrigem = new EstadoLocalidade(locOrigem);
		estadoDestino = new EstadoLocalidade(locDestino);
		this.custo = custo;
	}
	
	@Override
	public EstadoLocalidade aplicar(EstadoLocalidade estado) {
		if (estado.equals(estadoOrigem))
			return estadoDestino;
		return null;
	}

	@Override
	public Double custo(EstadoLocalidade estado, EstadoLocalidade estadoSuc) {
		return custo;
	}

}

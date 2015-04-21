package plantraj.modprob;

import pee.modprob.Problema;

public class ProblemaTrajecto extends Problema<EstadoLocalidade> {
	
	private EstadoLocalidade estadoFinal;

	public ProblemaTrajecto(String locIni, String locFim, OperadorLigacao[] operadores) {
		super(new EstadoLocalidade(locIni), operadores);
		estadoFinal = new EstadoLocalidade(locFim);
	}

	@Override
	public boolean objectivo(EstadoLocalidade estado) {
		return estado.equals(estadoFinal);
	}

}

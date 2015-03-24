package plantraj.modprob;

import pee.Estado;
import pee.Problema;

public class ProblemaTrajecto extends Problema {
	
	private EstadoLocalidade estadoFinal;

	public ProblemaTrajecto(String locIni, String locFim, OperadorLigacao[] operadores) {
		super(new EstadoLocalidade(locIni), operadores);
		estadoFinal = new EstadoLocalidade(locFim);
	}

	@Override
	public boolean objectivo(Estado estado) {
		return estado.equals(estadoFinal);
	}

}

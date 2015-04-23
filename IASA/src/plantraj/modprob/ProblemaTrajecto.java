package plantraj.modprob;

import pee.modprob.ProblemaHeur;

public class ProblemaTrajecto extends ProblemaHeur<EstadoLocalidade> {
	
	private EstadoLocalidade estadoFinal;

	public ProblemaTrajecto(String locIni, String locFim, OperadorLigacao[] operadores) {
		super(new EstadoLocalidade(locIni), operadores);
		estadoFinal = new EstadoLocalidade(locFim);
	}

	@Override
	public boolean objectivo(EstadoLocalidade estado) {
		return estado.equals(estadoFinal);
	}

	@Override
	public double heuristica(EstadoLocalidade estado) {
		// TODO Auto-generated method stub
		return 0;
	}

}

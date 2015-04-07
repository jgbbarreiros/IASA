package respuzzle.modprob;

import pee.Estado;
import pee.Problema;
import puzzle.Puzzle;

public class ProblemaPuzzle extends Problema {
	
	private EstadoPuzzle estadoFinal;

	public ProblemaPuzzle(Puzzle ini, Puzzle fim, OperadorMoverPosVazia[] operadores) {
		super(new EstadoPuzzle(ini), operadores);
		estadoFinal = new EstadoPuzzle(fim);
	}

	@Override
	public boolean objectivo(Estado estado) {
		return estado.equals(estadoFinal);
	}
}

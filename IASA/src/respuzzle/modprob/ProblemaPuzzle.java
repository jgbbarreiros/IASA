package respuzzle.modprob;

import pee.modprob.Problema;
import puzzle.Puzzle;

public class ProblemaPuzzle extends Problema<EstadoPuzzle> {
	
	private EstadoPuzzle estadoFinal;

	public ProblemaPuzzle(Puzzle ini, Puzzle fim, OperadorMoverPosVazia[] operadores) {
		super(new EstadoPuzzle(ini), operadores);
		estadoFinal = new EstadoPuzzle(fim);
	}

	@Override
	public boolean objectivo(EstadoPuzzle estado) {
		return estado.equals(estadoFinal);
	}
}

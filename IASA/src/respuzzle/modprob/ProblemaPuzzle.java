package respuzzle.modprob;

import pee.modprob.ProblemaHeur;
import puzzle.Puzzle;

public class ProblemaPuzzle extends ProblemaHeur<EstadoPuzzle> {
	
	private EstadoPuzzle estadoFinal;

	public ProblemaPuzzle(Puzzle ini, Puzzle fim, OperadorMoverPosVazia[] operadores) {
		super(new EstadoPuzzle(ini), operadores);
		estadoFinal = new EstadoPuzzle(fim);
	}

	@Override
	public boolean objectivo(EstadoPuzzle estado) {
		return estado.equals(estadoFinal);
	}

	@Override
	public double heuristica(EstadoPuzzle estado) {
		return estado.getPuzzle().numPecasForaLugar(estadoFinal.getPuzzle());
	}
}

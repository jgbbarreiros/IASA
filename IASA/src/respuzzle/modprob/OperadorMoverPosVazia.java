package respuzzle.modprob;

import pee.Estado;
import pee.Operador;
import puzzle.Puzzle;

public class OperadorMoverPosVazia implements Operador<EstadoPuzzle> {
	
	private Estado estadoOrigem;
	private Estado estadoDestino;

	public OperadorMoverPosVazia(Puzzle origem, Puzzle destino) {
		estadoOrigem = new EstadoPuzzle(origem);
		estadoDestino = new EstadoPuzzle(destino);
	}
	
	@Override
	public EstadoPuzzle aplicar(EstadoPuzzle estado) {
		Puzzle puzzleEstado = estado.getPuzzle();
		return null;
	}
	
}

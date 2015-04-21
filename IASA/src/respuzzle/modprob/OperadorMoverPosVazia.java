package respuzzle.modprob;

import pee.modprob.Operador;
import puzzle.Puzzle;

public class OperadorMoverPosVazia implements Operador<EstadoPuzzle> {
	
	Puzzle.Movimento mov;

	public OperadorMoverPosVazia(Puzzle.Movimento mov) {
		this.mov = mov;
	}
	
	@Override
	public EstadoPuzzle aplicar(EstadoPuzzle estado) {
		Puzzle novoPuzzle = estado.getPuzzle().movimentar(mov);
		if (novoPuzzle == null)
			return null;
		return new EstadoPuzzle(novoPuzzle);
	}

	@Override
	public Double custo(EstadoPuzzle estado, EstadoPuzzle estadoSuc) {
		return 1.0;
	}

	@Override
	public String toString() {
		return "" + mov;
	}
	
}

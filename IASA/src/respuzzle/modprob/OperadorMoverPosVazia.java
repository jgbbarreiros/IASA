package respuzzle.modprob;

import pee.Operador;
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
	
}

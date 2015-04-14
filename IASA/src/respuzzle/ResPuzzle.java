package respuzzle;

import pee.MecanismoProcura;
import pee.No;
import pee.Solucao;
import puzzle.Puzzle;
import respuzzle.modprob.EstadoPuzzle;
import respuzzle.modprob.OperadorMoverPosVazia;
import respuzzle.modprob.ProblemaPuzzle;


public class ResPuzzle {
	
	private static OperadorMoverPosVazia[] definirOperadores() {
		OperadorMoverPosVazia[] operadores = {
				new OperadorMoverPosVazia(Puzzle.Movimento.CIMA),
				new OperadorMoverPosVazia(Puzzle.Movimento.BAIXO),
				new OperadorMoverPosVazia(Puzzle.Movimento.ESQ),
				new OperadorMoverPosVazia(Puzzle.Movimento.DIR)
		};
		return operadores;
	}

	private static void mostrarTrajecto(Solucao<EstadoPuzzle> solucao) {
		if (solucao != null) {
			for (No<EstadoPuzzle> no : solucao) {
				System.out.printf("Movimento: %s\n", no.getEstado());
			}
		}
	}

	
	public static void main(String[] args) {
		
		int[][] confpuzzleA = {{1,2,3}, {8,4,5}, {6,7,0}};
		int[][] confpuzzleB = {{8,4,5}, {6,1,2}, {3,7,0}};
		int[][] confpuzzleE = {{1,2,3}, {4,5,6}, {7,0,8}};
		int[][] confpuzzleFinal = {{1,2,3}, {4,5,6}, {7,8,0}};
		
		Puzzle puzzleA = new Puzzle(confpuzzleA);
		Puzzle puzzleB = new Puzzle(confpuzzleB);
		Puzzle puzzleE = new Puzzle(confpuzzleE);
		Puzzle puzzleFim = new Puzzle(confpuzzleFinal);
		
//		Puzzle puzzle2 = puzzleA.movimentar(Puzzle.Movimento.CIMA);
//		
//		System.out.println(puzzle2);
		
		//Definir operadores
		OperadorMoverPosVazia[] operadores = definirOperadores();
		
		//Definir problema
		ProblemaPuzzle problema = new ProblemaPuzzle(puzzleE, puzzleFim, operadores);
		
		//Procurar solucao
		MecanismoProcura<EstadoPuzzle> mecProc = new MecanismoProcura<EstadoPuzzle>();
		// é preciso fazer na class solucao a implementacao Iterable
		Solucao<EstadoPuzzle> solucao = mecProc.procurar(problema);
		
		//Mostrar Trajecto
		mostrarTrajecto(solucao);
	}

}

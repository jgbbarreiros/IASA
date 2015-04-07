package respuzzle;

import pee.MecanismoProcura;
import pee.Solucao;
import puzzle.Puzzle;
import respuzzle.modprob.OperadorMoverPosVazia;
import respuzzle.modprob.ProblemaPuzzle;


public class ResPuzzle {

	private static void mostrarTrajecto(Solucao solucao) {
		// TODO Auto-generated method stub
		
	}

	private static OperadorMoverPosVazia[] definirOperadores() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static void main(String[] args) {
		
		int[][] confpuzzleA = {{1,2,3}, {8,4,5}, {6,7,0}};
		int[][] confpuzzleB = {{1,2,3}, {8,4,5}, {6,7,1}};
		int[][] confpuzzleFim = {{1,2,3}, {8,4,5}, {6,7,2}};
		
		Puzzle puzzleA = new Puzzle(confpuzzleA);
		Puzzle puzzleB = new Puzzle(confpuzzleB);
		Puzzle puzzleFim = new Puzzle(confpuzzleFim);
		
		Puzzle puzzle2 = puzzleA.movimentar(Puzzle.Movimento.CIMA);
		
		System.out.println(puzzle2);
		
		
		
		//Definir operadores
		OperadorMoverPosVazia[] operadores = definirOperadores();
		
		//Definir problema
		ProblemaPuzzle problema = new ProblemaPuzzle(puzzleA, puzzleFim, operadores);
		
		//Procurar solucao
		MecanismoProcura mecProc = new MecanismoProcura();
		// é preciso fazer na class solucao a implementacao Iterable
		Solucao solucao = mecProc.procurar(problema);
		
		//Mostrar Trajecto
		mostrarTrajecto(solucao);
	}

}

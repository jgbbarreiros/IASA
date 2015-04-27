package respuzzle;

import pee.mecproc.No;
import pee.mecproc.Solucao;
import pee.prof.ProcuraProf;
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
			int numMov = 0;
			for (No<EstadoPuzzle> no : solucao) {
				if (no.getOperador() != null) {
					System.out.printf("%s: %s\n\n", no.getOperador().toString(), no.getEstado());
					numMov++;
				}
				else
					System.out.printf("INICIO:%s\n\n", no.getEstado());
			}
			System.out.println("Numero de movimentos: " + numMov);
			System.out.println("Numero maximo de nos na fronteira: " + solucao.getNumMaxNos());
			System.out.println("Numero nos expandidos: " + solucao.getNumNosExp());
		}
	}
	
	public static void main(String[] args) {
		
		int[][] confpuzzleA = {{1,2,3}, {8,4,5}, {6,7,0}};
//		int[][] confpuzzleB = {{8,4,5}, {6,1,2}, {3,7,0}};
//		int[][] confpuzzleE = {{1,2,3}, {4,5,6}, {0,7,8}};
		int[][] confpuzzleFim = {{1,2,3}, {4,5,6}, {7,8,0}};
		
		Puzzle puzzleA = new Puzzle(confpuzzleA);
//		Puzzle puzzleB = new Puzzle(confpuzzleB);
//		Puzzle puzzleE = new Puzzle(confpuzzleE);
		Puzzle puzzleFim = new Puzzle(confpuzzleFim);
		
		//Definir operadores
		OperadorMoverPosVazia[] operadores = definirOperadores();
		
		//Definir problema
		ProblemaPuzzle problema = new ProblemaPuzzle(puzzleA, puzzleFim, operadores);
		
		//Procurar solucao
		ProcuraProf<EstadoPuzzle> mecProc = new ProcuraProf<EstadoPuzzle>();
//		ProcuraProfIter<EstadoPuzzle> mecProc = new ProcuraProfIter<EstadoPuzzle>();
//		ProcuraLarg<EstadoPuzzle> mecProc = new ProcuraLarg<EstadoPuzzle>();
//		ProcuraCustoUnif<EstadoPuzzle> mecProc = new ProcuraCustoUnif<EstadoPuzzle>();
//		ProcuraSofrega<EstadoPuzzle> mecProc = new ProcuraSofrega<EstadoPuzzle>();
//		ProcuraAA<EstadoPuzzle> mecProc = new ProcuraAA<EstadoPuzzle>();
		Solucao<EstadoPuzzle> solucao = mecProc.procurar(problema);
		
		//Mostrar Trajecto
		mostrarTrajecto(solucao);
	}

}

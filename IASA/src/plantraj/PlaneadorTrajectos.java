package plantraj;

import pee.mecproc.No;
import pee.mecproc.Solucao;
import pee.melhorprim.ProcuraCustoUnif;
import plantraj.modprob.EstadoLocalidade;
import plantraj.modprob.OperadorLigacao;
import plantraj.modprob.ProblemaTrajecto;

public class PlaneadorTrajectos {
	
	private static OperadorLigacao[] definirOperadores() {
		OperadorLigacao[] operadores = {
				new OperadorLigacao("loc0", "loc1", 5.0),
				new OperadorLigacao("loc0", "loc2", 25.0),
				new OperadorLigacao("loc1", "loc3", 12.0),
				new OperadorLigacao("loc1", "loc6", 5.0),
				new OperadorLigacao("loc2", "loc4", 30.0),
				new OperadorLigacao("loc3", "loc2", 10.0),
				new OperadorLigacao("loc3", "loc5", 5.0),
				new OperadorLigacao("loc4", "loc3", 2.0),
				new OperadorLigacao("loc5", "loc6", 8.0),
				new OperadorLigacao("loc5", "loc4", 10.0),
				new OperadorLigacao("loc6", "loc3", 15.0)
		};
		return operadores;
	}
	
	private static void mostrarTrajecto(Solucao<EstadoLocalidade> solucao) {
		if (solucao != null) {
			for (No<EstadoLocalidade> no : solucao) {
				System.out.printf("Localidade: %s\n", no.getEstado());
			}
		}
	}
	
	public static void main(String[] args) {
		
		//Definir operadores
		OperadorLigacao[] operadores = definirOperadores();
		
		//Definir problema
		ProblemaTrajecto problema = new ProblemaTrajecto("loc0", "loc4", operadores);
		
		//Procurar solucao
		ProcuraCustoUnif<EstadoLocalidade, ProblemaTrajecto> mecProc = new ProcuraCustoUnif<EstadoLocalidade, ProblemaTrajecto>();
		// é preciso fazer na class solucao a implementacao Iterable
		Solucao<EstadoLocalidade> solucao = mecProc.procurar(problema);
		
		//Mostrar Trajecto
		mostrarTrajecto(solucao);
	}
}

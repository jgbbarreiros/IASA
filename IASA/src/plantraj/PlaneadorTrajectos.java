package plantraj;

import pee.MecanismoProcura;
import pee.No;
import pee.ProcuraProf;
import pee.Solucao;
import plantraj.modprob.EstadoLocalidade;
import plantraj.modprob.OperadorLigacao;
import plantraj.modprob.ProblemaTrajecto;

public class PlaneadorTrajectos {
	
	private static OperadorLigacao[] definirOperadores() {
		OperadorLigacao[] operadores = {
				new OperadorLigacao("loc0", "loc1", 5),
				new OperadorLigacao("loc0", "loc2", 25),
				new OperadorLigacao("loc1", "loc3", 12),
				new OperadorLigacao("loc1", "loc6", 5),
				new OperadorLigacao("loc2", "loc4", 30),
				new OperadorLigacao("loc3", "loc2", 10),
				new OperadorLigacao("loc3", "loc5", 5),
				new OperadorLigacao("loc4", "loc3", 2),
				new OperadorLigacao("loc5", "loc6", 8),
				new OperadorLigacao("loc5", "loc4", 10),
				new OperadorLigacao("loc6", "loc3", 15)
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
		MecanismoProcura<EstadoLocalidade> mecProc = new ProcuraProf<EstadoLocalidade>();
		// é preciso fazer na class solucao a implementacao Iterable
		Solucao<EstadoLocalidade> solucao = mecProc.procurar(problema);
		
		//Mostrar Trajecto
		mostrarTrajecto(solucao);
	}
}

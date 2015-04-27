package pee.mecproc;

import pee.mecproc.mem.MemoriaProcura;
import pee.modprob.Estado;
import pee.modprob.Operador;
import pee.modprob.Problema;

public abstract class MecanismoProcura<E extends Estado, P extends Problema<E>> {
	
	private MemoriaProcura<E> memoriaProcura;
	protected P problema;
	
	public MecanismoProcura() {
		memoriaProcura = iniciarMemoria();
	}
	
	protected abstract MemoriaProcura<E> iniciarMemoria();
	
	public Solucao<E> procurar(P problema) {
		return procurar(problema, Integer.MAX_VALUE);
	}
	
	public Solucao<E> procurar(P problema, int profMax) {
		this.problema = problema;
		memoriaProcura.limpar();
		E estadoInicial = problema.getEstadoInicial();
		No<E> noInicial = new No<E>(estadoInicial);
		memoriaProcura.inserir(noInicial);
		while(!memoriaProcura.fronteiraVazia()) {
			No<E> no = memoriaProcura.remover();
			E estado = no.getEstado();
			boolean resultado = problema.objectivo(estado);
			if(resultado)
				return gerarSolucao(no);
			else if (no.getProfundidade() < profMax) {
				expandir(no);
			}
		}
		return null;
	}
	
	public Solucao<E> gerarSolucao(No<E> no) {
		Solucao<E> solucao = new Solucao<E>();
		No<E> noTemp = no;
		while(noTemp != null) {
			solucao.juntarInicio(noTemp);
			noTemp = noTemp.getAntecessor();
		}
		solucao.setNumMaxNos(memoriaProcura.getNumMaxNos());
		solucao.setNumNosExp(memoriaProcura.getNumNosExp());
		return solucao;
	}
	
	private void expandir(No<E> no) {
		E estado = no.getEstado();
		Operador<E>[] operadores = problema.getOperadores();
		for (Operador<E> operador : operadores) {
			E estadoSuc = operador.aplicar(estado);
			if(estadoSuc != null) {
				No<E> noSuc = new No<E>(estadoSuc, operador, no);
				memoriaProcura.inserir(noSuc);
			}
		}
	}
}

package pee;

public abstract class MecanismoProcura<E extends Estado> {
	
	private MemoriaProcura<E> memoriaProcura;
	private Problema<E> problema;
	
	public MecanismoProcura() {
		memoriaProcura = iniciarMemoria();
	}
	
	protected abstract MemoriaProcura<E> iniciarMemoria();

	public Solucao<E> procurar(Problema<E> problema) {
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
			else
				expandir(no);
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

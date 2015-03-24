package pee;

public class MecanismoProcura {
	
	private MemoriaProcura memoriaProcura = new MemoriaProcura();
	private Problema problema;
	
	public Solucao procurar(Problema problema) {
		this.problema = problema;
		memoriaProcura.limpar();
		Estado estadoInicial = problema.getEstadoInicial();
		No noInicial = new No(estadoInicial);
		memoriaProcura.inserir(noInicial);
		while(!memoriaProcura.fronteiraVazia()) {
			No no = memoriaProcura.remover();
			Estado estado = no.getEstado();
			boolean resultado = problema.objectivo(estado);
			if(resultado)
				return gerarSolucao(no);
			else
				expandir(no);
		}
		return null;
	}
	
	public Solucao gerarSolucao(No no) {
		Solucao solucao = new Solucao();
		No noTemp = no;
		while(noTemp != null) {
			solucao.juntarInicio(noTemp);
			noTemp = noTemp.getAntecessor();
		}
		return solucao;
	}
	
	private void expandir(No no) {
		Estado estado = no.getEstado();
		Operador[] operadores = problema.getOperadores();
		for (Operador operador : operadores) {
			Estado estadoSuc = operador.aplicar(estado);
			if(estadoSuc != null) {
				No noSuc = new No(estadoSuc, operador, no);
				memoriaProcura.inserir(noSuc);
			}
		}
	}
}

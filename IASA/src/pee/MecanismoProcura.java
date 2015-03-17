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
		return null;
	}
	
	private void expandir(No no) {
		
	}
}

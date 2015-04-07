package pee;

public interface Operador<E extends Estado> {
	
	E aplicar(E estado);

}

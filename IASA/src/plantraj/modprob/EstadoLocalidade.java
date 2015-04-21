package plantraj.modprob;

import pee.modprob.Estado;

public class EstadoLocalidade extends Estado {
	
	private String loc;
	
	public EstadoLocalidade(String loc) {
		this.loc = loc;
	}
	
	@Override
	public int hashCode() {
		return loc.hashCode();
	}

	@Override
	public String toString() {
		return loc;
	}

}

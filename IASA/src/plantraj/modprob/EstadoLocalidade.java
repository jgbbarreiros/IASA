package plantraj.modprob;

import pee.Estado;

public class EstadoLocalidade extends Estado {
	
	private String loc;
	
	public EstadoLocalidade(String loc) {
		this.loc = loc;
	}
	
	@Override
	public int hashCode() {
		return loc.hashCode();
	}

}

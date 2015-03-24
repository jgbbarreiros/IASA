package pee;

public abstract class Estado {
	
	@Override
	public boolean equals(Object obj) {
		if (this.getClass() != obj.getClass()) return false;
		return hashCode() == obj.hashCode();
	}
	
	@Override
	public abstract int hashCode();
}

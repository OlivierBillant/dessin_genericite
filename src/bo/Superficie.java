package bo;

public class Superficie<S> {
	private S superficie;

	public S getSuperficie() {
		return superficie;
	}

	public void setSuperficie(S superficie) {
		this.superficie = superficie;
	}

	@Override
	public String toString() {
		return "Superficie "+superficie;
	}

	
	
	
}

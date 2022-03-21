package bo;

public final class Cercle extends Forme implements InterfaceSuperficie<Float>{
// final on bloque l'heritage
	private int rayon;

	public Cercle(int x, int y, int rayon) {
		super(x, y);
		this.rayon = rayon;
	}
//	public float superficie() {
//		float s =(float) (rayon * rayon * 3.14f);
//		return s;
//	}
	public int getRayon() {
		return rayon;
	}

	public void setRayon(int rayon) {
		this.rayon = rayon;
	}

	@Override
	public String toString() {
		return "Cercle [rayon=" + rayon + ", x=" + x + ", y=" + y + "]";
	}
	@Override
	public Float getSuperficie() {
		float s = rayon * rayon* 3.1415f;
		return s;
	}

	
	
	
}

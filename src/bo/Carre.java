package bo;

public final class Carre extends Rectangle{
// final on bloque l'heritage
	public Carre(int x, int y, int cote) {
		super(x, y, cote, cote);
		
	}
	@Override
	public void setLongueur(int longueur) {
		this.longueur = longueur;
		this.largeur = longueur;
	}
	@Override
	public void setLargeur(int largeur) {
		this.largeur = largeur;
		this.longueur = largeur;
	}
	
	@Override
	public String toString() {
		return "Carre [cote=" + longueur  + ", x=" + x + ", y=" + y + "]";
	}

	
	
}

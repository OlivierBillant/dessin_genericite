package bo;

public abstract class Forme {
	protected int x;
	protected int y;
	
	public Forme(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void seDeplacer(int x, int y) {
		this.x += x;// this.x = this.x +x ;
		this.y += y;
	}
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	public static String getInfo() {
		return "je suis une forme";
	}
	public String decrisToi() {
		return "Je suis une forme";
	}
	@Override
	public String toString() {
		return "Forme [x=" + x + ", y=" + y + "]";
	}
	
	
}

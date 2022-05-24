package entities;

public class Calculadora {
	private int um;
	private int dois;
	private char esc;
	
	public Calculadora(int um, int dois, char esc) {
		super();
		this.um = um;
		this.dois = dois;
		this.esc = esc;
	}
	public int getUm() {
		return um;
	}
	public void setUm(int um) {
		this.um = um;
	}
	public int getDois() {
		return dois;
	}
	public void setDois(int dois) {
		this.dois = dois;
	}
	public int soma () {
		return um + dois;
	}
	public int sub() {
		return um - dois;
	}
	public double div() {
		return um / dois;
	}
	public double multi() {
		return um * dois;
	}
	public char getEsc() {
		return esc;
	}
	public void setEsc(char esc) {
		this.esc = esc;
	}
	

}

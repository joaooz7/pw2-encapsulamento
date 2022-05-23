
public class Bomba {
	private int pDesejada;
	private int pLida;
	
	
	public int getpDesejada() {
		return pDesejada;
	}
	public void setpDesejada(int pDesejada) {
		this.pDesejada = pDesejada;
	}
	public int getpLida() {
		return pLida;
	}
	public void setpLida(int pLida) {
		this.pLida = pLida;
	}
	
	public int ObterResultado() {
		return this.pDesejada - this.pLida;
	}

}

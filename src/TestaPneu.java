import java.util.Scanner;

public class TestaPneu {
	public static void main(String[] args) {
		
		int dif;
		
		Bomba b = new Bomba();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a press�o desejada: ");
	    b.setpDesejada(sc.nextInt());
	    b.setpLida(18);
	    
	    dif = b.ObterResultado();
	    
	    System.out.println("Diferen�a: " +dif);
	}
}

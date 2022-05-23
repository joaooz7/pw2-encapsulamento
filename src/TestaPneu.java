import java.util.Scanner;

public class TestaPneu {
	public static void main(String[] args) {
		
		int dif;
		
		Bomba b = new Bomba();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a pressão desejada: ");
	    b.setpDesejada(sc.nextInt());
	    b.setpLida(18);
	    
	    dif = b.ObterResultado();
	    
	    System.out.println("Diferença: " +dif);
	}
}

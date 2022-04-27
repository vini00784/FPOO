import java.util.Scanner;

public class Vetor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double notas[] = new double[5];
		
		for (int i = 0 ; i < notas.length ; i++) {
			System.out.print((i+1) + "ª nota: ");
			notas[i] = sc.nextDouble();
		}
        System.out.println();
		
		double somaNotas = 0;
		
		for (int i = 0 ; i < notas.length ; i++) {
			System.out.println((i+1) + "ª nota: " + notas[i]);
			somaNotas = somaNotas + notas[i];
		}
		
		double media = somaNotas / notas.length;
		
		if (media < 7) {
            System.out.println();
			System.out.println("Sua media eh igual a: " + media);
			System.out.println("Sinto muito, mas você está reprovado!");
		} else {
            System.out.println();
			System.out.println("Sua media eh igual a: " + media);
			System.out.println("Parabens, aprovado!");
		}
	}
}
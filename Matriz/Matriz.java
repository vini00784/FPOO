import java.util.Scanner;
import java.text.DecimalFormat;

public class Matriz2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		double m[][] = new double [2][2];
		
		for (int linha = 0 ; linha<m.length ; linha++) {
			for (int coluna = 0 ; coluna<m[0].length ; coluna++) {
				System.out.print("Digite um número: ");
				m[linha][coluna] = sc.nextDouble();
			}
		}
		
		double media = media(m);
		String mediaFormatada = df.format(media(m));
		
		System.out.println();
		System.out.println("O menor número é: " + menor(m));
		System.out.println("Média: " + mediaFormatada);
	}
	
	public static double menor(double m[][]) {
		double menor = m[0][0];
		for (int linha = 0 ; linha<m.length ; linha++) {
			for (int coluna = 0 ; coluna<m[0].length ; coluna++) {
				if(menor > m[linha][coluna]) {
					menor = m[linha][coluna];
				}
			}
		}
		return menor;
	} 
	
	public static double media(double m[][]) {
		double total = 0;
		for (int linha = 0 ; linha<m.length ; linha++) {
			for (int coluna = 0 ; coluna<m[0].length ; coluna++) {
				total += m[linha][coluna];
			}
		}
		return total / (m.length * m[0].length) ;
	}
}
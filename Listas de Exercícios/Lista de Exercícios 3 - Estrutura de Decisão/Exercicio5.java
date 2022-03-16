import java.util.Scanner;

class Exercicio5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nInforme sua idade: ");
        int idade = sc.nextInt();
        
        if (idade >= 18) {
            System.out.print("\n\tMaior de Idade!");
        } else {
            System.out.print("\n\tMenor de Idade!");
        }
    }
}
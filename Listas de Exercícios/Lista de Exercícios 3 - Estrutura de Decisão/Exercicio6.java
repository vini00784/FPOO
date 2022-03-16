import java.util.Scanner;

class Exercicio6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe sua idade: ");
        int idade = sc.nextInt();
        
        if (idade >= 1 && idade <= 150) {
            if (idade >= 18) {
                System.out.print("\n\tMaior de Idade!");
            } else {
                System.out.print("\n\tMenor de Idade!");
            }
        }
        else {
            System.out.print("\n\tIdade Inválida!");
        }
    }
}
import java.util.Scanner;

class MaiorMenor {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print ("\nInforme sua idade: ");
        int idade = sc.nextInt();

        if (idade > 17) {
            System.out.print ("\n\tMaior de idade!\n");
        } else {
            System.out.print ("\n\tMenor de idade!\n");
        }
    }
}
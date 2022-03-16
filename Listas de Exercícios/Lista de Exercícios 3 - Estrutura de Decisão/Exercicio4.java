import java.util.Scanner;

class Exercicio4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número inteiro: ");
        int n1 = sc.nextInt();

        int lastNum = n1 % 2;

        if (lastNum == 0) {
            System.out.print("\n\t" + n1 + ": é um número par");
        } else {
            System.out.print("\n\t" + n1 + ": é um número ímpar");
        }
    }
}

// é par se n%2==0
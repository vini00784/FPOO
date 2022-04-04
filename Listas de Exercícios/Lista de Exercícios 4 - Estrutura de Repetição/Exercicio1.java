import java.util.Scanner;

class Exercicio1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // é par se n%2==0
        while(true) {
            while (true) {
                System.out.print("\nInforme um número inteiro: ");
                int n1 = sc.nextInt();

                if (n1 % 2 == 0) {
                    System.out.print("\n" + n1 + ": é um número par");
                    break;
                } else {
                    System.out.println("\n" + n1 + ": é um número ímpar");
                    break;
                }
            }

            System.out.println("Deseja continuar? [s/n]");
            String op = sc.next();
            if (!op.equals("sim") && !op.equals("Sim") && !op.equals("yes") && !op.equals("Yes")) {
                System.exit(0);
            }
        }
    }
}
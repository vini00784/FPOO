import java.util.Scanner;

class Exercicio7 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            while (true) {
                System.out.print("\nInforme um número positivo: ");
                int n = sc.nextInt();

                if (n == 0) {
                    System.out.print("\n" + n + "! = 1" + "\n");
                    break;
                }

                long fat = n;

                if (n >= 0) {
                    for ( int i=2 ; i<n ; i++ ) {
                        fat *= i;
                    }
                    System.out.print("\n" + n + "! = " + fat + "\n");
                    break;
                }
                System.out.print("\nNúmero Inválido, informe novamente no campo abaixo\n");
            }

            // Código adicionado
            System.out.println("Deseja continuar? [s/n]");
            String op = sc.next();
            if (!op.equals("sim") && !op.equals("Sim") && !op.equals("yes") && !op.equals("Yes")) {
                System.exit(0);
            }
        }
    }
}
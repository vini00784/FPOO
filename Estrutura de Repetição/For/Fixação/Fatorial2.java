import java.util.Scanner;

class Fatorial2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int sim = 1;
        int nao = 2;

        while (true) {
            while (true) {
                System.out.print("\nInforme um número positivo: ");
                int n = sc.nextInt();
                long fat = n;

                if (n >= 0) {
                    if (n == 0) {
                        System.out.print("\n" + n + "! = 1" + "\n");
                        break;
                    }
                    for ( int i=2 ; i<n ; i++ ) {
                        fat *= i;
                    }
                    System.out.print("\n" + n + "! = " + fat + "\n");
                    System.exit(0);
                }
                System.out.print("\nNúmero Inválido, informe novamente no campo abaixo\n");
            }
        System.out.println("Deseja continuar? Digite 1 para sim e 2 para não");
        }
    }
}
// Elaborar um programa em Java que exibe na tela a tabuada de um número e dos dois números posteriores

class Tabuada1 {
    public static void main(String args[]) {
        int n = 5;
        for (int i = 0 ; i <= 10 ; ++i ) {
            System.out.print("\n" + n + " X " + i + " = " + i*n);
        }
        System.out.println();

        n++;
        for (int i = 0 ; i <= 10 ; ++i ) {
            System.out.print("\n" + n + " X " + i + " = " + i*n);
        }
        System.out.println();

        n++;
        for (int i = 0 ; i <= 10 ; ++i ) {
            System.out.print("\n" + n + " X " + i + " = " + i*n);
        }
    }
}
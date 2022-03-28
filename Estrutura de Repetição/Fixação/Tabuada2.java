class Tabuada2 {
    public static void main(String args[]) {
        int n = 5;

        // Quantidade de tabuadas:
        for (int i = 0 ; i < 3 ; ++i) {
            // Construção da tabuada:
            for (int j = 0 ; j <= 10 ; ++j) {
                System.out.print("\n" + n + " X " + j + " = " + n*j);
            }
            n++;
            System.out.println();
        }
    }
}
import java.util.Scanner;

class ExercicioVetor {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double numeros[] = new double[5];
        for (int i = 0 ; i < numeros.length ; i++) {
            numeros[i] = entrada();
        }
        System.out.println();
        
        double media = media();
        System.out.println();
        System.out.println("A media desses numeros eh: " + media);
    }

    public static double entrada() {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Número: ");
        double num = input.nextDouble();
        return (num);
    }

    public static double media() {
        Scanner media = new Scanner(System.in);
        double somaNum = 0;
        double numeros[] = new double[5];

        for (int i = 0 ; i < numeros.length ; i++) {
            System.out.println((i + 1) + "° numero: " + numeros[i]);
            somaNum = somaNum + numeros[i];
        }
        return (somaNum / numeros.length);
    }
}

// for (int i = 0 ; i < numeros.length ; i++) {
//     System.out.print((i + 1) + "° numero: ");
//     numeros[i] = input.nextDouble();
// }
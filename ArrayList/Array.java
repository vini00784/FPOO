// Elabore um algoritmo que armazene todos os números pelo qual um número não primo é divisível
// Exemplo: 100, é divisível por 2, 4, 5, 10, 20, 25 e 50.
import java.util.ArrayList;
import java.util.Scanner;

class Array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        ArrayList<Integer> numeros = new ArrayList<>(); 

        System.out.println();

        while(true) {
            System.out.print("Digite um número inteiro >= 2: ");
            numero = sc.nextInt();
            if (numero >= 2) {
                break;
            } else {
                System.out.println("Número inválido");
            }
        }

        for (int i = 2 ; i <= numero / 2 ; i++) {
            if (numero % i == 0) {
                numeros.add(i);
            }
        }

        if (numeros.size() > 0) {
            System.out.print(numero + " nao eh primo, pois eh divisivel por: ");
            for (int i = 0 ; i < numeros.size() ; i++) {
                System.out.print(" - " + numeros.get(i) + " - " + " ");
            }
        } else {
            System.out.println(numero + ": eh primo");
        }

        System.out.println();


        // boolean referencia = true;
        // System.out.println();

        // for (int i = 2 ; i <= numero / 2 ; i++) {
        //     if (numero % i == 0) {
        //         if (referencia == true) {
        //             System.out.print(numero + ": nao eh primo, e eh divisivel por: ");
        //             numeros.add(i);
        //         }
        //         for (int j = 0 ; j < numeros.size() ; j++) {
        //             System.out.print(numeros.get(j) + "  ");
        //             referencia = false;
        //         }
        //     }
        // }
        // if (referencia) {
        //     System.out.print(numero + ": numero primo.");
        // }
        // System.out.println();
    }
} 
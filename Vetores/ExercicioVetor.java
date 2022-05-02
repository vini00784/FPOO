class ExercicioVetor {
    public static void main(String args[]) {
        double numeros[] = new double[args.length];

        for (int i = 0 ; i<args.length ; i++) {
            numeros[i] = Double.parseDouble(args[i]);
        }

        System.out.println("Média: " + media(numeros));
        System.out.println("Menor némero: " + menor(numeros));
        System.out.println("Maior némero: " + maior(numeros));
    }

    public static double media(double vet[]) {
        double total = 0;
        for (int i = 0 ; i<vet.length ; i++) {
            total += vet[i];
        }
        return total / vet.length;
    }

    public static double menor(double vet2[]) {
        double menor = vet2[0];
        for (int i = 1 ; i<vet2.length ; i++) {
            if (menor > vet2[i]) {
                menor = vet2[i];
            }
        }
        return menor;
    }

    public static double maior(double vet3[]) {
        double maior = vet3[0];
        for (int i = 1 ; i<vet3.length ; i++) {
            if (maior < vet3[i]) {
                maior = vet3[i];
            }
        }
        return maior;
    }
}
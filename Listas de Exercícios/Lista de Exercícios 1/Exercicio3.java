class Exercicio3 {
	public static void main(String args[]) {
		int variavel1 = 10;
		int variavel2 = 4;

		System.out.println ("Variavel 1 é igual a: " + variavel1);
		System.out.println ("Variavel 2 é igual a: " + variavel2);
		
		int v1 = variavel1;
		int v2 = variavel2;
		variavel1 = v2;
		variavel2 = v1;
		
		System.out.println ("Variavel 1 é igual a: " + v2);
		System.out.println ("Variavel 2 é igual a: " + v1);
	}
}
class IdadeSeg {
	public static void main(String args[]) {
		int idade = 16;

		int idadeDias = idade * 365;
		int idadeHoras = idadeDias * 24;
		int idadeMin = idadeHoras * 60;
		int idadeSegs = idadeMin * 60;
		System.out.println("Sua idade em segundos é: " + idadeSegs);
	}
}
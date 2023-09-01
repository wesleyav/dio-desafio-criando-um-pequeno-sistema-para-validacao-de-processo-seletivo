import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o primeiro número: ");
		int primeiroParametro = scanner.nextInt();

		System.out.print("Digite o segundo número: ");
		int segundoParametro = scanner.nextInt();

		scanner.close();

		try {
			contar(primeiroParametro, segundoParametro);
		} catch (ParametrosInvalidosException e) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro parâmetro.");
		}
	}

	static void contar(int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException {

		if (primeiroParametro > segundoParametro) {
			throw new ParametrosInvalidosException();
		}

		int contagem = segundoParametro - primeiroParametro;

		for (int i = 1; i <= contagem; i++) {
			System.out.println("Imprimindo o número " + i);
		}
	}

}

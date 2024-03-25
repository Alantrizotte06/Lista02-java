import java.util.Scanner;

public class Exercicio06 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        double[] notas = new double[5];
        double[] pesos = new double[5];

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota " + (i+1) + ": ");
            notas[i] = leitor.nextDouble();
        }

        for (int i = 0; i < pesos.length; i++) {
            do {
                System.out.println("Digite o peso para a nota " + (i+1) + ": ");
                pesos[i] = leitor.nextDouble();
                if (pesos[i] <= 0) {
                    System.out.println("Peso inválido. O peso deve ser maior que zero.");
                }
            } while (pesos[i] <= 0);
        }

        double somaProdutos = 0;
        double somaPesos = 0;

        for (int i = 0; i < notas.length; i++) {
            somaProdutos += notas[i] * pesos[i];
            somaPesos += pesos[i];
        }

        double mediaPonderada = somaProdutos / somaPesos;

        System.out.println("A média ponderada é: " + mediaPonderada);

        leitor.close();
    }
}

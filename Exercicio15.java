import java.util.Scanner;

public class Exercicio15 {
  public static void executar() {
    Scanner leitor = new Scanner(System.in);

    int[] vetor = new int[5];

    System.out.println("Digite o primeiro número:");
    vetor[0] = leitor.nextInt();

    for (int i = 1; i < 5; i++) {
      System.out.println("Digite o próximo número:");
      int numero = leitor.nextInt();
      if (numero > vetor[i - 1]) {
        vetor[i] = numero;
      } else {
        System.out.println("O número digitado não é maior que o anterior. Tente novamente.");
        i--;
      }
    }

    System.out.println("Vetor preenchido:");
    for (int i = 0; i < 5; i++) {
      System.out.print(vetor[i] + " ");
    }

    leitor.close();
  }
}
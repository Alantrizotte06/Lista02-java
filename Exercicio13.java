import java.util.Scanner;

public class Exercicio13 {
  public static void executar() {
    Scanner leitor = new Scanner(System.in);

    System.out.println("Insira o valor de n: ");
    int n = leitor.nextInt();

    int[] vetor = fibonacci(n);
    System.out.println("Sequência de Fibonacci com os " + n + " primeiros termos:");

    for (int i = 0; i < n; i++) {
      System.out.print(vetor[i] + " ");
    }

    leitor.close();
  }

  public static int[] fibonacci(int n) {
    int[] sequencia = new int[n];

    if (n >= 1) {
      sequencia[0] = 1;
    }
    if (n >= 2) {
      sequencia[1] = 1;
    }
    for (int i = 2; i < n; i++) {
      sequencia[i] = sequencia[i - 1] + sequencia[i - 2];
    }

    return sequencia;
  }
}

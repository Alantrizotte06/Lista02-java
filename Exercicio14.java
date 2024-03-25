import java.util.Scanner;

public class Exercicio14 {
  public static void executar() {
    Scanner leitor = new Scanner(System.in);

    int[] vetor = new int[5];
    System.out.println("Digite os 5 elementos do vetor:");
    for (int i = 0; i < 5; i++) {
      vetor[i] = leitor.nextInt();
    }

    int numMaior = 0;
    for (int i = 1; i < 5; i++) {
      if (vetor[i] > vetor[numMaior]) {
        numMaior = i;
      }
    }

    int maiorElemento = vetor[numMaior];
    for (int i = numMaior; i < 4; i++) {
      vetor[i] = vetor[i + 1];
    }
    vetor[4] = maiorElemento;

    System.out.println("Vetor atualizado:");
    for (int i = 0; i < 5; i++) {
      System.out.print(vetor[i] + " ");
    }

    leitor.close();
  }
}
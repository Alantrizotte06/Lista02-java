import java.util.Scanner;

public class Exercicio12 {
  public static void executar() {
    Scanner leitor = new Scanner(System.in);

    int[] vet = new int[12];
    int ver = 1;

    for (int cont = 0; cont < 12; cont++) {
      System.out.println("Insira o valor da posição " + (cont + 1) + ": ");
      vet[cont] = leitor.nextInt();
    }

    for (int cont = 0; cont < 12; cont++) {
      if (vet[cont] > 0 && vet[cont] % 2 == 0) {
        ver *= vet[cont];
      }
    }

    System.out.println("" + ver);

    leitor.close();
  }
}

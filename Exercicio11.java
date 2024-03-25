import java.util.Scanner;

public class Exercicio11 {
  public static void executar() {
    Scanner leitor = new Scanner(System.in);

    int[] valoresA = new int[5];
    int[] valoresB = new int[5];

    for (int cont = 0; cont < 5; cont++) {
      System.out.println("Insirao valor A da posição " + (cont + 1) + ": ");
      valoresA[cont] = leitor.nextInt();
    }

    for (int cont = 0; cont < 5; cont++) {
      System.out.println("Insirao valor B da posição " + (cont + 1) + ": ");
      valoresB[cont] = leitor.nextInt();
    }

    int resultado = 0;
    for (int cont = 0; cont < 5; cont++) {
      resultado += valoresA[cont] * valoresB[cont];
    }
    System.out.println("Resultado: " + resultado);

    leitor.close();
  }
}

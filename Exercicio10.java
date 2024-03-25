import java.util.Scanner;

public class Exercicio10 {
  public static void executar() {
    Scanner leitor = new Scanner(System.in);

    int[] valoresA = new int[5];
    int[] valoresB = new int[5];

    for (int cont = 0; cont < 5; cont++) {
      System.out.println("Insira o valor A da posição " + (cont + 1) + ": ");
      valoresA[cont] = leitor.nextInt();
    }

    for (int cont = 0; cont < valoresA.length; cont++) {
      valoresB[cont] = valoresA[valoresA.length - 1 - cont];
    }

    System.out.println("Valores de A:");
    for (int cont = 0; cont < 5; cont++) {
      System.out.println("" + valoresA[cont]);
    }

    System.out.println("Valores de B:");
    for (int cont = 0; cont < 5; cont++) {
      System.out.println("" + valoresB[cont]);
    }

    leitor.close();
  }
}
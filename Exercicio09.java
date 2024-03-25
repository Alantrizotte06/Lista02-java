import java.util.Scanner;

public class Exercicio09 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        int[] A = new int[5];
        int[] B = new int[5];
        int[] C = new int[5];

        for (int i = 0; i < A.length; i++) {
            System.out.println("Digite o número : ");
            A[i] = leitor.nextInt();
        }

        for (int i = 0; i < B.length; i++) {
            System.out.println("Digite o número : ");
            B[i] = leitor.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                C[i] = A[i];
            } else {
                C[i] = B[i];
            }
        }

        System.out.println("Vetor C:");
        for (int i = 0; i < 5; i++) {
            System.out.print(C[i] + " ");
        }

        leitor.close();
    }
}

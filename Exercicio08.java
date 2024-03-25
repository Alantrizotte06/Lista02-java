import java.util.Arrays;
import java.util.Scanner;

public class Exercicio08 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        int[] A = new int[5];
        for (int i = 0; i < A.length; i++) {
            System.out.println("Digite " + (i + 1) + ":");
            A[i] = leitor.nextInt();
        }

        int[] B = new int[5];
        for (int i = 0; i < B.length; i++) {
            System.out.println("Digite " + (i + 1) + ":");
            B[i] = leitor.nextInt();
        }

        int[] C = new int[A.length + B.length];

        for (int i = 0; i < A.length; i++) {
            C[i] = A[i];
        }

        for (int i = 0; i < B.length; i++) {
            C[A.length + i] = B[i];
        }

        System.out.println("Vetor C concatenado: " + Arrays.toString(C));

        leitor.close();
    }
}

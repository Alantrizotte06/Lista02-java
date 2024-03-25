import java.util.Scanner;

public class Exercicio07 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        int[] num1 = new int[5];

        for (int i = 0; i < num1.length; i++) {
            System.out.println("Digite o número da posição " + (i+1) + " do primeiro vetor: ");
            num1[i] = leitor.nextInt();
        }
        
        int[] num2 = new int[5];

        for (int i = 0; i < num2.length; i++) {
            System.out.println("Digite o número da posição " + (i+1) + " do segundo vetor: ");
            num2[i] = leitor.nextInt();
        }

        boolean arraysAreEqual = true;

        for (int i = 0; i < num1.length; i++) {
            if (num1[i] != num2[i]) {
                arraysAreEqual = false;
                break;
            }
        }

        if (arraysAreEqual) {
            System.out.println("Os vetores são iguais.");
        } else {
            System.out.println("Os vetores são diferentes.");
        }

        leitor.close();
    }
    
}
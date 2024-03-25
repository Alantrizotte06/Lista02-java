import java.util.Scanner;

public class Exercicio02 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        int[] num = new int[3];

        for (int i = 0; i < num.length; i++) {
            System.out.println("Digite o número : ");
            num[i] = leitor.nextInt();
        }

        for (int i = 0; i < num.length; i++) {
            int numero = num[i];

            if (numero > 0) {
                System.out.println("O número " + numero + " na posição " + i + " é positivo.");
            } else if (numero < 0) {
                System.out.println("O número " + numero + " na posição " + i + " é negativo.");
            } else {
                System.out.println("O número na posição " + i + " é zero.");
            }
        }
    
        leitor.close();
    }
    
}

import java.util.Scanner;

public class Exercicio03 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        int[] num = new int[3];

        for (int i = 0; i < num.length; i++) {
            System.out.println("Digite o número : ");
            num[i] = leitor.nextInt();
        }
        
        int[] d = new int[3];
        for (int i = 0; i < num.length; i++) {
            d[i] = num[i] * 2;
        }

        for (int i = 0; i < d.length; i++) {
            System.out.println("O dobro de " + num[i] + " é " + d[i]);
        }
    
        leitor.close();
    }
    
}

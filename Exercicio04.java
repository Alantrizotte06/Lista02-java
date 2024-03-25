import java.util.Scanner;

public class Exercicio04 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        int[] num = new int[5];

        for (int i = 0; i < num.length; i++) {
            System.out.println("Digite o número : ");
            num[i] = leitor.nextInt();
        }
        
        int n = 10;

        for (int i = 0; i < num.length; i++) {
            if(num[i] < n)
                System.out.println("Menores que N: " + num[i]);
        }
    
        leitor.close();
    }
    
}

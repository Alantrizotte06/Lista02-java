import java.util.Scanner;

public class Exercicio01 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        int[] num = new int[5];

        for (int i = 0; i < num.length; i++) {
            System.out.println("Digite a nota : ");
            num[i] = leitor.nextInt();
        }

        double media = (num[0] + num[1] + num[2] + num[3] + num[4])/5;
        System.out.println("Média é :" + media);
    
        leitor.close();
    }
    
}

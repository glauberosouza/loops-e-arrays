package loops;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fatorial;
        int multoplicacao = 1;

        System.out.println("Numero: ");
        fatorial = input.nextInt();

        System.out.print(fatorial + "! = ");

        for (int i = fatorial; i >= 1; i--) {
            multoplicacao = multoplicacao * i;
        }
        System.out.println(multoplicacao);
    }
}
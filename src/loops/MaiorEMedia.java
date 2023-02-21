package loops;

import java.util.Scanner;

public class MaiorEMedia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;
        int media = 0;
        int contador = 0, maior = 0;

        do {
            System.out.println("Numero: ");
            numero = input.nextInt();

            media = media + numero;
            if (numero > maior)
                maior = numero;
            contador++;
        } while (contador < 5);
        System.out.println("Maior: " + maior);
        System.out.println("Média: " + media / 5);
    }
}

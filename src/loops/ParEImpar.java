package loops;

import java.util.Scanner;

public class ParEImpar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int quantidaDeNumeros, numero;
        int contador = 0;
        int quantidaDePares = 0, quantidadeDeImpares = 0;

        System.out.println("Quantidade de numeros: ");
        quantidaDeNumeros = input.nextInt();

        do {
            System.out.println("Numero: ");
            numero = input.nextInt();

            if (numero % 2 == 0) {
                quantidaDePares++;
            } else {
                quantidadeDeImpares++;
            }

            contador++;
        } while (contador < quantidaDeNumeros);
        System.out.println("Quantidade Par: " + quantidaDePares);
        System.out.println("Quantidade Impar: " + quantidadeDeImpares);
    }
}
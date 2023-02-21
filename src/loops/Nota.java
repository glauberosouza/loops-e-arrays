package loops;

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int nota;

        System.out.println("Nota: ");
        nota = input.nextInt();
        while (nota < 0 | nota > 10) {
            System.out.println("Nota inválida: digite novamente ");
            nota = input.nextInt();
        }
    }
}

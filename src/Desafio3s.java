import java.util.Scanner;

public class Desafio3s {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int somaNumeros = 0;

        while (somaNumeros < 100) {

            int numero = entrada.nextInt();

            somaNumeros += numero;
        }

        System.out.printf("Soma dos números: %d%n", somaNumeros);
    }
}
package calculadora;

import java.util.Scanner;

public class CalculadoraBasica {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("|     1 - Soma                    |\n" +
                "|     2 - Subtracao               |\n" +
                "|     3 - Multiplicao             |\n" +
                "|     4 - Divisao                 |\n ");
        int escolha = scan.nextInt();
        int a, b;
        System.out.println("Digite o primeiro número: ");
        a = scan.nextInt();
        System.out.println("Digite o segundo número ");
        b = scan.nextInt();

        switch (escolha) {
            case 1:
                int somar = somar(a, b);
                System.out.println("o Valor da soma é: " + somar);
                break;
            case 2:
                int subtrair = subtrair(a, b);
                System.out.println("o Valor da subtração é: " + subtrair);
                break;
            case 3:
                int multiplicar = multiplicar(a, b);
                System.out.println("o Valor da multiplicação é: " + multiplicar);
                break;
            case 4:
                double dividir = dividir(a, b);
                System.out.println("o Valor da divisão é: " + dividir);
                break;

        }
    }

    public static int somar(int a, int b) {
        return a + b;
    }

    public static int subtrair(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        return a / b;
    }
}

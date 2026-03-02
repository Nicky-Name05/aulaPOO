package primos;

import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static Scanner teclado;

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.printf("Calcula se um numero é primo!\nDigite um numero\n");

        int n;
        int primo = 0;
        n = teclado.nextInt();

        for (int i = 0; i <= n/2; i++) {
            if (n % (i+2) == 0 ){
                System.out.printf("Não é primo");
                primo = 1;
                break;
            }
        }
        if (primo == 0){
            System.out.printf("É primo");
        }
    }
}
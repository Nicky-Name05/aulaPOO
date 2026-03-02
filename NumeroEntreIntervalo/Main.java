
package intervalo;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {

    private static Scanner Teclado;

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("esta no intervalo!?\n");

        Scanner Teclado =  new Scanner(System.in);

        int n;

        int menor, maior;


        System.out.printf("digite o limite inferior:\n");

        menor = Teclado.nextInt();

        System.out.printf("digite o limite superior:\n");

        maior = Teclado.nextInt();

        System.out.printf("digite o numero a ser comparado:\n");

        n = Teclado.nextInt();
        while ( !(menor < n && n < maior)){
            System.out.printf("entrada inválida!\n");
            System.out.printf("digite o numero a ser comparado:\n");

            n = Teclado.nextInt();
        }
        System.out.printf("%d!\n", n);
        System.out.printf("Está no intervalo!\n");
    }
}

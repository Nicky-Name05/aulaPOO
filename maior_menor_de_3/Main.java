package maior_menor_de_3;

import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static Scanner teclado;

    public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        System.out.printf("Media do maior e menor numero de 10!\nDigite 10 numeros:\n");

        Scanner teclado =  new Scanner(System.in);

        int num;

        int maior, menor;

        float media;

        num =  teclado.nextInt();

        maior = num;
        menor = num;
        for (int i = 0; i < 10; i++){
            num =  teclado.nextInt();
            if (num < menor){
                menor = num;
            }
        }
        if (num > maior){
            maior = num;
        }
        media = maior + menor / 2;
        System.out.printf("Media: %.2f\n", media);
    }
}
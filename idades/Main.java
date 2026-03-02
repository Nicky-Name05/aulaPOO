
package idades;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {

    private static Scanner Teclado;

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Idades!\n");

        Scanner Teclado =  new Scanner(System.in);

        int idade;

        float media = 0;
        int numDePessoas = 1;

        int menor, maior;

        System.out.printf("Digite as idades a seguir:\n(Digite 0 para parar o programa)\n");
        idade = Teclado.nextInt();

        menor = idade;
        maior = idade;
        while(idade != 0){
            
            if (menor > idade){
                menor = idade;
            }
            if (maior < idade){
                maior = idade;
            }

            media += idade;
            numDePessoas++;

            idade = Teclado.nextInt();
        }

        media = media / numDePessoas;

        System.out.printf("Numero de pessoas: %d\nMenor idade: %d\nMaior idade: %d\nMédia de idades: %.2f\n", numDePessoas, menor, maior, media);
    }
}

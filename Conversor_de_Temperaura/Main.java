
package Conversor_de_Temperaura;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {

    private static Scanner Teclado;

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Conversor de Temperatura!");

        Scanner Teclado =  new Scanner(System.in);

        double Temperatura;

        int Escala;

        System.out.printf("Escolha a escala: \n1 - Fahrenheit \n2 - Celcius \n3 - Kelvin \n");

        Escala =  Teclado.nextInt();

        System.out.printf("Digite a temperatura");

        Temperatura =  Teclado.nextDouble();

        switch (Escala) {
            case 1:
                System.out.printf("Escolha a nova escala: \n1 - Celcius \n2 - Kelvin \n");

                Escala =  Teclado.nextInt();
                switch(Escala) {
                    case 1:
                        Temperatura = (Temperatura - 32) / (1.8);

                        System.out.printf("Nova temperatura: %.2f - Celcius \n", Temperatura);

                        break;

                    case 2:

                        Temperatura = (Temperatura - 32) / (1.8);
                        Temperatura = Temperatura + 273.15;

                        System.out.printf("Nova temperatura: %.2f - Kelvin \n", Temperatura);

                        break;
                }

                break;
            //-------------
            case 2:

                System.out.printf("Escolha a nova escala: \n1 - Fahrenheit \n2 - Kelvin \n");

                Escala =  Teclado.nextInt();
                switch(Escala) {
                    case 1:
                        Temperatura = Temperatura * (1.8) + 32;

                        System.out.printf("Nova temperatura: %.2f - Fahrenheit \n", Temperatura);

                        break;
                    case 2:

                        Temperatura = Temperatura + 273.15;

                        System.out.printf("Nova temperatura: %.2f - Kelvin \n", Temperatura);

                        break;
                }
                break;
            //-------------
            case 3:

                System.out.printf("Escolha a nova escala: \n1 - Fahrenheit \n2 - Celcius \n");

                Escala =  Teclado.nextInt();
                switch (Escala) {
                    case 1:
                        Temperatura = Temperatura * (1.8) + 32;

                        System.out.printf("Nova temperatura: %.2f - Fahrenheit \n", Temperatura);

                        break;
                    case 2:

                        Temperatura = (1.8) * (Temperatura - 273) + 32;

                        System.out.printf("Nova temperatura: %.2f - Celcius \n", Temperatura);

                        break;
                }
                break;
        }
    }
}

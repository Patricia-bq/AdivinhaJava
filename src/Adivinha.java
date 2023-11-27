import java.util.Random;
import java.util.Scanner;

public class Adivinha {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numeroGerado = 20; //new Random().nextInt(50);
        int numero = 0;
        int chutes = 0;
        int chances = 5;

        while (chutes < chances) {
            System.out.println("Por favor, digite um número:");
            numero = leitura.nextInt();
            chutes ++;

            if (numero == numeroGerado){
                System.out.println("Você digitou:" + numeroGerado + "! Parabéns, você acertou!");
                break;
            } else if (numero < numeroGerado){
                System.out.println("Você digitou um número menor!");
                System.out.println("______________________________________");

            } else {
                System.out.println("Você digitou um número maior!");
                System.out.println("______________________________________");
            }
        }
        if (chutes == chances)
        System.out.println("Que pena! Suas tentativas acabaram:");
    }
}

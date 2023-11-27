import java.util.Scanner;

public class Condicionais {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double nota = 0;
        double mediaNota = 0;
        int quantidadeNota = 0;

        while (nota != -1) {
            System.out.println("digite sua nota para o filme ou -1 para encerrar:");
            nota = leitura.nextInt();
            if (nota != -1){
                mediaNota += nota;
                quantidadeNota++;
            }
        }

        if (mediaNota == 0){
            System.out.println("Sem nota");
        } else
            System.out.println("Media: " + mediaNota / quantidadeNota + "!");
    }
}

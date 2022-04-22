import java.util.Scanner;

public class repeticao {
    public static void main(String[] args) {

        Scanner leitoScanner = new Scanner(System.in);

        char desejaContinuar = 'S';

        while (desejaContinuar == 'S' || desejaContinuar == 's') {

            System.out.print("Digite um numero: ");
            int numero = leitoScanner.nextInt();
            if (numero == 0) {
                  System.out.println("O numero é zero");
            }else {
              if (numero > 0) {
                  System.out.println("O numero é maior que zero");
              }else {
                  System.out.println("O numero é menor que zero");
              }
            }
            System.out.println("Deseja continuar? S - Sim / N - Não");
            desejaContinuar = leitoScanner.next().charAt(0);
        }

    }
}

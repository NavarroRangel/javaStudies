import java.util.Random;
import java.util.Scanner;

public class JogoAdvinhacao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100);
        int numeroDeTentativas = 0;
        int numeroDigitado = 0;

        while (numeroDeTentativas < 5){
            System.out.println("Digite um número entre 0 e 100: ");
            numeroDigitado = leitor.nextInt();
            numeroDeTentativas++;
            
            if (numeroDigitado == numeroGerado){
                System.out.println("Parabéns vc acertou");
                break;
            } else if (numeroDigitado < numeroGerado) {
                System.out.println("O numero digitado é menor que o número gerado");
                
            } else  {
                System.out.println();
            }
        }
        if (numeroDeTentativas == 5 && numeroDigitado != numeroGerado){
            System.out.println("Voce nao conseugiuy acertar o numero em 5 tentativas!");
        }
    }
}

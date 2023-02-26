import java.util.Scanner;

/*
 * 🔸Nota: Faça um programa que peça uma nota, entre zero e dez.
 *  Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido.
 * 
*/

public class Nota{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;
        int notaEscolhida = 6;
        while(true){
            System.out.println("Informe uma nota de 0 à 10.");
            nota = scan.nextInt();
            if(nota != notaEscolhida){
                System.out.println("Este não é o número certo, informe outro.");
            }
            if(nota == notaEscolhida){
                System.out.println("Você acertou o número dessa vez.");
                break;
            } 
        }
    }
}
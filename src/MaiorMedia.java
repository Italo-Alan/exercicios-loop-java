/*
 * 🔸Maior e Média: Faça um programa que leia 5 números e informe o maior número e a média desses números.
 */

 import java.util.Scanner;

public class MaiorMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int contagem = 0;
        int media;
        int numero;
        int total = 0;
        int maiorNumero = 0;
        do{
            System.out.println("Informe um número: ");
            numero = scan.nextInt();

            total += numero;

            if(numero > maiorNumero) maiorNumero = numero;
            contagem++;
        }while(contagem < 5);

        media = total/5;

        System.out.println("O maior número digitado foi: " + maiorNumero);
        System.out.println("A média dos números digitados foi: " + media);
    }
}

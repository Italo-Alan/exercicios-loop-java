/*
 * 🔸Par e Ímpar: Faça um programa que peça N números inteiros.
 *  Calcule e mostre a quantidade de números pares e a quantidade de números impares.
*/
import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        int qtdVezes = 0;
        int contador = 0;
        int qtdPares = 0;
        int qtdImpares = 0;
        int numero = 0;


        Scanner scan = new Scanner(System.in);
        System.out.println("Quantas vezes deseja repetir esse processo ?");
        qtdVezes = scan.nextInt();

        do{
            System.out.println("Digite um número inteiro:");
            numero = scan.nextInt();
            if(numero%2 ==0) qtdPares++;
            if(numero%2 !=0) qtdImpares++;
            contador++;
        }while(contador < qtdVezes);

        System.out.println("Foram digitados " + qtdPares + " numeros pares.");
        System.out.println("Foram digitados " + qtdImpares + " numeros impares.");

    }
}

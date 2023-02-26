/*
 * 🔸Fatorial: Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
    Ex.: 5!=5.4.3.2.1=120
*/

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("De qual número você deseja saber o fatorial ?");
        
        int fatorial = scan.nextInt();
        int multiplicacao = 1;
        for(int i = fatorial; i >= 1; i--){
            multiplicacao = multiplicacao * i;
        }

        System.out.println("O fatorial do número " + fatorial + " é: " + multiplicacao);

    }
}

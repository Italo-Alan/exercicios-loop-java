import java.util.Scanner;

/*
    🔸Nome e Idade: Faça um programa que leia conjuntos de dois valores,
    o primeiro representando o nome do aluno e o segundo representando a sua idade.
    (Pare o programa inserindo o valor 0 no campo nome).
*/
public class NomeIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while(true){
            System.out.println("Digite o seu nome: ");
            nome = scan.next();

            if(nome.equals("0")) break;

            System.out.println("Digite a sua idade: ");
            idade = scan.nextInt();
            if(nome.equals("0")) break;
    
            System.out.println("Digite sua idade: ");
            idade = scan.nextInt();
        }
    }
}

package exercicios.exercicio_1.carro;

import java.util.Scanner;

public class EntrarCarro {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Carro carro = new Carro();


        Integer entrarNoCarro = 0;
        Integer lugaresDisponiveis = carro.getLugaresNoCarro() - carro.getPessoasNoCarro();

        System.out.println("Este carro possui: " + carro.getLugaresNoCarro() + " lugares no total.");
        System.out.println("Este carro possui: " + carro.getPessoasNoCarro() + " pessoas dentro no momento.");
        System.out.println("Este carro possui: " + lugaresDisponiveis + " lugares disponiveis.");

        if (lugaresDisponiveis >= 1){
            System.out.println("Digite quantas pessoas vão entrar no carro");
            entrarNoCarro = leitor.nextInt();
            if (entrarNoCarro <= lugaresDisponiveis && entrarNoCarro >= 1){
                System.out.println("Este carro agora possui: " + (carro.getPessoasNoCarro() + entrarNoCarro) + " pessoas dentro no momento.");
            }else{
                System.out.println("O valor digitado é invalido.");
            }

        }else{
            System.out.println("Não há vagas disponiveis neste carro!");
        }






    }
}

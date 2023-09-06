package application;

import entities.Funcionario;

import java.util.Scanner;


import static entities.Funcionario.finalizarMenu;
import static entities.Gerente.*;

public class ExecutoraFuncionario {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("BEM-VINDO A EMPRESA!");
        System.out.println();
        System.out.println("DIGITE SEUS DADOS: ");
        System.out.println();
        System.out.println("NOME ");
        String nome = sc.nextLine();
        System.out.println("CPF ");
        String cpf = sc.nextLine();
        System.out.println("SALÁRIO ");
        double salario = sc.nextDouble();
        Funcionario funcionario = new Funcionario(nome, cpf, salario);
        System.out.println();

        System.out.println("QUAL O SEU CARGO NA EMPRESA?");
        System.out.println("1 - GERENTE");
        System.out.println("2 - ESTAGIÁRIO");
        System.out.println("3 - SECRETÁRIA");

        for (int i = 0; i < 2; i++) {
            System.out.println();
        }

        System.out.println("----------------------------------------------------");
        System.out.println("4 - FINALIZAR PROGRAMA");
        int leitorMenu = sc.nextInt();


        if (leitorMenu < 0 || leitorMenu > 4) {
            System.out.println("NÓS TEMOS APENAS 4 OPÇÕES!");
        } else {

            do {
                if (leitorMenu == 1) {
                    System.out.println();
                    System.out.println("CERTO " + funcionario.getNome() + ", COMO GERENTE VOCÊ PODE FAZER ESSAS AÇÕES: ");
                    System.out.println("1 - DIGITE OS OBJETIVOS DA EMPRESA");
                    System.out.println("2"); // alguma funcionalidade para gerente.(essa funcionalidade é um método)
                    System.out.println("3 - VISUALIZAR POSSÍVEL AUMENTO");
                    System.out.println("4 - FINALIZAR AÇÕES");
                    int scMenuGerente = sc.nextInt();

                    if (scMenuGerente < 0 || scMenuGerente > 4) {
                        System.out.println("O GERENTE TEM APENAS 3 AÇÕES!");
                    } else {
                        if (scMenuGerente == 1) {
                            System.out.println();
                            objetivos();
                            System.out.println();
                        } else if (scMenuGerente == 2) {
                            // aqui vai estar o método que corresponde a opçao 2. (execução do método 2)
                        } else if(scMenuGerente ==3 ){
                            System.out.println();
                            System.out.println();
                            System.out.println();
                        } else {
                            finalizarMenu();
                        }
                        voltarMenuGerente();

                    }
                }

            } while (leitorMenu == 1);
        }
    }
}
       /* } else if (leitorMenu == 2) {
            System.out.println();
            System.out.println("CERTO " + funcionario.getNome() + ", COMO ESTAGIÁRIO VOCÊ PODE FAZER ESSAS AÇÕES: ");
            System.out.println("1"); // alguma funcionalidade para estagiário.(essa funcionalidade é um método)
            System.out.println("2"); // alguma funcionalidade para estagiário.(essa funcionalidade é um método)
            int scMenuEstagiario = sc.nextInt();

            if (scMenuEstagiario < 0 || scMenuEstagiario > 2) {
                System.out.println("O ESTAGAIRIO TEM APENAS 2 AÇÕES!");
            } else {
                if (scMenuEstagiario == 1) {
                    // aqui vai estar o método que corresponde a opçao 1. (execução do método 1)
                } else {
                    // aqui vai estar o método que corresponde a opçao 1. (execução do método 1)
                }
            }
        } else if (leitorMenu == 3) {
            System.out.println();
            System.out.println("CERTO " + funcionario.getNome() + ", COMO SECRETÁRIA VOCÊ PODE FAZER ESSAS AÇÕES: ");
            System.out.println("1"); // alguma funcionalidade para secretária.(essa funcionalidade é um método)
            System.out.println("2"); // alguma funcionalidade para secretária.(essa funcionalidade é um método)
            int scMenuSecretaria = sc.nextInt();

            if (scMenuSecretaria < 0 || scMenuSecretaria > 2) {
                System.out.println("A SECRETÁRIA TEM APENAS 2 AÇÕES!");
            } else {
                if (scMenuSecretaria == 1) {
                    // aqui vai estar o método que corresponde a opçao 1. (execução do método 1)
                } else {
                    // aqui vai estar o método que corresponde a opçao 2. (execução do método 2)
                }
            }


        } else {
            finalizarMenu();
        }


    }


}

}*/
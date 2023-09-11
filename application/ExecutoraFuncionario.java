package application;

import entities.Desenvolvedor;
import entities.Gerente;
import entities.ProductOwner;

import java.text.ParseException;
import java.util.Scanner;


import static entities.Funcionario.finalizarMenu;
import static entities.Gerente.*;

public class ExecutoraFuncionario {

    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("BEM-VINDO A EMPRESA DEVMASTERS!");
        System.out.println();

        System.out.println("QUAL O SEU CARGO NA EMPRESA?");
        System.out.println("1 - GERENTE");
        System.out.println("2 - DESENVOLVEDOR");
        System.out.println("3 - SCRUM MASTER");
        int scCargo = sc.nextInt();

        if (scCargo < 0 || scCargo > 3) {
            finalizarMenu();
        } else {

            if (scCargo == 1) {
                System.out.println();
                System.out.println("DIGITE SEUS DADOS: ");
                System.out.println("NOME ");
                sc.nextLine();
                String nome = sc.nextLine();
                System.out.println("CPF ");
                String cpf = sc.nextLine();
                System.out.println("SALÁRIO ");
                double salario = sc.nextDouble();
                Gerente gerente = new Gerente(nome, cpf, salario);
                System.out.println();

                int acoesGerente = 0;
                do {
                    System.out.println();
                    System.out.println("CERTO " + gerente.getNome() + ", COMO GERENTE VOCÊ PODE FAZER ESSAS AÇÕES: ");
                    System.out.println("1 - DIGITE OS OBJETIVOS DA EMPRESA");
                    System.out.println("2 - MARCAR REUNIÃO");
                    System.out.println("3 - VISUALIZAR POSSÍVEL AUMENTO");
                    System.out.println("4 - FINALIZAR AÇÕES");
                    int scMenuGerente = sc.nextInt();

                    if (scMenuGerente < 0 || scMenuGerente > 4) {
                        System.out.println("O GERENTE TEM APENAS 4 AÇÕES!");
                    } else {
                        if (scMenuGerente == 1) {
                            System.out.println();
                            objetivos();
                            System.out.println();
                        } else if (scMenuGerente == 2) {
                            System.out.println();
                            gerente.marcarReuniao();
                        } else if (scMenuGerente == 3) {
                            System.out.println();
                            System.out.println(gerente.aumentoSalarial());
                            System.out.println();
                        } else {
                            finalizarMenu();
                        }
                        voltarMenuGerente();

                    }
                } while (acoesGerente == 0);

            } else if (scCargo == 2) {
                System.out.println();
                System.out.println("DIGITE SEUS DADOS: ");
                System.out.println();
                System.out.println("NOME ");
                sc.nextLine();
                String nome = sc.nextLine();
                System.out.println("CPF ");
                String cpf = sc.nextLine();
                System.out.println("SALÁRIO ");
                double salario = sc.nextDouble();
                Desenvolvedor desenvolvedor = new Desenvolvedor(nome, cpf, salario);
                System.out.println();
                System.out.println();

                int acoesDesenvolvedor = 0;
                do {
                    System.out.println("CERTO " + desenvolvedor.getNome() + ", COMO DESENVOLVEDOR VOCÊ PODE FAZER ESSAS AÇÕES: ");
                    System.out.println("1 - LINGUAGENS APRENDIDAS");
                    System.out.println("2 - PROJETOS ");
                    System.out.println("3 - VISUALIZAR POSSÍVEL AUMENTO");
                    System.out.println("4 - FINALIZAR AÇÕES");
                    int scMenuDesenvolvedor = sc.nextInt();

                    if (scMenuDesenvolvedor < 0 || scMenuDesenvolvedor > 4) {
                        System.out.println("O DESENVOLVEDOR TEM APENAS 4 AÇÕES!");
                    } else {
                        if (scMenuDesenvolvedor == 1) {
                            desenvolvedor.linguagemAprendidas();
                        } else if (scMenuDesenvolvedor == 2) {
                            desenvolvedor.projetosEmAndamento();
                        } else if (scMenuDesenvolvedor == 3) {
                            System.out.println();
                            System.out.println(desenvolvedor.aumentoSalarial());
                            System.out.println();
                        } else {
                            finalizarMenu();
                        }
                    }
                } while (acoesDesenvolvedor == 0);


            } else {
                System.out.println();
                System.out.println("DIGITE SEUS DADOS: ");
                System.out.println();
                System.out.println("NOME ");
                sc.nextLine();
                String nome = sc.nextLine();
                System.out.println("CPF ");
                String cpf = sc.nextLine();
                System.out.println("SALÁRIO ");
                double salario = sc.nextDouble();
                ProductOwner productOwner = new ProductOwner(nome, cpf, salario);
                System.out.println();
                System.out.println();

                int acoesPo = 0;
                do {
                    System.out.println();
                    System.out.println("CERTO " + productOwner.getNome() + ", COMO PRODUCT OWNER VOCÊ PODE FAZER ESSAS AÇÕES: ");
                    System.out.println("1 - CRIAR TAREFAS ");
                    System.out.println("2 - VISUALIZAR POSSÍVEL AUMENTO ");
                    System.out.println("3 - FINALIZAR MENU");
                    int scMenuPo = sc.nextInt();

                    if (scMenuPo < 0 || scMenuPo > 3) {
                        System.out.println("O SCRUM MASTER TEM APENAS 4 AÇÕES!");
                    } else {
                        if (scMenuPo == 1) {

                        } else if (scMenuPo == 2) {
                            System.out.println();
                            System.out.println(productOwner.aumentoSalarial());
                            System.out.println();
                        } else {
                            finalizarMenu();
                        }
                    }
                } while (acoesPo == 0);


            }


        }


    }
}


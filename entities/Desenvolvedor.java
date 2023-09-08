package entities;

import java.awt.font.FontRenderContext;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desenvolvedor extends Funcionario {

    private List<String> linguagem = new ArrayList<>();
    private List<String> listaProjetos = new ArrayList<>();
    ;
    Scanner sc = new Scanner(System.in);

    public Desenvolvedor(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }


    public void linguagemAprendidas() {
        System.out.println();
        System.out.println("DIGITE A QUANTIDADE DE LINGUAGENS DE PROGRAMAÇÃO QUE VOCÊ DOMINA: ");
        int numeroLinguagem = sc.nextInt();

        if (numeroLinguagem <= 0) {
            System.exit(0);
        } else {

            for (int i = 1; i <= numeroLinguagem; i++) {
                System.out.println();
                System.out.println("DIGITE O NOME DA " + i + " LINGUAGEM DE PROGRAMAÇÃO QUE VOCÊ APRENDEU: ");
                sc.nextLine();
                String nomeLinguagem = sc.next();
                linguagem.add(nomeLinguagem);
            }
            System.out.println();
            System.out.println("AQUI ESTÃO AS LINGUAGENS QUE VOCÊ DOMINA: ");
            System.out.println(linguagem);
            System.out.println();
        }
    }

    public void projetosEmAndamento() {
        System.out.println();
        System.out.println("DIGITE O NOME DO PROJETO:");
        sc.nextLine();
        String nomeProjeto = sc.next();
        System.out.println("DIGITE A DURAÇÃO DO PROJETO EM MESES: ");
        int mesesProjeto = sc.nextInt();
        sc.nextLine();
        System.out.println("DIGITE SUA FUNÇÃO NO PROJETO: ");
        String funcaoProjeto = sc.nextLine();

        String descricaoProjeto = "O PROJETO TEM O NOME DE " + nomeProjeto + ", COM A DURAÇÃO DE " + mesesProjeto + " MESES" + ", E A FUNÇÃO DO DESENVOLVEDOR " + Desenvolvedor.super.getNome() + " É " + funcaoProjeto;

        listaProjetos.add(descricaoProjeto);

        System.out.println();
        for (String lista : listaProjetos) {
            System.out.println(lista);
        }
        System.out.println();
    }

    @Override
    public double aumentoSalarial() {
        return super.aumentoSalarial() + getSalario() * 0.15;
    }
}


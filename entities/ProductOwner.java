package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductOwner extends Funcionario {

    private String nomeTarefa;
    private String descricaoTarefa;
    private Integer pontoTarefa;

    List<String> backlogDoProduto = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    public ProductOwner(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }


    public String getNomeTarefa() {
        return nomeTarefa;
    }

    public void setNomeTarefa(String nomeTarefa) {
        this.nomeTarefa = nomeTarefa;
    }

    public String getDescricaoTarefa() {
        return descricaoTarefa;
    }

    public void setDescricaoTarefa(String descricaoTarefa) {
        this.descricaoTarefa = descricaoTarefa;
    }

    public Integer getPontoTarefa() {
        return pontoTarefa;
    }

    public void setPontoTarefa(Integer pontoTarefa) {
        this.pontoTarefa = pontoTarefa;
    }

    @Override
    public final double aumentoSalarial() {
        System.out.println();
        return super.aumentoSalarial() + getSalario() * 0.15;
    }

    public void criarTarefas() {
        System.out.println();
        System.out.println("NOME DA TAREFA: ");
        sc.next();
        String nomeTarefa = sc.nextLine();
        System.out.println("DESCRIÇÃO DA TAREFA: ");
        String descricaoTarefa = sc.nextLine();
        System.out.println("PRIORIDADE DA TAREFA DE ACORDO COM A TABELA DE PONTOS FIBONACCI (1/2/3/5/8/13/21): ");
        int pontoTarefa = sc.nextInt();

        String tarefa = "NOME DA TAREFA: " + nomeTarefa + "\n"
                + "DESCRIÇÃO DA TAREFA: " + descricaoTarefa + "\n"
                + "PRIORIDADE DA TAREFA: " + pontoTarefa;

        backlogDoProduto.add(tarefa);

        System.out.println();
        for (String pb : backlogDoProduto) {
            System.out.println(pb);
            System.out.println();
        }
        System.out.println();
    }
}
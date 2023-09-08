package entities;

import java.util.Scanner;

public class Funcionario {


    private String nome;
    private String cpf;
    private double salario;
    private Integer mesesProjeto;
    private String nomeProjeto;
    private String funcaoProjeto;


    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public void Projeto(String nomeProjeto, String funcaoProjeto, Integer mesesProjeto) {
        this.nomeProjeto = nomeProjeto;
        this.mesesProjeto = mesesProjeto;
        this.funcaoProjeto = funcaoProjeto;
    }
    public String toString() {
        return nome + ", " + cpf + ", " + String.format("%.2f", salario);
    }

    public static void finalizarMenu() {
        System.out.println();
        System.out.println("PROGRAMA FINALIZADO.");
        System.exit(0);
    }

    public double aumentoSalarial() {
        System.out.println("SE TUDO OCORRER BEM, NO FINAL DO ANO VOCÊ VAI UM BÔNUS E SEU SALÁRIO VAI SER:");
        return this.salario = salario + 0;
    }




    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


}

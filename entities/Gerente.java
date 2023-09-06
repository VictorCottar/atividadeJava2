package entities;

import java.util.Scanner;

public class Gerente extends Funcionario {

    private String objetivos;

    static Scanner sc = new Scanner(System.in);

    public Gerente(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }


    public static String objetivos() {
        System.out.println("DIGITE O OBJETIVO DA EMPRESA: ");
        String objetivos = sc.nextLine();
        System.out.println();
        System.out.println("O OBJETIVO DA NOSSA EMPRESA É: " + objetivos);
        return objetivos;
    }

    @Override
    public double aumentoSalarial() {
        return super.aumentoSalarial() + 4000;

    }

    public static int voltarMenuGerente() {

        Scanner sc = new Scanner(System.in);
        int scVoltarMenu;
        int acoesGerente = 0;

        System.out.println("DIGITE 1 PARA RETORNAR AS AÇÕES DO GERENTE: ");
        scVoltarMenu = sc.nextInt();

        if (scVoltarMenu == 1){
            while (acoesGerente != 0);
        }

        return scVoltarMenu;
    }



    public String getObjetivos() {
        return objetivos;
    }

    public void setObjetivos(String metas) {
        this.objetivos = metas;
    }
}

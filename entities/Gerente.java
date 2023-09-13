package entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Gerente extends Funcionario {

    private String objetivos;
    private String marcarReuniao;

    static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    static Scanner sc = new Scanner(System.in);

    public Gerente(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    public static String objetivos() {
        System.out.println();
        System.out.println("DIGITE O OBJETIVO DA EMPRESA: ");
        String objetivos = sc.nextLine();
        System.out.println();
        System.out.println("O OBJETIVO DA NOSSA EMPRESA É: " + objetivos);
        System.out.println();
        return objetivos;
    }

    public String marcarReuniao() throws ParseException {
        System.out.print("PREENCHA OS DADOS PARA MARCAR A REUNIÃO: ");
        System.out.println();
        System.out.println("DATA DA REUNIÃO: (dd/MM/yyyy)");
        Date dataReuniao = sdf.parse(sc.next());
        System.out.println("PAUTA DA REUNIÃO: ");
        sc.nextLine();
        String pauta = sc.nextLine();
        System.out.println();
        System.out.println("REUNIÃO MARCADA PELO GERENTE " + Gerente.super.getNome() + ", NA DATA: " + sdf.format(dataReuniao) + ", COM A PAUTA: " + pauta);
        System.out.println();
        return marcarReuniao;
    }

    @Override
    public double aumentoSalarial() {
        return super.aumentoSalarial() + getSalario() * 0.20;
    }

    public static int voltarMenuGerente() {

        Scanner sc = new Scanner(System.in);
        int scVoltarMenu;
        int acoesGerente = 0;

        System.out.println("DIGITE 1 PARA RETORNAR AS AÇÕES DO GERENTE: ");
        scVoltarMenu = sc.nextInt();

        if (scVoltarMenu == 1) {
            while (acoesGerente != 0) ;
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
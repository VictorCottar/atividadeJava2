package entities;

public class Estagiario extends Funcionario {


    public Estagiario(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }


    @Override
    public double aumentoSalarial() {
        return super.aumentoSalarial() + 1000;
    }
}


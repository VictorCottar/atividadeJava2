package entities;

public class Secretaria extends Funcionario {

    public Secretaria(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }


    @Override
    public double aumentoSalarial() {
        return super.aumentoSalarial() + 2000;
    }
}

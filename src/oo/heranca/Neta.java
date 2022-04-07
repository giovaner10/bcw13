package oo.heranca;

public class Neta extends Filha{

    private boolean isNeto;

    public Neta(int idade, double salario, String nome, boolean filha, boolean isNeto) {
        super(idade, salario, nome, filha);
        this.isNeto = isNeto;
    }

    @Override
    public String getNome() {
        return super.getNome();
    }
}

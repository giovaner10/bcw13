package oo.heranca;

public class Filha extends Pai{

    private boolean filha;


    public Filha(int idade, double salario, String nome, boolean filha) {
        super(idade, salario, nome);
        this.filha = filha;
    }

    @Override
    public String getNome() {
        return super.getNome();
    }
}

package oo.heranca;

public class Pai implements VerificarRg {

    private int idade;
    private  double salario;
    private String nome;

    public Pai(int idade, double salario, String nome) {
        this.idade = idade;
        this.salario = salario;
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    @Override
    public void VerificarNota() {

    }
}

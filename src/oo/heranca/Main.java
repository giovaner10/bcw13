package oo.heranca;

public class Main {

    public static void main(String[] args) {
        Pai pai = new Pai(37, 4000, "nome");
        Pai filha = new Filha(12, 600, "pim", true);
        Pai netaa = new Neta(12, 600, "pim", false, true);


        System.out.println(filha.getNome());
        System.out.println(netaa.getNome());
        netaa.VerificarNota();

    }
}
